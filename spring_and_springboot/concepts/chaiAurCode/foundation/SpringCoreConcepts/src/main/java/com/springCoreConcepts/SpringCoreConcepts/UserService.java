package com.springCoreConcepts.SpringCoreConcepts;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final DataBase dataBase;
    private final Configurations configuration;

    @Autowired
    public UserService(DataBase dataBase, Configurations configuration) {
        this.dataBase = dataBase;
        this.configuration = configuration;
    }

    public void saveUser(String user) {
        System.out.println("User service is saving user: " + user + " with property: " + configuration.getType());
        dataBase.saveToDB(user);
    }

    public DataBase getDataBase() {
        return dataBase;
    }
}
