package de.ait.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUtil {
    //(arguments ->{body}
    //Runnable, Callable, Comparator, Consumer,Supplier, Funcions
    public static void main(String[] args) {
        //
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.forEach(element->System.out.println(element));


        List<Integer> numbers = Arrays.asList(4,12,54,9,7,22,76,34,5,3,9);
        List<Integer> numbersSelected = numbers.stream().filter(number->number>10).collect(Collectors.toList());
        System.out.println(numbersSelected);


        List<Integer> integerList = Arrays.asList(4,6,3,8,9,34,56,87,77,21,43);
        int sum = integerList.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);


        List<String> stringList = Arrays.asList("Hallo, Java");
        List<Integer> wordsLength =  stringList.stream().map(String::length).toList();
        System.out.println(wordsLength);

        List<String> listWords = new ArrayList<>(); //Arrays.asList("Hello","Java","Hello","Python");
        listWords.add("Hello");
        listWords.add("Java");
        listWords.add("Hello");
        listWords.add("Python");

        boolean result = listWords.removeIf(word->word.startsWith("J"));
        System.out.println(result);

        System.out.println(listWords);

        List<Integer> integerListNumbners = Arrays.asList(4,6,3,8,9,34,56,87,77,21,43);
        int number = Collections.max(integerListNumbners,Integer::compare);
        System.out.println(number);

        System.out.println("********************");











    }
}
