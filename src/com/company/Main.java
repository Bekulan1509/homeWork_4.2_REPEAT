package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
  Runner runner = new Runner();
  runner.start();
  runner.join();
    }
}
