package de.ait.homework50;

import de.ait.exceptions.CalculatorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryFileCreated {
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryFileCreated.class);

    private static String createText= "Задайте путь для создаваемой директории: ";
    private static String myDirectory = "MyDirectory";
    public static void main(String[] args) {
        System.out.println(createText);
        Scanner scanner = new Scanner(System.in);

        String pathToCreate = scanner.nextLine();
        String path = pathToCreate+File.separator + myDirectory;

        File directoryToCreate = new File(pathToCreate+File.separator + myDirectory);
        File resultFile = null;
        if (directoryToCreate.exists()){
            LOGGER.warn("СОздание директории {} невозможно. Директория уже существует",path);
            System.out.println("СОздание директории "+path+" невозможно. Директория уже существует");
        } else {
            boolean created = directoryToCreate.mkdir();
            if (created){
                LOGGER.info("Директория {} успешно создана",path);
                System.out.println("Директория "+path+" успешно создана");
                resultFile= createFileinDirectory(path,"MyFile.txt");
                if(resultFile!=null){
                    System.out.println("Файл успешно создан в директории "+path);
                } else    {
                    System.out.println("Не удалось создать файл в директории"+ path);
                }
            } else {
                LOGGER.warn("Директория {} не была создана",path);
                System.out.println("Директория "+path+"  не была создана");}
        }
        if (resultFile!=null);
       // deleteFileAndDirectory(resultFile, directoryToCreate);



    }

    private static File createFileinDirectory(String directory, String fileName){
        File file = new File(directory+File.separator+fileName);
        try {
            boolean resultFileCreated = file.createNewFile();
            if (resultFileCreated){
                LOGGER.info("Файл в директории успешно создан");
                return  file;
            }
            else {
                LOGGER.warn("Не удалось создать файл {} в диреткории {}",fileName,directory);
                return null;
            }
            
        } catch (IOException e) {
            LOGGER.error("Исключение при создании файла {} в директории {}. Описание ошибки {}",fileName,directory,e.getMessage());
            return null;
        }
    }
    
    private static boolean deleteFileAndDirectory(File fileToDelete, File directoryToCreate) {
        boolean deleteResult = fileToDelete.delete();
        if (deleteResult){
            directoryToCreate.delete();
            LOGGER.info("Файл {} был успешно удален в директории {}",fileToDelete.getName(),fileToDelete.getAbsoluteFile());
            return  true;
        }
        else {
            LOGGER.warn("Файл {} не был успешно удален в директории {}",fileToDelete.getName(),fileToDelete.getAbsoluteFile());
        return false;
        }
        
    }
}
