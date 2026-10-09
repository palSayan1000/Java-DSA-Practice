package io.aiven.spring.mysql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/project")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody User addNewUser(@RequestBody String name
                ,@RequestBody String email) {

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
