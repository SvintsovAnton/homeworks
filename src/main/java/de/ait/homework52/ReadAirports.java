package de.ait.homework52;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAirports {
    public static void main(String[] args) {



    File airportsListe = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\ airports.txt");

        try {
            FileReader fileReader = new FileReader(airportsListe);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String infoAirport = bufferedReader.readLine();
            while (infoAirport !=null) {
              String[] seperateInfoAirport = infoAirport.split(" ");
               if(seperateInfoAirport.length==3){
                   System.out.println("Название: "+seperateInfoAirport[0]+", Код CDG: "+seperateInfoAirport[1]+", Страна: "+seperateInfoAirport[2]);
               }
                infoAirport = bufferedReader.readLine();

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }


    }
}
