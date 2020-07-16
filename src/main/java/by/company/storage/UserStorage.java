package by.company.storage;

import by.company.enteties.User;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class UserStorage {

    Connection connection = null;
    private final String url = "jdbc:postgresql://localhost:5432/users";

    public boolean addUser(User user){
        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users111 values (?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(2,user.getUsername());
            preparedStatement.setString(3,user.getFirstName());
            preparedStatement.setString(4,user.getLastName());
            preparedStatement.setString(5,user.getEmail());
            preparedStatement.setString(6,user.getPassword());
            preparedStatement.setString(7,user.getPhone());
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User getUserByName(String username){
        int id = 0;
        String name = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = null;
        String phone = null;

        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("select *from users111 u where u.username = ?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                id = resultSet.getInt(1);
                name = resultSet.getString(2);
                firstName = resultSet.getString(3);
                lastName = resultSet.getString(4);
                email = resultSet.getString(5);
                password = resultSet.getString(6);
                phone = resultSet.getString(7);
            }
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        User newUser = new User(id,name,firstName,lastName,email,password,phone);
        return newUser;
    }

    public void checkLogin(String username,String password) throws IllegalAccessException {
        String logName = null;
        String logPassword = null;
        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("select username,password from users111 u where u.username = ? AND u.password = ?");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                logName = resultSet.getString(1);
                logPassword = resultSet.getString(2);
            }
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!(logName.equals(username) || logPassword.equals(password))){
            throw new IllegalAccessException();
        }
    }

    public boolean updateUserByName(User user,String username){

        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("update users111 set username = ? , password = ? where username = ?");
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,username);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void deleteUserByName(String username){

        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from users111 u where u.username = ?");
            preparedStatement.setString(1,username);
            preparedStatement.execute();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
