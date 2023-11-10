package de.ait.homework41;

import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
   private static List<String> countriesList = new ArrayList<String>();

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        //a. Создайте объект ArrayList<String> с названием countriesList.





        //b. Добавьте в countriesList следующие страны: США, Великобритания, Франция, Чехия, Германия ,Франция
String usa = "USA";
        countriesList.add(usa);
        LOGGER.info("Добавлена новая страна {}",usa);
        countriesList.add("Великобритания");
        countriesList.add("Франция");
        countriesList.add("Чехия");
        countriesList.add("Германия");
        countriesList.add("Франция");

        //c. Выведите на экран размер countriesList.
        System.out.println("====Array List=====");
        System.out.println("======Size");

        System.out.println(countriesList.size());

        //d. Выведите на экран все элементы countriesList в исходном порядке.
        System.out.println("=====List of elements======");
        for (Object country : countriesList) {
            System.out.println(country);
        }

        //e. Удалите дубликаты из countriesList и выведите список снова.
        int index1 = 0;
        int index2 = 0;
        int indexFind = 999;
        for (Object country1 : countriesList) {

            for (Object country2 : countriesList) {
                if (country1.equals(country2) && index1 != index2) {
                    indexFind = index2;
                }
                index1++;
            }
            index1 = 0;
            index2++;
        }
        countriesList.remove(indexFind);

        System.out.println("=====List of elements after delete======");
        for (Object country : countriesList) {
            System.out.println(country);
        }

        System.out.println("========HashSet===========");


        Set countriesSet = new HashSet<String>();
        countriesSet.add("США");
        countriesSet.add("Великобритания");
        countriesSet.add("Франция");
        countriesSet.add("Чехия");
        countriesSet.add("Германия");
        countriesSet.add("Франция");

        System.out.println("=============SIZE HashSet===========");
        System.out.println(countriesSet.size());
        System.out.println("============List of elements in Set==================");
        for (Object country : countriesSet) {
            System.out.println(country);
        }

        System.out.println("=========HashMap=============");
        Map capitalMap = new HashMap<String, String>();
        capitalMap.put("Чехия", "Прага");
        capitalMap.put("США", "Вашингтон");
        capitalMap.put("Великобритания", "Лондон");
        capitalMap.put("Франция", "Париж");
        capitalMap.put("Германия", "Берлин");

        System.out.println("=======SIZE of HashMap==========");
        System.out.println(capitalMap.size());

        System.out.println("========List of elements in HashMap=========");
        System.out.println(capitalMap);

        System.out.println("============List of elements in HashMap after change===========");
        capitalMap.put("США", "Сан-Франциско");
        System.out.println(capitalMap);

        System.out.println("=========Additional tasks============");

        if (!countriesSet.contains("Испания")) {
            System.out.println("countriesSet contains \"Испания\": " + countriesSet.contains("Испания"));
            countriesSet.add("Испания");
            capitalMap.put("Испания", "Мадрид");
            for (Object country : countriesSet) {
                System.out.println(country);
            }
            System.out.println(capitalMap);
        }
    }
}

