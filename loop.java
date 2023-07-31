import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Printing the Hello World");
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        while(0<num){
            System.out.println("Hello World");
            num--;
        }
        System.out.println("Complete");
        System.out.println("Enter the number u want to print Sequence:");
        int num1=sc.nextInt();
        int num_1=1;
        while(num_1<=num1){
            System.out.print(num_1+" ");
            num_1++;
        }
        System.out.println();
        System.out.println("Printing the sum to n natural number");
        
        System.out.println("Enter the number:");
        int num2=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num2){
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Print the reverse number:");
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        while(n>0){
            int last_digit=n%10;
            System.out.print(last_digit);
            n=n/10;
        }*/
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int last_digit=num%10;
            rev=(rev*10)+last_digit;
            num=num/10;
        }        
        System.out.println(rev);
    }
}