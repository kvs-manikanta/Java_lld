package com.bms.prototypeandRegistryPattern;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private String university;

    public Student()
    {

    }

    public Student(Student student) {
        this.batch =student.batch;
        this.university = student.university;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBatch() {
        return batch;
    }

    public String getUniversity() {
        return university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
