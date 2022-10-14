package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lesson {

    @Id
    @GeneratedValue
    private Long id;

    private String subject;
    private String teacher;
    private String studentGroup;

    // No-arg constructor required for Hibernate and OptaPlanner
    public Lesson() {
    }

    public Lesson(String subject, String teacher, String studentGroup) {
        this.subject = subject;
        this.teacher = teacher;
        this.studentGroup = studentGroup;
    }

    public Lesson(long id, String subject, String teacher, String studentGroup) {
        this(subject, teacher, studentGroup);
        this.id = id;

    }

    @Override
    public String toString() {
        return subject + "(" + id + ")";
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public Long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

}
