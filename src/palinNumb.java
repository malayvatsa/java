
//Program to check a user entered number is palindrome or not
import java.util.Scanner;
class palinNumb {
    int num;

    palinNumb(int num){
        this.num=num;
    }

    void checkPalin(){
        int rev=0,copy=num;
        while(copy>0){
            int r=copy%10;
            rev=rev*10+r;
            copy/=10;
        }
        if(rev==num){
            System.out.println("Number is a palindrome.");
        }
        else
            System.out.println("Number is not a palindrome.");
    }
}

class palinDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        palinNumb obj = new palinNumb(num);
        obj.checkPalin();
    }
}
