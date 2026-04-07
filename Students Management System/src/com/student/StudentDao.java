package com.student;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao implements StudentDaoInterface {
    Connection con;

    @Override
    public boolean createStudent(Student s) {
        con = DBConnection.createDBConnetion();
        String query = "insert into student values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, s.getId());
            pstm.setString(2, s.getName());
            pstm.setString(3, s.getVrstyname());
            pstm.setDouble(4, s.getCgpa());
            pstm.setInt(5, s.getAge());
            pstm.setString(6, s.getSemester());
            pstm.setInt(7, s.getCredit());
            pstm.setString(8, s.getDepartment());
            //pstm.executeUpdate();
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Student Inserted Successfully !!!");

            else
                System.out.println("something went wrong, please try again");


        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public void showAllStudent() {
        con = DBConnection.createDBConnetion();
        String query = "SELECT * FROM `student`";
        System.out.println("Students Details : ");
        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "ID", "Name", "ClgName", "CGPA", "Age", "Semester", "Credit", "Department");
        System.out.println("-----------------------------------------------------------------------------------------------");

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("%d\t\t%s\t\t%s\t\t%f\t\t%d\t\t%s\t\t%d\t\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getDouble(4),
                        result.getInt(5),
                        result.getString(6),
                        result.getInt(7),
                        result.getString(8));
                System.out.println("--------------------------------------------------------------------------------------");

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public boolean showStudentBasedOnID(int id) {
        con = DBConnection.createDBConnetion();
        int p = 0;
        String query = "select * from student where id=" + id;
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", "ID", "Name", "VrstyName", "CGPA", "Age", "Semester", "Credit", "Department");
                System.out.format("%d\t\t%s\t\t%s\t\t%f\t\t%d\t\t%s\t\t%d\t\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getDouble(4),
                        result.getInt(5),
                        result.getString(6),
                        result.getInt(7),
                        result.getString(8));
                //if(cnt!=0)
                System.out.println("Student with this id is available in our system");
                //else
                //System.out.println("Something went wrong");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateStudent(int id, String name) {
        con = DBConnection.createDBConnetion();
        String query = "update student set name=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setInt(2, id);
            String semester;
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Student Details updated successfully !!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public void deleteStudent(int id) {
        con = DBConnection.createDBConnetion();
        String query = "delete from student where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Student Deleted Successfully!!! ID : " + id);
            else
                System.out.println("Something went wrong");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

}



