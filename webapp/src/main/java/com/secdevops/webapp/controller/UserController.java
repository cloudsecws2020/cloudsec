package com.secdevops.webapp.controller;
import java.util.List;

import com.secdevops.webapp.entity.User;
import com.secdevops.webapp.links.Links;
import com.secdevops.webapp.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UserController {
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping(path = Links.CREATE_OR_UPDATE_USER)
    public ResponseEntity<?> createOrUpdateUser(@RequestBody User user) {
        log.info("UsersController: creates or updates user " + user.getId());
        User resource = userService.saveUser(user);
        log.info("User " + user.getId() + " successfully created or updated");
        return ResponseEntity.ok(resource);
    }

    @GetMapping(path = Links.READ_ALL_USERS)
    public ResponseEntity<?> readUsers() {
        log.info("UsersController: reads all users");
        List<User> resource = userService.getAllUsers();
        return ResponseEntity.ok(resource);
    }

    @GetMapping(path = Links.READ_SINGLE_USER)
    public ResponseEntity<?> readSingleUser(@RequestBody User user) {
        log.info("UsersController: reads all users");
        User resource = userService.getSingleUser(user);
        return ResponseEntity.ok(resource);
    }

    @GetMapping(path = Links.DELETE_USER)
    public ResponseEntity<?> deleteSingleUser(@RequestBody User user) {
        log.info("UsersController: delete user " + user.getId());
        User resource = userService.deleteUser(user);
        log.info("User " + user.getId() + " successfully deleted.");
        return ResponseEntity.ok(resource);
    }
}
