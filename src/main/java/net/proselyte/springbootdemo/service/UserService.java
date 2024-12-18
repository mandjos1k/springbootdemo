package net.proselyte.springbootdemo.service;


import net.proselyte.springbootdemo.model.User;

import java.util.List;

public interface UserService {
    User getUser(long id);
    List<User> listUsers();
    void addUser(User user);
    void editUser(User user);
    void removeUser(long id);
}
