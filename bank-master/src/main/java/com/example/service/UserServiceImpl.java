package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import com.example.dto.UserDTO;
import com.example.entity.User;
import com.example.mapper.UserToUserDTOMapper;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserDTOMapper userMapper;

    public UserDTO getDummy()
    {
        final User dummy = userRepository.getDummy();

        return userMapper.toDTO(dummy);
    }

    public UserDTO getUserById(final Long id)
    {
        return userMapper.toDTO(userRepository.getUserById(id));

    }

    public List<UserDTO> getAllUsers()
    {
        return userRepository.getAllUsers().stream()
                .map(e -> userMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    public UserDTO createUser( final UserDTO userDTO)
    {
        return userMapper.toDTO(userRepository.createUser(userMapper.toEntity(userDTO)));

    }

    public UserDTO updateUser(final UserDTO userDTO)
    {
        return  userMapper.toDTO(userRepository.updateUser(userMapper.toEntity(userDTO)));

    }

    public void deleteUserById(final Long id)
    {
        userRepository.deleteUserById(id);
    }

}
