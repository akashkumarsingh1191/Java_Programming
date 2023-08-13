import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ques:1-->> Calculating the average of 3 number:\n");
        String str=sc.next();
        int a=sc.nextInt();
        int C=sc.nextInt();
        int Avg=(A+B+C)/3;
        System.out.println(Avg);
        System.out.println("Ques:2-->> Calculating the area of square:\n");
        int side=sc.nextInt();
        int Area=(side*side);
        System.out.println(Area);
        System.out.println("Ques:3-->> \n");
        float pencil=sc.nextFloat();
        float earser=sc.nextFloat();
        float pen=sc.nextFloat();
        
        float total=(pencil+earser+pen);
        System.out.println("Total is :"+total);
        float new_total=total+(total*0.18f);
        System.out.println("New-Total is:"+new_total);
        System.out.println("Ques:-->> check what is the result: \n");
        byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;
         double result=(f*b)+(i%c)-(d-s);
         System.out.println(result);
    }
}
