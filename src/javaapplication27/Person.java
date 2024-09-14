/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

import java.util.Date;

/**
 *
 * @author Admin
 */
abstract class Person implements IPerson{
    
    @Override
    public void displayInfo() {
       
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + '}';
    }
    protected String id;
    protected String fullName;
    protected Date dateOfBirth;

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
  
}
