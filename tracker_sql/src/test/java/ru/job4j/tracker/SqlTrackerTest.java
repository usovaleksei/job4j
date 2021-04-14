package ru.job4j.tracker;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SqlTrackerTest {

    public Connection init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            return DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Test
    public void createItem() throws SQLException {
        Store tracker = new SqlTracker(ConnectionRollback.create(this.init()));
        tracker.add(new Item("name"));
        assertThat(tracker.findByName("name").size(), is(1));
    }

    @Test
    public void whenDeleteItem() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("item");
            tracker.add(item);
            tracker.delete(item.getId());
            assertNull(tracker.findById(item.getId()));
        }
    }

    @Test
    public void whenFindById() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("item");
            tracker.add(item);
            Item result = tracker.findById((item.getId()));
            assertThat(result.equals(item), is(true));
        }
    }

    @Test
    public void whenFindByName() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            tracker.add(new Item("item"));
            tracker.add(new Item("second item"));
            tracker.add(new Item("item"));
            List<Item> list = tracker.findByName("item");
            assertThat(list.size(), is(2));
        }
    }

    @Test
    public void whenReplaceByName() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item item = new Item("item");
            Item replacedItem = new Item("replaced item");
            tracker.add(item);
            tracker.replace(item.getId(), replacedItem);
            assertThat(tracker.findByName("replaced item").size(), is(1));
        }
    }

    @Test
    public void findByAllTest() throws Exception {
        try (SqlTracker tracker = new SqlTracker(ConnectionRollback.create(this.init()))) {
            Item firstItem = new Item("first item");
            Item secondItem = new Item("second item");
            tracker.add(firstItem);
            tracker.add(secondItem);
            assertThat(tracker.findAll().size(), is(2));
        }
    }
}
