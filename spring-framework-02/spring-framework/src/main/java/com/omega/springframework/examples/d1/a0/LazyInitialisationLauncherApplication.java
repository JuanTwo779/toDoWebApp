package com.omega.springframework.examples.d1.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}
@Component
@Lazy //initialisation only occurs when classB object is used
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("Some Initialisation logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Something");
    }

}

@Configuration
@ComponentScan
public class LazyInitialisationLauncherApplication {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext
                (LazyInitialisationLauncherApplication.class)) {

            System.out.println("Initialisation of context is completed");

            context.getBean(ClassB.class).doSomething();

        }

    }
}



