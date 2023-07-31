import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("We can make a calculator...\n");
        System.out.println("Enter the first value \n");
        float num1=sc.nextFloat();
        System.out.println("Enter the Second value \n");
        float num2=sc.nextFloat();
        
        System.out.println("Enter the operator:\n");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println("Sum of the two number ="+(num1+num2));
                    break;
            case '-':System.out.println("Subtraction of the two number ="+(num1-num2));     
                    break;
            case '*':System.out.println("Product of the two number ="+(num1*num2));
                    break;
            case '/':System.out.println("Divide of the two number ="+(num1/num2));
                    break;
            case '%':System.out.println("REmainder of the two number ="+(num1%num2));
                    break;
            default:System.out.println("Enter the only +,-,*,/,%...\n");
        }
    }
}