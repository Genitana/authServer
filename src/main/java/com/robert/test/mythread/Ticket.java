package com.robert.test.mythread;

public class Ticket implements  Runnable {
    private  int num = 200 ;
    @Override
    public void run() {

        synchronized(this) {
            while (num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ",抢到了第" + num + "张票");
                num--;
            }
        }
    }


    public static void main(String[] args){
         Ticket ticket = new Ticket();
         Thread thread1 = new Thread(ticket,"黄牛1");
         Thread thread2 = new Thread(ticket,"黄牛2");
         Thread thread3 = new Thread(ticket,"程序员");

         thread1.start();
         thread2.start();
         thread3.start();

         Thread test = new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("test");
             }
         });
    }
}
