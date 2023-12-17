package de.ait.homework59;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentUtil {


    public static void main(String[] args) {


    Student student1 = new Student("Artur",21,4.56);
    Student student2 = new Student("Anna",19,5.00);
    Student student3 = new Student("Sergi",25,3.21);
    Student student4= new Student("David",18,4.95);
        java.util.List<Student> listOfStudent;

   listOfStudent = Arrays.asList(student1,student2,student3,student4);



        //Фильтрация списка студентов: Напишите лямбда-выражение, которое фильтрует список студентов, оставляя только тех,
    // у кого средний балл выше определённого значения.

        ArrayList<Student> studentGutenNoten = (ArrayList<Student>) listOfStudent.stream().filter(element->element.getNote()>4.5).collect(Collectors.toList());
        System.out.println(studentGutenNoten.stream().toList());

        System.out.println("************************");

    //
    //Сортировка студентов: Используйте лямбда-выражение для сортировки списка студентов по их фамилии.

        List studentSort;
        studentSort = listOfStudent.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(studentSort);

    //
    //Преобразование списка студентов: Напишите лямбда-выражение для преобразования списка студентов в список их имен.

        List studentname;
        studentname = listOfStudent.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(studentname.stream().toList());
    //
    //Подсчёт студентов: Создайте лямбда-выражение, которое подсчитывает количество студентов, чей возраст больше заданного.

        int numberStudent = listOfStudent.stream().filter(element->element.getAge()>20).collect(Collectors.toList()).size();
        System.out.println(numberStudent);
    //
    //Максимальный и минимальный средний балл: Используйте лямбда-выражения для нахождения студента с максимальным и
    // минимальным средним баллом в группе.

        Student bestStudent = listOfStudent.stream().reduce((Student a,Student b)->a.getNote()>b.getNote()?a:b).orElse(null);
        System.out.println(bestStudent);


        Student badStudent = listOfStudent.stream().reduce((Student a,Student b)->a.getNote()<b.getNote()?a:b).orElse(null);
        System.out.println(badStudent.toString());





}
}
