package com.company;

import java.nio.charset.IllegalCharsetNameException;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <9 ; i++) {
            Runner runner = new Runner();
            runner.start();
            runner.join();
        }



    }
}
