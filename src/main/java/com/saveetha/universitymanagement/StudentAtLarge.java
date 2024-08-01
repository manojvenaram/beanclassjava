package com.saveetha.universitymanagement;

public class StudentAtLarge extends Student {

    public StudentAtLarge(int studentId, String lastName) {
        super(studentId, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        setAnnualTuition(2000 * 2); // Assuming two semesters per year
    }
}
