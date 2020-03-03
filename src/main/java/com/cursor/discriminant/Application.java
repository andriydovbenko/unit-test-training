package com.cursor.discriminant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        setDiscriminantConfig(context);
        context.close();
    }

    public static void setDiscriminantConfig(ConfigurableApplicationContext context) {
        double firstArgument = 5.25d;
        double secondArgument = 10.8d;
        double thirdArgument = 5.6d;
        var discriminant = context.getBean(Discriminant.class);
        discriminant.setAllArgument(firstArgument, secondArgument, thirdArgument);
        discriminant.checkOut();
    }
}