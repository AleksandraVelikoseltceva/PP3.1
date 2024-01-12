package ru.springboot.pp312.service;

import ru.springboot.pp312.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User show(Integer id);

    void save(User user);

    void update(Integer id, User updatedUser);

    void delete(Integer id);
}
