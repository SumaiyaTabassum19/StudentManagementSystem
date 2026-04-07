package com.student;

public class Student {
    private int id;
    private String name;
    private String vrstyname;
    private double cgpa;
    private int age;
    private String semester;
    private int credit;
    private String department;


    public Student(){

    }
    public Student(int id, String name,String vrstyname, double cgpa, int age, String semester, int credit, String department) {
        this.id = id;
        this.name = name;
        this.vrstyname=vrstyname;
        this.cgpa = cgpa;
        this.age = age;
        this.semester = semester;
        this.credit = credit;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVrstyname() {
        return vrstyname;
    }

    public void setVrstyname(String vrstyname) {
        this.vrstyname = vrstyname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vrstyname='" + vrstyname + '\'' +
                ", cgpa=" + cgpa +
                ", age=" + age +
                ", semester=" + semester +
                ", credit=" + credit +
                ", department=" + department +
                '}';
    }


}