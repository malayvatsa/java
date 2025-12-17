//Write a program to print your name, roll no, section and branch in separate lines.
import java.util.Scanner;
class Student {
    String name,branch;
    int rollNo;
    char section;

    Student(String name,String branch,int rollNo, char section){
        this.name=name;
        this.branch=branch;
        this.rollNo=rollNo;
        this.section=section;
    }

    void printDetails(){
        System.out.println("Student's Name: "+name);
        System.out.println("Student's Roll Number: "+rollNo);
        System.out.println("Student's Section: "+section);
        System.out.println("Student's Branch: "+branch);
    }
}

class StudentDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student's first name:");
        String name=sc.next();
        System.out.print("Enter student's branch:");
        String branch=sc.next();
        System.out.print("Enter student's roll number:");
        int rollNo=sc.nextInt();
        System.out.print("Enter student's section:");
        char section=sc.next().charAt(0);
        Student obj=new Student(name,branch,rollNo,section);
        obj.printDetails();
    }
}