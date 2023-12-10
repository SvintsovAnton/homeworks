package de.ait.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaHomework {
    public static void main(String[] args) {
        List<String> myString = Arrays.asList("Arbeit", "Work","Hund","Katze","Auto");
        filtrString(myString,"A");


        List<Integer> myInteger = Arrays.asList(1,54,5,6,8,45,25);
        conversionInSquare(myInteger);

        evenNumbers(myInteger);

        printElements(myInteger);

        uppercase(myString);



    }

    //Фильтрация списка: Создайте список строк. Используя лямбда-выражения и метод filter из Stream API, отфильтруйте
    // и выведите на экран все строки, которые начинаются на букву "А".
    public static void filtrString(List<String> listOfString, String beginWith){
        List<String> newString = listOfString.stream().filter(string->string.startsWith(beginWith)).collect(Collectors.toList());
        System.out.println(newString);
    }

    //Преобразование элементов списка: Имеется список целых чисел. Используя лямбда-выражение,
    // преобразуйте каждое число в его квадрат и сохраните результаты в новом списке.


    public static  void conversionInSquare(List<Integer> listOfInt){
        List<Integer> newListOfInteger = listOfInt.stream().map(element->element*element).collect(Collectors.toList());
        System.out.println(newListOfInteger);
    }

    //Лямбда-выражение для работы с потоком данных: Используя поток данных (Stream) из списка целых чисел,
    // напишите лямбда-выражение для фильтрации всех четных чисел и их последующего вывода на экран.


    public static void evenNumbers(List<Integer> listOfInt){
        List<Integer> newListOfInteger = listOfInt.stream().filter(element->element%2==0).collect(Collectors.toList());
        System.out.println(newListOfInteger);
    }

    //Использование forEach с лямбда-выражениями: Имеется список целых чисел. Используя лямбда-выражение в методе forEach,
    // напечатайте каждый элемент списка.

    public static void printElements(List<Integer> listOfInteger){
        listOfInteger.forEach(element-> System.out.println(element));
    }

    //Работа с потоками (Streams): Используйте потоки для обработки коллекций с помощью лямбда-выражений,преобразуйте все строки в списке в верхний регистр.

    public static void uppercase(List<String> listOfString){
        List<String> newListOfString = listOfString.stream().map(element->element.toUpperCase()).collect(Collectors.toList());
        System.out.println(newListOfString);
    }

}
