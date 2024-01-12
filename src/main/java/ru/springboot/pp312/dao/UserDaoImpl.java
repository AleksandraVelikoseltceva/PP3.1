package ru.springboot.pp312.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.springboot.pp312.entity.User;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAll() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User show(Integer id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);

    }

    @Override
    public void update(Integer id, User updatedUser) {
        entityManager.merge(updatedUser);
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(show(id));
    }
}
