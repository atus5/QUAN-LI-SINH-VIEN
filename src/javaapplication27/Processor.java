/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Processor {

    public static void main(String[] args) {
        StudentList studentlist = new StudentList();
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        int choice = 0;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Delete Student By ID");
            System.out.println("4. Find Student By ID");
            System.out.println("5. Find Top Student");
            System.out.println("6. Find Schoolarship Student");
            System.out.println("7. caculateTuiitionOfAllStudents");
            System.out.println("8. Exit");
            System.out.println("=======================================");
            System.out.println("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {

                    studentlist.addStudent(student);
                    System.out.println("Student added successfully.");
                }
                case 2 ->
                    studentlist.displayAllStudent();
                case 3 -> {
                    System.out.println("Enter ID: ");
                    String id = sc.nextLine();
                    studentlist.deleteStudentById(id);
                }
                case 4 -> {
                    System.out.println("Enter ID: ");
                    String id1 = sc.nextLine();
                    studentlist.findStudentByID(id1);
                }
                case 5 -> {
                    System.out.println(studentlist.findTopStudent());
                }
                case 6 -> {
                    studentlist.findSchoolarshipStudent();
                }
                case 7 -> {
                    System.out.println("Sum: " + studentlist.caculateTuiitionOfAllStudents());
                }
                default ->
                    System.out.println("Wong");
            }

        } while (choice != 8);
        System.out.println("Exitting...");

    }
}
