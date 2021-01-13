package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.dto.UserDTO;
import com.example.service.UserServiceImpl;
import java.util.List;
@RestController

public class UserResourse {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users/{id}")
    public UserDTO getUserById(final @PathVariable Long id )
    {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<UserDTO> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public UserDTO createUser(final @RequestBody UserDTO userDTO)
    {
        return userService.createUser(userDTO);
    }

    @PutMapping("/users")
    public UserDTO updateUser(final @RequestBody UserDTO userDTO)
    {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(final @PathVariable Long id )
    {
        userService.deleteUserById(id);;
    }
}
