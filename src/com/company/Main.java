package com.company;

import java.nio.charset.IllegalCharsetNameException;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        try {
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
            runner.start();
            runner.join();
        }catch (IllegalCharsetNameException ex){
            ex.printStackTrace();
        }

    }
}
