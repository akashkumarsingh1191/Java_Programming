import java.util.*;
public class Basics_java{
    /*public static void main(String args[]){
        System.out.print("Hello World!\n");
        System.out.println("Hello Akash!");
        System.out.println("Hello Riya!");
        System.out.println("Hello Rahul");
        System.out.println("Hello BAjaranji");
        System.out.println("Namastay INDIA!");
        System.out.println("Welcome To Hacking World!");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
