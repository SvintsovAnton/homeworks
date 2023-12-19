package de.ait.homework60;

public class ThreadRunnable {
    public static void main(String[] args) {
// Используя класс Task из предыдущего задания, создайте и запустите поток.
    Task task1 = new Task("Новая задача выполнена");
    Thread thread1 = new Thread(task1);
    thread1.start();

    //Создайте и запустите три потока, используя класс Task, каждый с разными сообщениями.
        Task task2 = new Task("Приложение удачно запущено");
        Thread thread2 = new Thread(task2);
        thread2.start();

        Task task3 = new Task("Сохранение завершено");
        Thread thread3 = new Thread(task3);
        thread3.start();

    }
}
