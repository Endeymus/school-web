package com.endeymus.schoolweb.models.dao;

import com.endeymus.schoolweb.models.tables.Children;
import com.endeymus.schoolweb.models.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

@Component
public class ChildrenDao {

    @Autowired
    private HibernateUtil util;

    public Children findById(int id) {
        try (Session session = util.getSessionFactory().openSession()) {
            return session.get(Children.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Children findByName(String name) {
        try (Session session = util.getSessionFactory().openSession()){
            return session.get(Children.class, name);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public List<Children> findAllChildrenByClass(Integer id) {
        try (Session session = util.getSessionFactory().openSession()) {
//            Query query = session.createQuery("from Children");
            Query query = session.createQuery("from Children where class_name = :id").setParameter("id", id);
            return (List<Children>) query.getResultList();
        }
    }
}
