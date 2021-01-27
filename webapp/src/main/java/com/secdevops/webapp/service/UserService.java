package com.secdevops.webapp.service;

import com.secdevops.webapp.entity.User;
import com.secdevops.webapp.repository.UsersRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

	private final String VERY_SECRET = "49C6FEBD24FAD7376D1438A209101ED224D3DDF7CFF4E7C9A1F1FAED49744C77";

    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public boolean existsUser(User user) {
        return usersRepository.existsById(user.getId());
    }
    //Create, Update
    public User saveUser(User user) {
        return usersRepository.save(user);
    }

    //Read
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    public User getSingleUser(User user) {
        return usersRepository.getOne(user.getId());
    }

    //Delete
    public User deleteUser(User user) {
        usersRepository.delete(user);
        return user;
    }


}
