public class Incrord{
    public static void IncrOrder(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        IncrOrder(n-1);
        System.out.print(n+" ");
    }

    // cal the sum of first n natural number
    public static int calSum(int num){
        if (num==1){
            return 1;
        }
        int snm1=calSum(num-1);
        int sum=num+snm1;
        return sum;
    }
    public static void main(String args[]){
        // int n=7;
        // IncrOrder(n);
        System.out.println(calSum(5));
    }

}