import java.util.*;
public class prine_number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num==2){
            System.out.println("n is prime");
        }
        else{
            for(int i=2;i<num-1;i++){
                if((num%i)==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime");
            }
        } 
    }
}

