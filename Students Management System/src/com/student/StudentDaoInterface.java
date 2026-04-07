package com.student;

public interface StudentDaoInterface {


    public boolean createStudent(Student s);

    public void showAllStudent();

    public boolean showStudentBasedOnID(int id);

    public boolean updateStudent(int id, String name);

    public void deleteStudent(int id);

}
