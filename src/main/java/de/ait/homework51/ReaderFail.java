package de.ait.homework51;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderFail {
    public static void main(String[] args) throws IOException {


        File sourceFile = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\source.txt");

        if (!sourceFile.exists()) {
            boolean cretedFile = sourceFile.createNewFile();
            if (cretedFile) {
                System.out.println("File " + sourceFile.getName() + " created");
            }
        } else {
            System.out.println("File " + sourceFile.getName() + " exists");
        }

        File destinationFile = new File("C:\\Users\\svint\\IdeaProjects\\AIThomeworks\\destination.txt");
        if (!destinationFile.exists()) {
            boolean creted = destinationFile.createNewFile();
            if (creted) {
                System.out.println("File " + destinationFile.getName() + " created");
            }
        } else {
            System.out.println("File " + destinationFile.getName() + " exists");
        }


        writeInFile(sourceFile, "Katze Hund \nWolf");

        readAndWriteInFileContary(sourceFile, destinationFile);
    }

    public static void writeInFile(File file, String write) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(write);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndWriteInFileContary(File source, File destination) {
        if (source.exists() && destination.exists()) {
            try {
                FileReader fileReaderFromSource = new FileReader(source);
                BufferedReader bufferedReaderInSource = new BufferedReader(fileReaderFromSource);
                String lineInSource = bufferedReaderInSource.readLine();


                while (lineInSource != null) {
                    String[] worte = lineInSource.split(" ");

                    for (int i = 0; i < worte.length; i++) {
                        String bufferWorte = worte[i];


                        char[] bufferWorteInChar = bufferWorte.toCharArray();

                        char[] finishWorteInChar;
                        finishWorteInChar = new char[bufferWorteInChar.length];

                        for (int n = 0; n < bufferWorteInChar.length; n++) {
                            finishWorteInChar[n] = bufferWorteInChar[bufferWorteInChar.length - 1 - n];


                        }
                        String finishBuffer = "";
                        for (int m = 0; m < finishWorteInChar.length; m++) {
                            finishBuffer = finishBuffer + finishWorteInChar[m];
                        }


                        try (FileWriter fileWriter = new FileWriter(destination, true);) {
                            fileWriter.write(finishBuffer + " ");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    lineInSource = bufferedReaderInSource.readLine();


                    try (FileWriter fileWriter = new FileWriter(destination, true);) {
                        fileWriter.write("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }


}