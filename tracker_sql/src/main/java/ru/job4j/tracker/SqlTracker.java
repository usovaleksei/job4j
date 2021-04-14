package ru.job4j.tracker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {

    private Connection connection;

    private final Logger LOG = LoggerFactory.getLogger(SqlTracker.class.getName());

    @Override
    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (IOException | SQLException | ClassNotFoundException e) {
            LOG.error("Initialization exception", e);
        }

    }

    @Override
    public Item add(Item item) {
        String sql = "insert into items (name) values (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, item.getName());
            statement.execute();
            try (ResultSet rs = statement.getGeneratedKeys()) {
                if (rs.next()) {
                    item.setId(rs.getInt("id"));
                }
            }
        } catch (SQLException e) {
            LOG.error("Error of SQL execute", e);
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        boolean rsl = false;
        String sql = "update items set name = ? where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, item.getName());
            ps.setInt(2, id);
            rsl = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            LOG.error("Error of SQL execute", e);
        }
        return rsl;
    }

    @Override
    public boolean delete(int id) {
        boolean rsl = false;
        String sql = "delete from items where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            rsl = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            LOG.error("Error of SQL execute", e);
        }
        return rsl;
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        String sql = "select * from items";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            Item item = null;
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    item = new Item(rs.getInt("id"), rs.getString("name"));
                    items.add(item);
                }
            }
        } catch (SQLException e) {
            LOG.error("Error of SQL execute", e);
        }
        return items;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> items = new ArrayList<>();
        String sql = "select * from items where name = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, key);
            Item item = null;
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    item = new Item(rs.getInt("id"), rs.getString("name"));
                    items.add(item);
                }
            }
        } catch (SQLException e) {
            LOG.error("Error of SQL execute", e);
        }
        return items;
    }

    @Override
    public Item findById(int id) {
        Item item = null;
        String sql = "select * from items where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    item = new Item(rs.getInt("id"), rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            LOG.error("Error of SQL execute", e);
        }
        return item;
    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}
