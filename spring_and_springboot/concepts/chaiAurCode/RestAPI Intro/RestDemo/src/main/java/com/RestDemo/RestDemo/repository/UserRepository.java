package com.RestDemo.RestDemo.repository;

import com.RestDemo.RestDemo.dto.CreateUserDto;
import com.RestDemo.RestDemo.dto.UserDto;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserRepository implements CommandLineRunner {
    List<UserDto> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }


    @Override
    public void run(String @NonNull ... args) throws Exception {
        users.addAll(List.of(
                new UserDto(UUID.randomUUID().toString(), "John", "John@mail.com"),
                new UserDto(UUID.randomUUID().toString(), "Jane", "Jane@gmail.com"),
                new UserDto(UUID.randomUUID().toString(), "Joe", "Joe@gamil.com"),
                new UserDto(UUID.randomUUID().toString(), "Ankit", "Ankit@gmail.com"),
                new UserDto(UUID.randomUUID().toString(), "Anika", "Anika@gmail.com"),
                new UserDto(UUID.randomUUID().toString(), "Sayan", "Sayan@gmail.com"),
                new UserDto(UUID.randomUUID().toString(), "Saman", "Saman@gamil.com"),
                new UserDto(UUID.randomUUID().toString(), "Uttam", "Uttam@gamil.com"),
                new UserDto(UUID.randomUUID().toString(), "Doggesh", "Doggesh@gmail.com"),
                new UserDto(UUID.randomUUID().toString(), "Ankita", "Ankita@gamil.com")
        ));
    }

    public List<UserDto> getAllUsers() {
        return this.users;
    }

    public UserDto findUserById(String id) {
        return this.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public UserDto saveUser(CreateUserDto createUserDto) {
        this.users.add(new UserDto(UUID.randomUUID().toString(), createUserDto.getName(), createUserDto.getEmail()));
        return this.users.getLast();
    }

    public UserDto updateUser(String id, CreateUserDto updateUserDto) {
        UserDto userDto = this.findUserById(id);
        if (userDto == null) {
            return null;
        }
        userDto.setName(updateUserDto.getName());
        userDto.setEmail(updateUserDto.getEmail());
        return userDto;
    }

    public void deleteUser(String id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
