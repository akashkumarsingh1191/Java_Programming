package Recursion;

public class Recursion{
    public static void printreverse(int n){
        if(n==1){
            System.out.println(n);
               return;
            }
        System.out.print(n+" ");
        printreverse(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int num){
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String args[]){
        int n=10;
        int num=5;
        printreverse(n);
        printInc(n);
        System.out.println("");
        System.out.println(fact(num));
    }

}