package rikkei.acadmy.service;

import rikkei.acadmy.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> selectAllUsersOrderByName();
    public List<User> selectAllUsersByCountry(String country);
}
