package crudOperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Create {

    Scanner sc = new Scanner(System.in);

    void create() {

        System.out.println("How many student do you want to add");
        int n = sc.nextInt();
        ArrayList<Student> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the id of the student:");
            int id = sc.nextInt();
            System.out.println("Enter the name of the student:");
            String name = sc.next();
            System.out.println("Enter the age of  the Student:");
            int age = sc.nextInt();
            System.out.println("Enter contact detail:");
            long contact = sc.nextLong();
            System.out.println("--------------------");
            Student s = new Student(id, name, age, contact);
            array.add(s);
        }
        System.out.println("New student created:");
        for (Student at : array) {
            System.out.println(at.id + " " + at.name + " " + at.age + " " + at.contact);
        }
        System.out.println("Do you want more operation");
        System.out.println("Enter yes if yes");

        String input = sc.next();
        while  (Objects.equals(input, "yes"))
        {
            System.out.println("enter what operation you want to perform???");
            int cases = sc.nextInt();
            switch (cases) {
                case 1:
                    System.out.println("Enter the id of the student you want to remove");
                    int id = sc.nextInt();
                    array.remove(id - 1);
                    System.out.println("Student remains are:");
                    for (Student at : array) {
                        System.out.println(at.id + " " + at.name + " " + at.age + " " + at.contact);
                    }
                    break;
                case 2:
                    System.out.println("Enter id of the student you want to update :");
                    int ids = sc.nextInt();
                    System.out.println("Enter the name of the student:");
                    String name = sc.next();
                    System.out.println("Enter the age of  the Student:");
                    int age = sc.nextInt();
                    System.out.println("Enter contact detail:");
                    long contact = sc.nextLong();
                    Student s = new Student(ids, name, age, contact);
                    array.set(ids - 1, s);
                    System.out.println(" Student after update are:");
                    for (Student at : array) {
                        System.out.println(at.id + " " + at.name + " " + at.age + " " + at.contact);
                    }
                    break;
                case 3:
                    System.out.println(" enter id of the student you wannt to read");
                    int ide = sc.nextInt();
                    Student p = array.get(ide - 1);
                    System.out.println("Detail of the student whose id " + ide + "is");
                    System.out.println(p.id + " " + p.name + " " + p.age + " " + p.contact);

                    break;
            }
        }


    }

}
