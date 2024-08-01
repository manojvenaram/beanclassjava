package com.saveetha.universitymanagement;

public class GraduateStudent extends Student {

    public GraduateStudent(int studentId, String lastName) {
        super(studentId, lastName);
        setTuition();
    }

    @Override
    public void setTuition() {
        setAnnualTuition(6000 * 2); // Assuming two semesters per year
    }
}
