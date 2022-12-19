package org.example.PP_3_1_2_SpringBoot.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.PP_3_1_2_SpringBoot.model.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUserList() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User user, int id) {
        User updatedUser = entityManager.find(User.class, id);

        updatedUser.setName(user.getName());
        updatedUser.setAge(user.getAge());
        updatedUser.setEmail(user.getEmail());
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
