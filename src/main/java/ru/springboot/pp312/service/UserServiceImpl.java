package ru.springboot.pp312.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.springboot.pp312.dao.UserDao;
import ru.springboot.pp312.entity.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void update(Integer id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    @Transactional
    public void delete(Integer id) {
        userDao.delete(id);
    }

    public User show(Integer id) {
        return userDao.show(id);
    }

}
