/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentList {

    public static ArrayList<Student> stu = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Student student = new Student();

    public void addStudent(Student student) {

        student.addStudent();
        stu.add(student);
    }

    // Hiển thị tất cả sinh viên
    public void displayAllStudent() {
        for (Student student : stu) {
            System.out.println(student);
        }
    }

    public void deleteStudentById(String id) {
        Iterator<Student> iter = stu.iterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            if (id.equals(s.getId())) {
                iter.remove();
            }
        }
    }

    public Student findStudentByID(String id) {

        for (Student stu1 : stu) {
            if (id.equals(stu1.getId())) {
                System.out.println(stu1);
                return stu1;
            }
        }
        return null;

    }

    public Student findTopStudent() {
        Student topstudent = stu.get(0);

        for (Student student : stu) {
            if (student.getGpa() > topstudent.getGpa()) {
                topstudent = student;

            }
        }
        for (Student student : stu) {
            if (topstudent.getGpa() == student.getGpa() && !topstudent.getId().equals(student.getId())) {
                System.out.println(student);
            }
        }

        return topstudent;
    }

    public ArrayList<Student> findSchoolarshipStudent() {

        Iterator<Student> iter = stu.iterator();
        System.out.println("Da ap dung hoc bong");
        while (iter.hasNext()) {
            Student s = iter.next();
            if (s.getGpa() >= 9) {
                s.setSchoolarship(true);
                
                s.setTuition(s.getTuition() * 0.5);

                System.out.println(s);

            }
        }

        return stu;
    }

    public double caculateTuiitionOfAllStudents() {
        double sum = 0;
        Iterator<Student> iter = stu.iterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            sum += s.getTuition();
        }
        return sum;
    }
}
