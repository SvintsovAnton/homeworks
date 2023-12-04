package de.ait.homework53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMethodenTest {

    AnimalMethoden animalMethoden;
    ArrayList<Animal> animalArrayList;
    String path;
    @BeforeEach
    void setUp(){
        animalMethoden=new AnimalMethoden();
        Animal myKatze = new Animal("Маскот", "Кошка",3);
        Animal myHund = new Animal("Линда","собака",10);
        Animal myRabbit = new Animal("Кроль","кролик",2);
        animalArrayList = new ArrayList<>();
        animalArrayList.add(myKatze);
        path ="C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\animals.txt";
       // animalArrayList.add(myHund);
       // animalArrayList.add(myRabbit);
    }

    @Test
    void writeInFile() {
        Assertions.assertEquals(true,animalMethoden.writeInFile(animalArrayList,path));
        Assertions.assertEquals(" Имя: [Маскот], Вид: [Кошка], Возраст: [3].",animalMethoden.readInFile(path));
    }

    @Test
    void readInFile() {
       // animalMethoden.writeInFile(animalArrayList,path);
        Assertions.assertEquals(" Имя: [Маскот], Вид: [Кошка], Возраст: [3].",animalMethoden.readInFile(path));
    }
}