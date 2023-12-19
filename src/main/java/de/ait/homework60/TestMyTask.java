package de.ait.homework60;

public class TestMyTask {
    public static void main(String[] args) {
        MyTask myTask1= new MyTask("Stream 1");
        Thread thread1 = new Thread(myTask1);

        MyTask myTask2 = new MyTask("Stream 2");
        Thread thread2 = new Thread(myTask2);

        thread1.start();
        thread2.start();
    }

}
