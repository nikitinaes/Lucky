package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

    @Service
    @Transactional
    public class UserServiceImpl implements UserService {

        private final UserDao userDao;

        @Autowired
        public UserServiceImpl(UserDao userDAO) {
            this.userDao = userDAO;
        }

        @Override
        public List<User> getUsers() {
            return userDao.getUsers();
        }

        @Override
        public User getUserById(long id) {
            return userDao.getUserById(id);
        }

        @Override
        public void deleteUser(long id) {

        }

        @Override
        public void editUser(User user) {

        }

        @Override
        public void addUser(User user) {
            userDao.addUser(user);
        }


    }

