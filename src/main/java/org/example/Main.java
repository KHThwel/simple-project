package org.example;

import org.example.bean.Address;
import org.example.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Kyawt Hsu Thwel");
//        Address address =new Address();
//        address.setCity("Dream Land");
//        student.setAddress(address);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       context.registerShutdownHook();
       Student student = context.getBean(Student.class);

        student.printInfo();

    }
}