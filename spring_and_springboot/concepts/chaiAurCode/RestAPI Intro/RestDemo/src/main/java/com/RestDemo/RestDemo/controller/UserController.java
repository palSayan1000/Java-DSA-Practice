package com.RestDemo.RestDemo.controller;

import com.RestDemo.RestDemo.dto.CreateUserDto;
import com.RestDemo.RestDemo.dto.UserDto;
import com.RestDemo.RestDemo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers() {
        return ResponseEntity.ofNullable(this.userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.userService.findUserById(id));
//        return ResponseEntity.ok(userService.findUserById(id));  --> does the same thing.
//        // or
//        return ResponseEntity.ok().body(userService.findUserById(id));
    }

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto createUserDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(createUserDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable String id, @RequestBody CreateUserDto updateUserDto) {
//        return ResponseEntity.ok(userService.updateUser(id, updateUserDto));
        return ResponseEntity.status(HttpStatus.OK).body(userService.updateUser(id, updateUserDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}

// Another way of doing it without using the ResponseEntity<T>
/* --> but with this method you cannot throw errors and 404 (even if error comes 200 and 201 will be passed so the above one is better)
    @GetMapping
    public List<UserDto> getUsers() {
        return userService.getAllUsers();           // 200 by default
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable String id) {
        return userService.findUserById(id);        // 200 by default
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)             // 201
    public UserDto createUser(@RequestBody CreateUserDto dto) {
        return userService.createUser(dto);
    }

    @PutMapping("/{id}")
    public UserDto updateUser(@PathVariable String id, @RequestBody CreateUserDto dto) {
        return userService.updateUser(id, dto);     // 200 by default
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)          // 204
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    // will make a exception class for this
    // the exception part can be done like this to send the 404 error code
    // Exception class: failure case, written once
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String id) {
            super("User not found: " + id);
        }
    }
 */