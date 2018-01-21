package ua.com.owu.service;

import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;

public class UserService {
    private UserDAO dao;

    public void save(String name, int age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
    }

    public void setDao(UserDAO dao) {
    }
}
