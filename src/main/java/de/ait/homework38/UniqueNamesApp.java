package de.ait.homework38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNamesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        boolean stop = false;
        Set<String> listOfName = new HashSet<>();

        do {
            System.out.println("Введите имя или \"стоп\" для остановки");
            name = scan.nextLine();
            if (name.toLowerCase().equals("стоп")) {
                stop = true;
            } else {
                ArrayList<Object> nameSpell = new ArrayList<>();
                for (int i = 0; i < name.length(); i++) {
                    char nameChar = name.charAt(i);
                    nameSpell.add(nameChar);
                }
                String newName = "";
                for (int n = 0; n < name.length(); n++) {
                    if (n == 0) {
                        newName = newName.concat(String.valueOf(nameSpell.get(n)).toUpperCase());
                    } else {
                        newName = newName.concat(String.valueOf(nameSpell.get(n)).toLowerCase());
                    }
                }
                listOfName.add(newName);
            }
        } while (!stop);

        System.out.println("Уникальные имена: ");
        for (String nameInList : listOfName) {
            System.out.println(nameInList);
        }

    }
}
