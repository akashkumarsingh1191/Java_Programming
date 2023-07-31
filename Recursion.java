public class Recursion {
    // print the number in DEcreasing order..
    public static void printDec(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    //print number in Increasing order.. 
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    // Factorial of a number..
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        
        return n*factorial(n-1);
    }

    // sum of 1st n natural number..
    public static int calSum(int n){
        if (n==1){
            return 1;
        }
        int sum=n + calSum(n-1);
        return sum;
    }

    // Fibbonacci series..
    public static int fibbonacci(int n){
        if(n==0 ||n==1){
            return n;
        }
        int fnm1=fibbonacci(n-1);
        int fnm2=fibbonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    // check array is sorted or not..
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // first occurence of element..
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }

    // print the last Occurence of element..
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    } 
    // cal. the power of x..
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x, n-1);
        // int xn=x*xnm1;
        // return xn;
        return x*power(x, n-1);
    }
    // Optimized power solution..
    public static int optimizedPower(int x,int n ){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(x, n/2);
        int halfPowersq=halfPower*halfPower;
        //int halfPowersq=optimizedPower(x, n/2)*optimizedPower(x, n/2);
        if(n%2!=0){
            halfPowersq=x*halfPowersq;
        }
        return halfPowersq;
    } 
    // tilling problem..
    public static int tillingProb(int n) {
        if(n==0 ||n==1){
            return 1;
        }
        // vertical arrangement.
        
        int fnm1=tillingProb(n-1);
        
        //horizontal arrangement..
        int fnm2=tillingProb(n-2);
        
        int totwats=fnm1+fnm2;
        return totwats;
    }

    // remove dublicate string..
    public static void remDuplStr(String str,int idx, StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            remDuplStr(str, idx+1, newstr, map);
        }
        else{
            map[currChar-'a']=true;
            remDuplStr(str, idx+1, newstr.append(currChar), map);
        }
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        //printDec(10);
        //printInc(10);
        //System.out.println(factorial(5));
        //System.out.println(calSum(5));
        //System.out.println(fibbonacci(5));
        //System.out.println(isSorted(arr, 0));
        //System.out.println(firstOccurence(arr, 5, 0));
        //System.out.println(lastOccurence(arr, 5,0));
        //System.out.println(power(2, 10));
        //System.out.println(optimizedPower(2, 5));
        //System.out.println(tillingProb(5));
        String str="akashkumarsingh";
        remDuplStr(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
