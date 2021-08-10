package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HbmTracker implements Store, AutoCloseable {

    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(this.registry)
            .buildMetadata().buildSessionFactory();
    private static final Logger LOG = LoggerFactory.getLogger(HbmTracker.class.getName());

    @Override
    public void init() {

    }

    @Override
    public Item add(Item item) {
        Session session = this.sf.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
        session.close();
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        item.setId(id);
        try {
            Session session = this.sf.openSession();
            session.beginTransaction();
            session.update(item);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            LOG.error("Item for replace not found");
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            Session session = this.sf.openSession();
            session.beginTransaction();
            Item item = session.load(Item.class, id);
            System.out.println(item);
            session.delete(item);
            session.getTransaction();
            session.close();
            return true;
        } catch (Exception e) {
            LOG.error("Item not found");
        }
        return false;
    }

    @Override
    public List<Item> findAll() {
        Session session = this.sf.openSession();
        session.beginTransaction();
        List result = session.createQuery("from ru.job4j.tracker.Item").list();
        session.getTransaction();
        session.close();
        return result;
    }

    @Override
    public List<Item> findByName(String key) {
        Session session = this.sf.openSession();
        session.getTransaction();
        List result = session.createQuery("from ru.job4j.tracker.Item where name = :name").setParameter("name", key).list();
        session.close();
        return result;
    }

    @Override
    public Item findById(int id) {
        Session session = this.sf.openSession();
        session.beginTransaction();
        Item result = session.get(Item.class, id);
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public void close() throws Exception {
        StandardServiceRegistryBuilder.destroy(this.registry);
    }
}
