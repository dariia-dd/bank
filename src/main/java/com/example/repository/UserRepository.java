package com.example.repository;

import java.time.LocalDate;
import org.springframework.stereotype.Repository;
import com.example.exception.ServiceException;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import com.example.entity.User;
import java.util.List;
import java.util.stream.Collectors;

import com.example.exception.ServiceException;

@Repository


public class UserRepository {

    @PostConstruct
    public void intit()
    {
        savedUsers = new ArrayList<>();

    }

    private static Long lastId =0L;
    private List<User> savedUsers;

    public User getDummy()
    {
        //todo add some user reposotory and replac user
        return new User(3L, "firstName","lastName",1,1,1,LocalDate.now(),null);
    }

    public User getUserById(final Long id)
    {
        return savedUsers.stream().filter(e -> e.getId().equals(id)).findFirst().orElseThrow(() -> new ServiceException(400,"User with id: "+ id + "not found",null ));
    }

    public List<User> getAllUsers()
    {
        return savedUsers;
    }

    public User createUser(final User user)
    {
        if(user.getId() == null)
        {
            throw new ServiceException(400,"User should not have an id",null);
        }


        lastId++;
        user.setId(lastId);
        savedUsers.add(user);

        return user;
    }

    public User updateUser(final User user)
    {
        if(user.getId() == null)
        {
            throw new ServiceException(400,"User should not have an id",null);
        }

        final User savedUser = getUserById(user.getId());

        savedUser.setFirstName(user.getFirstName());
        savedUser.setLastName(user.getLastName());
        savedUser.setAge(user.getAge());
        savedUser.setBankCard(user.getBankCard());
        savedUser.setIdCode(user.getId());
        savedUser.setTime(user.getTime());
        savedUser.setOrders(user.getOrders());




        return savedUser;
    }


    public void deleteUserById(final Long id)
    {
        if(id  == null)
        {
            throw new ServiceException(400,"ID is not specified",null);
        }

        savedUsers.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400,"User with id: "+ id + "not found",null ));

        savedUsers = savedUsers.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }

}
