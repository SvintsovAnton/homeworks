package de.ait.homework39;

public class Main {
    public static void main(String[] args) {
        StudentDatabase studentDatabase = new StudentDatabase();
        Student anna = new Student("Anna", 20);
        Student anton = new Student("Anton", 21);
        Student arina = new Student("Arina",19);

        studentDatabase.addStudent(anna);
        studentDatabase.addStudent(anton);
        studentDatabase.addStudent(arina);

        System.out.println("===================");

        studentDatabase.containsStudent(anton);

        System.out.println("===================");

        studentDatabase.removeStudent(anna);
        studentDatabase.containsStudent(anna);

        System.out.println("======================");

        studentDatabase.printAllStudents();


    }
}
