package org.example.PP_3_1_2_SpringBoot.dao;

import org.example.PP_3_1_2_SpringBoot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDAO {

    List<User> getUserList();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User user, int id);

    void deleteUser(int id);
}
