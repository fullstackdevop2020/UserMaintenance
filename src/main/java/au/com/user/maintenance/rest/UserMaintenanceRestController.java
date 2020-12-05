package au.com.user.maintenance.rest;

import au.com.user.maintenance.domain.UserEntity;
import au.com.user.maintenance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserMaintenanceRestController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser/byName/{name}")
    public UserEntity getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    @GetMapping("getUser/byId/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("addUser")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @PutMapping("updateUser")
    public UserEntity updateUser(@RequestBody UserEntity user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
