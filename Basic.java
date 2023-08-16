import java.util.*;
public class Basic{
    public static void main(String args[]){
        int X1,X2,Y1,Y2;
        Scanner sc=new Scanner(System.in);
        X1=sc.nextInt();
        Y1=sc.nextInt();
        System.out.println("Enter the (x2,y2) coordinate:");
        X2=sc.nextInt();
        Y2=sc.nextInt();
        int Length=X2-X1;
        int Height=Y2-Y1;
        int Area=Length*Height;
        System.out.println("Area of Rectangle is : " +Area);

        System.out.println("Ques 2:---------->>>><<<<<<<------------");
        char ch;
        int m1,m2,m3;
        System.out.println("Enter the first Character of the name : ");
        ch=sc.next().charAt(0);
        System.out.println("Enter the first marks of the subject : ");
        m1=sc.nextInt();
        System.out.println("Enter the second marks of the subject : ");
        m2=sc.nextInt();
        System.out.println("Enter the third marks of the subject : ");
        m3=sc.nextInt();
        int avg=(m1+m2+m3)/3;
        System.out.println(ch+" "+avg);


        
    }
}