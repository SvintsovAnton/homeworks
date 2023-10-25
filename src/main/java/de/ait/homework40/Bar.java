package de.ait.homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {
    Map<String,Drink> listOfDrink = new HashMap<>();

    public boolean addDrink(String id, Drink drink){
        if(listOfDrink.containsKey(id)){
            System.out.println("Sorry, a drink with this ID already exists");
            return false;
        }else {listOfDrink.put(id,drink);
        return true;}
    }

    public Drink getDrink(String id){
        return listOfDrink.get(id);
    }
}
