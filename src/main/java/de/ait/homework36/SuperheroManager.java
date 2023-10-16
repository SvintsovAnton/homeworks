package de.ait.homework36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperheroManager { //The SuperheroManager class exists to manage a collection of superheroes.

    //collection for superheroes
    ArrayList<Superhero> listOfSuperheroes = new ArrayList<>();

    //Method to add a superhero to the collection with a condition: you cannot add superheroes with the same names
    public void addSuperhero(Superhero superhero) {
        boolean sameName = false;
        for (Superhero superheroInList : listOfSuperheroes) {
            if (superheroInList.getName().equals(superhero.getName())) {
                sameName = true;
                break;
            }
        }
        if (sameName) {
            System.out.println("Нельзя добавлять супергероев с одинаковыми именами.");
        } else {
            listOfSuperheroes.add(superhero);
        }
    }

    //Method to remove a superhero by name.
    public String removeSuperhero(String name) {

        Iterator iterator = listOfSuperheroes.iterator();
        while (iterator.hasNext()) {
            Superhero superheroInList = (Superhero) iterator.next();
            if (superheroInList.getName().equals(name)) {
                iterator.remove();
                return "Супергерой удачно удалён";
            }
        }
        return null;
    }

    //Method that returns the superhero by name.
    public Superhero getSuperhero(String name) {
        for (Superhero superheroInList : listOfSuperheroes) {
            if (superheroInList.getName().equals(name)) {
                return superheroInList;
            }
        }
        return null;
    }

    //Method that returns a list of all superheroes.
    public String getAllSuperheroes() {
        String listAllSuperheroes = " ";
        for (Superhero superheroInList : listOfSuperheroes) {
            listAllSuperheroes = listAllSuperheroes + superheroInList.toString();
        }
        return listAllSuperheroes;
    }

    //The method allows you to update information about a superhero by name.
    public void updateSuperhero(String name, Superhero newSuperhero) {
        int indexObject = 999;
        boolean nameExists = false;

        for (Superhero superheroInList : listOfSuperheroes) {
            if (superheroInList.getName().equals(name)) {
                indexObject = listOfSuperheroes.indexOf(superheroInList);
                nameExists = true;
            }

            if (nameExists) {
                listOfSuperheroes.get(indexObject).setName(newSuperhero.getName());
                listOfSuperheroes.get(indexObject).setPower(newSuperhero.getPower());
                listOfSuperheroes.get(indexObject).setAge(newSuperhero.getAge());
            } else {
                System.out.println("Супергероя с таким именем не существует");
            }
        }
    }

}





