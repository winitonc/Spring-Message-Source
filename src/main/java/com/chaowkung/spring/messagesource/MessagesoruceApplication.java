package com.chaowkung.spring.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;

import java.util.Locale;

@SpringBootApplication
public class MessagesoruceApplication implements CommandLineRunner {

    @Autowired
    private MessageSource messageSource;

    public static void main(String[] args) {
        SpringApplication.run(MessagesoruceApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        String welcomeMessage = messageSource
                .getMessage("welcome", new Object[]{"John", "Spring Message Source"}, Locale.getDefault());
        System.out.println(welcomeMessage);
    }
}
