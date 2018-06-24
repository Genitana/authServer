package com.robert.test.mythread;


public class Testmain {

    public static void main(String[] args){
         Rabbit rabbit = new Rabbit();
//         Tortoise tortoise = new Tortoise();
        Rabbit2 rabbit2 = new Rabbit2();
        Thread thread2 = new Thread(rabbit2);
        Thread thread3 = new Thread(rabbit2,"兔子3");
         rabbit.start();
//         tortoise.start();
        thread2.start();


    }

}
