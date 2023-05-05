package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoHibernateImpl udao = new UserDaoHibernateImpl();

    public void createUsersTable() {
         udao.cleanUsersTable();
    }

    public void dropUsersTable() {
        udao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        udao.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        udao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return udao.getAllUsers();
    }

    public void cleanUsersTable() {
        udao.cleanUsersTable();
    }
}
