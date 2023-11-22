package de.ait.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaReadWritePassFile {
    //
    private InputStream inputStream;
    //
    private OutputStream outputStream;

    //weg zum File
    private String path;

    //
    public JavaReadWritePassFile(String path) {
        this.path = path;
    }

    public void readFile() throws IOException {
        //
        inputStream = new FileInputStream(path);
        //
        int data = inputStream.read();
        char content;
        //
        while(data !=-1){
            //byte->char
          content=(char) data;
            //
            System.out.println(content);
            //
            data = inputStream.read();

        }
        inputStream.close();
    }

    public void writeFile(String stringToWrite) throws IOException {
        //
        outputStream = new FileOutputStream(path);
        //
        outputStream.write(stringToWrite.getBytes());
        //
        outputStream.close();

    }

}


