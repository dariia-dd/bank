package com.example.mapper;

import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.example.dto.UserDTO;
import com.example.entity.User;

@Component

public class UserToUserDTOMapper {
    public User toEntity(final UserDTO userDTO)
    {
        final User user = new User();

        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setAge(userDTO.getAge());
        user.setBankCard(userDTO.getBankCard());
        user.setIdCode(userDTO.getIdCode());
        user.setTime(userDTO.getTime());
       // user.setOrders(orderList);

        return user;
    }

    public UserDTO toDTO(final User user)
    {
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setAge(user.getAge());
        userDTO.setBankCard(user.getBankCard());
        userDTO.setIdCode(user.getIdCode());
        userDTO.setTime(user.getTime());

        return userDTO;
    }
}
