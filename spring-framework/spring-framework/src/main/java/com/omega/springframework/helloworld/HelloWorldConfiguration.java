package com.omega.springframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){}; //From JDK 16; class with get/set/cons/toString

record Address (String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    //The things that are managed by Spring are called Spring Beans.
    //Beans can be used to build other beans

    @Bean
    public String name() {
        return "Juan";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Antonio", 23, new Address("Main Street", "Utrecht"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    //injects the method address3
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    @Primary //returned when class type Person is called
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }

    @Bean
    //injects qualifier
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "address2") //rename bean from address --> address2
    @Primary
    public Address address() {
        return new Address("Hosier Lane", "Melbourne");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier") //Qualifier for injection
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }

}
