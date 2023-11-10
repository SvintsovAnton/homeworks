package de.ait.homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {
     private Map<String,Drink> listOfDrink = new HashMap<>();

    public Map<String, Drink> getListOfDrink() {
        return listOfDrink;
    }

    public void setListOfDrink(Map<String, Drink> listOfDrink) {
        this.listOfDrink = listOfDrink;
    }

    public boolean addDrink(String id, Drink drink){
        if(getListOfDrink().containsKey(id)){
            System.out.println("Sorry, a drink with this ID already exists");
            return false;
        }else {getListOfDrink().put(id,drink);
        return true;}
    }

    public Drink getDrink(String id){
        return getListOfDrink().get(id);
    }
}
