package de.ait.homework60;

//Задача: Создайте класс Task, который реализует интерфейс Runnable. В методе run(), должно выводиться сообщение "Задача выполнена".
//Модифицируйте класс Task, чтобы он принимал строковый параметр в конструкторе и выводил эту строку в методе run().
public class Task implements Runnable {

    private String myString;

    public Task(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public void run() {
        System.out.println(myString);
    }
}
