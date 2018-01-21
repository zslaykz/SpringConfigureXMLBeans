package ua.com.owu.run;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.owu.service.UserService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:/META-INF/context.xml");
        System.out.println("name age");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();


        UserService userService = context.getBean(UserService.class);
        userService.save(name, age);
        context.close();
    }
}
