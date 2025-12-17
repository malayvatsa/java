//Write a program to print the week day for the given day no. of the current month using switch case statement
import java.util.Scanner;
class weekDay {
    int day;

    weekDay(int day){
        this.day=day;
    }

    void calcWeek(){
        switch(day%7){
            case 1:
                System.out.println("Sunday.");
                break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tuesday.");
                break;
            case 4:
                System.out.println("Wednesday.");
                break;
            case 5:
                System.out.println("Thursday.");
                break;
            case 6:
                System.out.println("friday.");
                break;
            case 0:
                System.out.println("Saturday.");
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}

class weekDayDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day of the month: ");
        int day=sc.nextInt();
        weekDay obj=new weekDay(day);
        obj.calcWeek();
    }
}