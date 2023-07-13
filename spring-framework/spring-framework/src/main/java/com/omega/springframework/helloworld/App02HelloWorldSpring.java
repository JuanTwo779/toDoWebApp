package com.omega.springframework.helloworld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        //1. Launch a Spring Context
        try(var context =
                    new AnnotationConfigApplicationContext
                            (HelloWorldConfiguration.class)){
            //2. Configure the things we want Spring to manage - @Configuration class

            //3. Retrieve Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("address2")); //name of bean to retrieve

            System.out.println(context.getBean("person2MethodCall"));

            System.out.println(context.getBean("person3Parameters"));

            System.out.println(context.getBean(Person.class)); //type of bean to retrieve

            System.out.println(context.getBean(Address.class)); //type of bean to retrieve

            System.out.println(context.getBean("person5Qualifier"));

            //All Beans
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
        }






    }
}
