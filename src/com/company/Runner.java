package com.company;

public class Runner extends Thread {

    private int number;
    private int number2;

    public int getNumber() {
        return number;
    }


    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    boolean flag = true;

    @Override
    public void run() {
        try {
            System.out.println("Runner 1 took the stick");
            sleep(1000);
            System.out.println("Runner 1 ran to Runner 2");
            sleep(1000);
            System.out.println("Runner 2 took the stick");
            sleep(1000);
            System.out.println("Runner 2 ran to Runner 3");
            sleep(1000);
            System.out.println("Runner 3 took the stick");
            sleep(1000);
            System.out.println("Runner 3 ran to Runner 4");
            sleep(1000);
            System.out.println("Runner 4 took the stick");
            sleep(1000);
            System.out.println("Runner 4 ran to Runner 5");
            sleep(1000);
            System.out.println("Runner 5 took the stick");
            sleep(1000);
            System.out.println("Runner 5 ran to the FINISH! \uD83C\uDFC1\uD83C\uDFC1\uD83C\uDFC1");
            sleep(1000);
            System.out.println("Runner 5 ran to Runner 4");
            sleep(1000);
            System.out.println("Runner 4 took the stick");
            sleep(1000);
            System.out.println("Runner 4 ran to Runner 3");
            sleep(1000);
            System.out.println("Runner 3 took the stick");
            sleep(1000);
            System.out.println("Runner 3 ran to Runner 2");
            sleep(1000);
            System.out.println("Runner 2 took the stick");
            sleep(1000);
            System.out.println("Runner 2 ran to Runner 1");
            sleep(1000);
            System.out.println("Runner 1 took the stick");


        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


    }
}

