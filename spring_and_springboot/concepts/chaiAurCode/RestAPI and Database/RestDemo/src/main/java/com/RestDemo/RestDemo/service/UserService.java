package com.RestDemo.RestDemo.service;

import com.RestDemo.RestDemo.dto.CreateUserDto;
import com.RestDemo.RestDemo.dto.UserDto;
import com.RestDemo.RestDemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        return this.userRepository.getAllUsers();
    }

    public UserDto findUserById(String id) {
        return this.userRepository.findUserById(id);
    }

    public UserDto createUser(CreateUserDto createUserDto) {
        return userRepository.saveUser(createUserDto);
    }
}
