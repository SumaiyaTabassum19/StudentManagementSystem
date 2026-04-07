package com.student;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String vrstyname;
        int id,age;
        double cgpa;
        String semester;
        int credit;
        String department;
        StudentDaoInterface dao=new StudentDao();
        System.out.println("***Welcome to Student Management Application System***");

        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n1.Add Student" +
                    "\n2.Show All Students" +
                    "\n3.Show Student based on ID" +
                    "\n4.Update the Student" +
                    "\n5.Delete the Student"+
                    "\n6.Exit");

            System.out.println("Enter Your Choice: ");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("ADD STUDENT");
                    System.out.println("------------------------------------------------------");
                    Student s=new Student();
                    System.out.println("Enter Your ID : ");
                    id=sc.nextInt();
                    System.out.println("Enter Your Name : ");
                    name=sc.next();
                    System.out.println("Enter You VrstyName : ");
                    vrstyname = sc.next();
                    System.out.println("Enter Your CGPA : ");
                    cgpa=sc.nextDouble();
                    System.out.println("Enter Your Age : ");
                    age=sc.nextInt();
                    System.out.println("Enter Your Semester : ");
                    semester=sc.next();
                    System.out.println("Enter Your Total Credit : ");
                    credit=sc.nextInt();
                    System.out.println("Enter Your Department : ");
                    department=sc.next();
                    s.setId(id);
                    s.setName(name);
                    s.setVrstyname(vrstyname);
                    s.setCgpa(cgpa);
                    s.setAge(age);
                    s.setSemester(semester);
                    s.setCredit(credit);
                    s.setDepartment(department);
                    dao.createStudent(s);
                    break;
                case 2:
                    dao.showAllStudent();
                    break;
                case 3:
                    System.out.println("Get student based on ID");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Enter Your ID : ");
                    int sid=sc.nextInt();
                    dao.showStudentBasedOnID(sid);
                    //boolean p=  dao.showStudentBasedOnID(sid);
                    break;
                case 4:
                    System.out.println("Update the student");
                    System.out.println("------------------------------------------------------");
                    int sid1=sc.nextInt();
                    System.out.println("Enter the new name");
                    name=sc.next();
                    dao.updateStudent(sid1,name);
                    break;
                case 5:
                    System.out.println("Delete the student");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Enter the id to delete");
                    id=sc.nextInt();
                    dao.deleteStudent(id);
                    break;

                case 6:
                    System.out.println("Thank you for using our Application System !!!");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;


            }

        }while (true);

    }
}
