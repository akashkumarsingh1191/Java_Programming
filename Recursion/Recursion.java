package Recursion;
//  Creating a class name Recursion
public class Recursion{
    // Creating a function to print number in Decreasing order 
    public static void printreverse(int n){    // Function create
        if(n==1){   //Base case.
            System.out.println(n);
               return;
            }
        System.out.print(n+" ");
        printreverse(n-1); // Function call...
    }
    // creating  a function to pring number in Increasing order..

    public static void printInc(int n){     //function create
        if(n==1){       //Basecase
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);      //Function called
        System.out.print(n+" ");
    }

    // Factorial of a number..

    public static int fact(int num){        //function create..
        if(num==0){     //BaseCase..
            return 1;
        }
        return num*fact(num-1);     //function called...
    }
    public static void main(String args[]){     //Main function...
        int n=10;
        int num=5;
        printreverse(n);    //Descending Order Function is called...
        printInc(n);        //Ascending order Function is called...
        System.out.println("");
        System.out.println(fact(num));  //Factorial function is called...
    }

}