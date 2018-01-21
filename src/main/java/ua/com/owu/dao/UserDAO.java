package ua.com.owu.dao;


import lombok.Setter;
import ua.com.owu.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Setter
public class UserDAO {

    private EntityManagerFactory entityManagerFactory;


    public void save(User user){
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
        manager.close();
        entityManagerFactory.close();
    }

    public void setEntityManagerFactory(EntityManager entityManagerFactory) {
    }
}
