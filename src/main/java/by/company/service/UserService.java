package by.company.service;

import by.company.enteties.User;
import by.company.storage.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private List<User> userList;

    @Autowired
    UserStorage userStorage;

    public List<User> save(User user){
        userStorage.addUser(user);
        return userList;
    }

    public User saveUser(User user){
        userStorage.addUser(user);
        return user;
    }

    public User getByName(String username){
        User userByName = userStorage.getUserByName(username);
        return userByName;
    }

    public void login(String username,String userpassword) throws IllegalAccessException {
        userStorage.checkLogin(username,userpassword);
    }

    public boolean updateByName(User user,String username){
        boolean userByName = userStorage.updateUserByName(user,username);
        return userByName;
    }

    public void deleteByName(String username){
       userStorage.deleteUserByName(username);
    }

}
