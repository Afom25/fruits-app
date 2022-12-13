package com.example.projectrest6;

public class Student {

    private String id ;
    private String firstname;
    private String lastname;
    private String department;

    public Student(String id, String firstname, String lastname, String department) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
