package com.gmell.springlabone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringLabOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLabOneApplication.class, args);
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee employee=context2.getBean("employeeBean",Employee.class);
        employee.startMyMorning();
        context.close();

    }

    @GetMapping("/hello")
    public String index(@RequestParam(value = "name", defaultValue = "World!") String name) {
        return "Hello " + name;

    }

    @GetMapping("/about")
    public String about() {
        return "amog us";
    }

    @GetMapping("/options")
    public String options(@RequestParam(value = "option") Optional<String> options) {
        if (!options.isPresent()) {
            return "options";
        }
        return "not an option";
    }


}
