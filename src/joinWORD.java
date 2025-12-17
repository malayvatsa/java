
//Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name
import java.util.Scanner;
class joinWord {
    String Last,First;

    joinWord(String Last,String First){
        this.Last=Last;
        this.First=First;
    }

    void join(){
        String w=Last+' '+First;
        System.out.println("After Joining: "+w);
    }
}

class joinDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String First=sc.next();
        System.out.print("Enter last name: ");
        String Last =sc.next();
        joinWord obj=new joinWord(Last,First);
        obj.join();
    }
}
