package dk.flaesk.controller;

import dk.flaesk.model.User;
import dk.flaesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @RequestMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping("/list/{id}")
    public User findOne(@PathVariable Long id) {
        return userService.findOne(id);
    }

    @RequestMapping("/list")
    public List<User> userList() {
        return userService.userList();
    }


}

