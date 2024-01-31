package org.example.bean;

public class Student {
    private Address address;
    private String name;

//    public Student(Address address) {
//        this.address = address;
//    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println(
                String.format("%s lives in %s.",name,address.getCity())
        );

    }
}
