package de.ait.homework48;

public class WorkWithUser {
    public static void main(String[] args) {


        User anton = new User("Anton", "122");
        User anna = new User("Arina", "222");
        System.out.println(User.alluser.containsValue("Anton"));
        AuthenticationService.authenticate("Arina","2522");
    }
}