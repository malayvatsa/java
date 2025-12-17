//Write a program to print the corresponding grade for the given mark using if..else statement in Java
import java.util.Scanner;
class grade {
    int marks;

    grade(int marks){
        this.marks=marks;
    }

    char calGrade(){
        if(marks>90 && marks<=100)
            return 'O';
        else if(marks>80 && marks<=90)
            return 'E';
        else if(marks>70 && marks<=80)
            return 'A';
        else if(marks>60 && marks<=70)
            return 'B';
        else if(marks<=60)
            return 'C';

        return 'X';
    }

    void printGrade(){
        System.out.println("Grade achieved is: "+calGrade());
    }
}

class gradeMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student's marks:");
        int marks=sc.nextInt();
        grade obj=new grade(marks);
        obj.printGrade();
    }
}