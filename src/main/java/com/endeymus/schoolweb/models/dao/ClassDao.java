package com.endeymus.schoolweb.models.dao;

import com.endeymus.schoolweb.models.tables.ClassSchool;
import com.endeymus.schoolweb.models.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassDao {

    @Autowired
    private HibernateUtil util;

    public ClassSchool findById(int id) {
        try (Session session = util.getSessionFactory().openSession()) {
            return session.get(ClassSchool.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
