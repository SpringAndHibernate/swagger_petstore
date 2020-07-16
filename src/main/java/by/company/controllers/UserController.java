package by.company.controllers;

import by.company.enteties.User;
import by.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/createWithList")
    public ResponseEntity<List<User>> createListOfUsers(@RequestBody User user){
        List<User> save = userService.save(user);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User myUser = userService.saveUser(user);
        return new ResponseEntity<>(myUser, HttpStatus.OK);
    }

    @GetMapping(path = "/{username}")
    public ResponseEntity<User> get(@PathVariable (name = "username") String username){
        User byName = userService.getByName(username);
        return new ResponseEntity<>(byName,HttpStatus.OK);
    }

    @GetMapping(path = "/login")   //потом добавлю остальное
    public ResponseEntity<String> login(@RequestParam String name,
                                         @RequestParam String password) throws IllegalAccessException {
        userService.login(name, password);
        return new ResponseEntity<>("successful reg! ",HttpStatus.OK);
    }

    @GetMapping(path = "/logout")   //потом добавлю остальное
    public ResponseEntity<String> logout(HttpSession httpSession){
        httpSession.invalidate();
         return new ResponseEntity<>("logout!",HttpStatus.OK);
    }

    @PutMapping(path = "/{username}")
    public ResponseEntity<String> update(@RequestBody User user,@PathVariable (name = "username") String username){
        userService.updateByName(user,username);
        return new ResponseEntity<>("update! ",HttpStatus.OK);
    }

    @DeleteMapping(path = "/{username}")
    public ResponseEntity<String> delete(@PathVariable (name = "username") String username){
        userService.deleteByName(username);
        return new ResponseEntity<>("delete!",HttpStatus.OK);
    }
}
