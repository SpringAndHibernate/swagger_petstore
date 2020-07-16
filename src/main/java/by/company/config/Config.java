package by.company.config;

import by.company.enteties.Pet;
import by.company.enteties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public List<Pet> petList(){
        return new ArrayList<>();
    }

    @Bean
    public List<User> userList(){
        return new ArrayList<>();
    }
}
