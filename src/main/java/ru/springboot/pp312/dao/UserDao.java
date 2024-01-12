package ru.springboot.pp312.dao;

import ru.springboot.pp312.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public User show(Integer id);

    public void save(User user);

    public void update(Integer id, User updatedUser);

    public void delete(Integer id);
}

