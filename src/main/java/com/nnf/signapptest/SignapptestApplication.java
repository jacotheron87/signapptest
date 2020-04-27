package com.nnf.signapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SignapptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SignapptestApplication.class, args);
        PrintThread p1 = new PrintThread("hello T1");
        PrintThread p2 = new PrintThread("hello T2");
        p1.start();
        System.out.println("Thread1 isAlive? --> " + p1.isAlive());
        p2.start();
        System.out.println("Thread2 isAlive? --> " + p2.isAlive());
        p2.print();
        p1.print();
    }

}
