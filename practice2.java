import java.util.*;
public class practice2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("<<-- Ques 1: -->>");
        System.out.println("Enter the number :");
        int num1=sc.nextInt();
        if(num1>0){
            System.out.println("It's a Positive Number.");
        }
        else{
            System.out.println("It's a Negative Number.");
        }
        System.out.println("<<-- Ques 2: -->>");
        double temp=103.5;
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
        System.out.println("<<-- Ques 3: -->>");
        System.out.println("Enter the days number:");
        int days=sc.nextInt();
        switch(days){
            case 1:System.out.println("Monday:");
                break;
            case 2:System.out.println("Tuesday:");
                break;
            case 3:System.out.println("Wednesday:");
                break;
            case 4:System.out.println("Thrusday:");
                break;
            case 5:System.out.println("friday:");
                break;
            case 6:System.out.println("Saturday:");
                break;
            case 7:System.out.println("Sunday:");
                break;
            default:System.out.println("Enter a valid number:");
        }
        System.out.println("<<-- Ques 4: -->>");
        int year=sc.nextInt();
        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=(year%400)==0;
        if(x || (y && z)){
            System.out.println("Leap-Year");
        }
        else{
            System.out.println("Not-Leap-Year");
        }
    }
}