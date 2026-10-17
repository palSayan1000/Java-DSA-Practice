package com.springCoreConcepts.SpringCoreConcepts;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("prod")
@ConditionalOnProperty(name = "db.type", havingValue = "postgres")
public class PostgreDatabase implements DataBase {
    @Override
    public void saveToDB(String user) {
        System.out.println("Saved to postgres database: " + user);
    }
}
