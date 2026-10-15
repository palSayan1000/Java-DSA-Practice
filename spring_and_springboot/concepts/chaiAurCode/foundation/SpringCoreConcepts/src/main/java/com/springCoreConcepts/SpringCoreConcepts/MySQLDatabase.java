package com.springCoreConcepts.SpringCoreConcepts;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("dev")
@ConditionalOnProperty(name = "db.type", havingValue = "mysql")
public class MySQLDatabase implements DataBase{
    @Override
    public void saveToDB(String user) {
        System.out.println("MySQLDatabase is saving user: " + user);
    }
}
