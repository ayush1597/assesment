package com.ttn.sling.project.core.service.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Component(immediate = true, service = StudentClassConfig.class)
@Designate(ocd = StudentClassService.class)
public class StudentImp implements StudentClassConfig {
    List<Student> studentList = new ArrayList<>();
    ClassImp classImp = new ClassImp();
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public String addStudent(Student student) {
        boolean result = classImp.isClassLimitReached(studentList);
        if (result) {
            studentList.add(student);
            return "student added" + student;
        }
        return "student cannot be added";
    }

    @Override
    public boolean deleteStudent(int id) {
        boolean isdeleted = false;
        for (Student student : studentList) {
            if (student.id == id) {
                isdeleted = studentList.remove(student);
            }
        }
        if (isdeleted) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isStudentPassed(int id) {
        boolean isPassed = false;
        for (Student student : studentList) {
            if (student.id == id) {
                if (student.marks >= classImp.pass_marks) {
                    isPassed = true;
                }
            }
        }

        if (isPassed) {
            return true;
        }

        return false;
    }

    @Override
    public Student getStudent(int id) {
        for (Student student : studentList) {
            if (student.id == id) {
                return student;
            }
        }
        return new Student(1, "Shubham", 85, 24);
    }

    @Override
    public List<Student> getAllStudents() {
        if (studentList.size() > 0) {
            return studentList;
        }
        return new ArrayList<>();

    }

    @Activate
    public void activateMethod(StudentClassService studentClassService) {
        logger.info("\n\nStudent Configuration Service Activated.\n");


        Student student1, student2, student3, student4;
        student1 = new Student(1, "ayush", 85, 24);
        student2 = new Student(2, "ammy", 95, 22);
        student3 = new Student(3, "arjit", 100, 25);
        student4 = new Student(4, "avi", 10, 23);


        logger.info("\n\nStudent Implementation:\n" +
                "Adding Student 1: " + addStudent(student1) +
                "\nAdding Student 2: " + addStudent(student2) +
                "\nAdding Student 3: " + addStudent(student3) +
                "\nAdding Student 4: " + addStudent(student4) +
                "\nDeleting Last Student: " + deleteStudent(2) +
                "\nIs Student 3 Pass:" + isStudentPassed(4) +
                "\nGetting Student 1: " + getStudent(1) +
                "\nGetting All Students: " + getAllStudents() +
                "\n");
    }


}
