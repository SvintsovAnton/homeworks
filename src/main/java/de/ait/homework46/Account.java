package de.ait.homework46;

import de.ait.homework43.BankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Account {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);
    public static void main(String[] args) {

inputAccount();


        //Программа должна запрашивать у пользователя имя и пароль для создания новой учётной записи.
        //Имя пользователя не должно быть пустым, и пароль должен соответствовать следующим требованиям:
        //Не менее 8 символов.
        //Содержит хотя бы одну цифру.
        //Содержит хотя бы один специальный символ (например, !, @, #).
        //Программа должна проверять введённые данные и выдавать соответствующие сообщения об ошибках, используя стандартные исключения, такие как например IllegalArgumentException.
        //Если введённые данные корректны, программа должна сообщать о успешной регистрации.
        //Программа должна предоставить возможность повторного ввода данных при возникновении ошибок.
        //Программа должна завершаться по команде пользователя (например, вводом слова 'exit').


    }

    public static void inputAccount(){
        boolean flagIfwork = true;
        while (flagIfwork) {
            System.out.println("Введите имя пользователя или exit для завершения программы: ");
            String name = new java.util.Scanner(System.in).next();
            if (name.length() == 0){
               LOGGER.error("Имя поля не должно быть пустым!");
               break;
            }
            if(name.equalsIgnoreCase("exit")){
                System.out.println("Работа программы завершена");
                flagIfwork = false;
                break;
            }
            System.out.println("Введите пароль(Пароль должен содержать не менее 8 символов, минимум 1 цифру и минимум 1 специальный символ)");
            String password = new java.util.Scanner(System.in).next();
            if (password.equalsIgnoreCase("exit")){System.out.println("Работа программы завершена");
                flagIfwork = false;
                break;
            }
            if (password.length()<8 || (!password.contains("!")&&!password.contains("@")&&!password.contains("#"))){
                LOGGER.error("Пароль не содержит необходимого набора символов");
            }
            boolean flagPassword = false;
            for (int i=0;i<10;i++){
                String i1=String.valueOf(i);
                if (password.contains(i1)){
                    flagPassword=true;
                    break;
                }
            }
            if (flagPassword = false){
                LOGGER.error("Пароль не содержит необходимого набора символов");
            }


        }}}



