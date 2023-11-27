package de.ait.homework53;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AnimalMethoden {


    public boolean writeInFile(ArrayList<Animal> animalList, String path){
        File fileWithAnimal = new File(path);

        if (!fileWithAnimal.exists()){
         try {
                fileWithAnimal.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }}

        try {
            FileWriter fileWriter = new FileWriter(fileWithAnimal,true);
            for (int i=0;i< animalList.size();i++){
                String name= animalList.get(i).getName();
                String species= animalList.get(i).getSpecies();
                int age= animalList.get(i).getAge();
                fileWriter.write(" Имя: ["+name+"], Вид: ["+species+"], Возраст: ["+age+"]."+"\n");
            }
            fileWriter.close();
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public String readInFile(String path){
        String forreturn ="";
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineInFile = bufferedReader.readLine();

            while(lineInFile!=null){
                System.out.println(lineInFile);
                forreturn = forreturn+lineInFile;
                lineInFile=bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
return forreturn;
    }
}
