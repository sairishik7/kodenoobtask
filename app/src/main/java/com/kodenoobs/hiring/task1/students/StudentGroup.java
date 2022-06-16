package com.kodenoobs.hiring.task1.students;

import java.util.List;

public class StudentGroup {

    private final List<Students> studentList;

    public StudentGroup(List<Students> studentList) {
        this.studentList = studentList;
    }

    public List<Students> getStudentList() {
        return studentList;
    }
}
