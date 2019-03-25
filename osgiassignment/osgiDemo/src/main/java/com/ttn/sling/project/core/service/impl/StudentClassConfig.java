package com.ttn.sling.project.core.service.impl;

import java.util.List;

public interface StudentClassConfig {
    String addStudent(Student student);

    boolean deleteStudent(int id);

    boolean isStudentPassed(int id);

    Student getStudent(int id);

    List<Student> getAllStudents();

}
