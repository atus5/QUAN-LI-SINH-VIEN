/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student extends Person implements IPerson {

    public static Scanner sc = new Scanner(System.in);
    private float gpa;
    private String major;
    private double tuition;
    boolean schoolarship;

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{"
                + "Name='" + fullName + '\''
                + ", ID='" + id + '\''
                + ", Date of Birth=" + dateOfBirth
                + ", GPA=" + gpa
                + ", Major='" + major + '\''
                + ", Tuition='" + tuition + '\''
                + '}';
    }

    public void addStudent() {

        System.out.println("Enter name: ");
        this.fullName = sc.nextLine();

        System.out.println("Enter ID: ");
        this.id = sc.nextLine();

        System.out.println("Enter Date: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = date2.parse(date1);
        } catch (Exception e) {
            System.out.println("Wrong format !");
        }

        System.out.println("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter major: ");
        this.major = sc.nextLine();
        System.out.println("Enter tuition: ");
        this.tuition = sc.nextDouble();
        sc.nextLine();
    }

}
