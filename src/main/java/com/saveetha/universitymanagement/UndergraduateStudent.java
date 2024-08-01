package com.saveetha.universitymanagement;

public class UndergraduateStudent extends Student {

    public UndergraduateStudent(int studentId, String lastName) {
        super(studentId, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        setAnnualTuition(4000 * 2); // Assuming two semesters per year
    }
}
