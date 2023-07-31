import java.util.*;
public class practice3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number,Odd_sum=0,choice,Even_Sum=0;
        System.out.println("Ques 1 sum of even and odd number:");
        do{
            System.out.println("Enter the number:");
            number=sc.nextInt();
            if((number%2)==0){
                Even_Sum+=number;
            }
            else{
                Odd_sum+=number;
            }
            System.out.print("Do you want to exit,Press 0 Otherwise 1 :");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of Even number:"+Even_Sum);
        System.out.println("Sum of Odd number:"+Odd_sum);
        System.out.println("\n**********************************************\n");
        System.out.println("Ques 2 to find the factorial of the number:");
        System.out.print("Enter the number:");
        int num_1=sc.nextInt();
        int sum=1;
        for(int i=num_1;i>0;i--){
            sum*=i;
        }
        System.out.println("Factorial of a number is :"+sum);
        System.out.println("\n*************************************************\n");
        System.out.print("Enter the number for table:");
        int numb=sc.nextInt();
        int table;
        for(int i=1;i<=10;i++){
            System.out.println(numb + "*" + i + "=" + numb*i);
        }
    }
}