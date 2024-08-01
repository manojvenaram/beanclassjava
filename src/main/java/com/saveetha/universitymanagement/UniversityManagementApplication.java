package com.saveetha.universitymanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniversityManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Student[] students = new Student[6];

			students[0] = new UndergraduateStudent(1, "Smith");
			students[1] = new UndergraduateStudent(2, "Johnson");
			students[2] = new GraduateStudent(3, "Williams");
			students[3] = new GraduateStudent(4, "Jones");
			students[4] = new StudentAtLarge(5, "Brown");
			students[5] = new StudentAtLarge(6, "Davis");

			for (Student student : students) {
				System.out.println("Student ID: " + student.getStudentId() +
						", Last Name: " + student.getLastName() +
						", Annual Tuition: $" + student.getAnnualTuition());
			}
		};
	}
}
