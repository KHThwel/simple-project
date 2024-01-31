package org.example;

import org.example.bean.Address;
import org.example.bean.Student;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public Student student(){
        Student student = new Student();
        student.setName("William ");
        student.setAddress(address());
        return student;
    }
    public Address address(){
        Address address = new Address();
        address.setCity("Dream Land");
        return address;
    }
}
