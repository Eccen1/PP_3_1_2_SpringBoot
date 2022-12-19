package org.example.PP_3_1_2_SpringBoot.service;



import org.example.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user, int id);

    void deleteUser(int id);
}
