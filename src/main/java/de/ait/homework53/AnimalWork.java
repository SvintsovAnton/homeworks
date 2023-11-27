package de.ait.homework53;

import java.util.ArrayList;

public class AnimalWork {
    public static void main(String[] args) {
        Animal myKatze = new Animal("Маскот", "Кошка",3);
        Animal myHund = new Animal("Линда","собака",10);
        Animal myRabbit = new Animal("Кроль","кролик",2);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(myKatze);
        animalArrayList.add(myHund);
        animalArrayList.add(myRabbit);

        AnimalMethoden animalMethoden = new AnimalMethoden();
        String path ="C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\animals.txt";

      //  animalMethoden.writeInFile(animalArrayList,path);
        animalMethoden.readInFile(path);


    }
}
