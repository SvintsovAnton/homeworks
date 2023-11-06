package de.ait.homework45;

import java.util.InputMismatchException;

public class SafelyRetrieving {
    public static void main(String[] args) {

        String[] arrayList;
        arrayList = new String[]{"cat", "dog", "crocodile", "mouse", "cow"};


        System.out.println("Введите индекс элемента для извлечения");
        try {
            int numberChoice = new java.util.Scanner(System.in).nextInt();
            try{
                System.out.println(arrayList[numberChoice]);
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Индекс за пределами границ массива");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Введено не число.");
        }

        System.out.println("Операция поиска завершена");

    }
}
