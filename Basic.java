import java.util.*;
public class Basic{
    public static void main(String args[]){
        int X1,X2,Y1,Y2;
        System.out.println("Enter the (x1,y1) coordinate:");
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
    }
}