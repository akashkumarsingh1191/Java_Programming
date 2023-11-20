class Solution {
    public static double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        double p=x*myPow(x,n-1);
        return p;
    }
    public static void main(String args[]){
        double x=2.00000;
        int n=10;
        System.out.println(myPow(x,n));
    }
}