package com.saveetha.universitymanagement;

public abstract class Student {
    private int studentId;
    private String lastName;
    private double annualTuition;

    public Student(int studentId, String lastName) {
        this.studentId = studentId;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualTuition() {
        return annualTuition;
    }

    public void setAnnualTuition(double annualTuition) {
        this.annualTuition = annualTuition;
    }

    public abstract void setTuition();
}
