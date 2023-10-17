public class fib{
    // calculate nth term in fibonacci
    public static int fab(int num){
        if (num==0 || num==1){
            return num;
        }
        int fnm1=fab(num-1);
        int fnm2=fab(num-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // WAP to find the first Occurence in the array

    public static int firstOcc(int arr[],int key,int i){
        if (i == arr.length-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOcc(arr,key, i+1);
    }

    public static int lastOcc(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
        }
        int isfound=lastOcc(arr, key, i+1);
        if (isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    // WAP to calculate X^n
    public static int power(int x,int n){
        if (n==1){
            return x;
        }
        int xnm1=power(x, n-1);
        int xn=x*xnm1;
        return xn;
    }
    // Optimized X^n
    // Complexity O(n)
    public static int OptimizPow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpowsq=OptimizPow(x, n/2)*OptimizPow(x, n/2);
        if (n%2!=0){
            halfpowsq=x*halfpowsq;
        }
        return halfpowsq;
    }
    // Complexity O(logn)
    public static int OptimizedPow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfsq=OptimizPow(x, n/2);
        int halfpowsq=halfsq*halfsq;
        if (n%2!=0){
            halfpowsq=x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String[] args) {
        // for fabiccanaci
        // int num=3;
        // System.out.print(fab(num));
        // for array is sorted
        // int arr[]={1,2,3,4,5};
        // System.out.print(isSorted(arr, 0));
        // first occurence of element
        int arr[]={8,3,6,9,3,10,5,2,3,5};
        // int idx=firstOcc(arr, 5, 0);
        // System.out.println("element found at index :"+idx);
        // Last Occurence of element
        // System.out.println(lastOcc(arr, 5, 0));
        // for X^n
        // System.out.println(power(2, 10));
        // Optimized X^n
        System.out.println(OptimizPow(2, 10));
        System.out.println(OptimizedPow(2, 10));
    }
}