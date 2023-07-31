import java.util.*;
public class factorial{
    
    public static int fact_orial(int n){
        System.out.print("\n********* Calculate the Factorial********\n");
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    
    public static int BoiCoff(int n, int r){
        System.out.print("\n*********Function to calculate Bionomial cofficient Factorial********\n");
        int fact_n=fact_orial(n);
        int fact_r=fact_orial(r);
        int fact_nmr=fact_orial(n-r);
        
        int BoiCoff=fact_n/(fact_r*fact_nmr);

        return BoiCoff;
    }
    public static Boolean isPrime(int n){
        //System.out.print("\n*********Function to calculate Prime number or not ********\n");
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public static  void PrimeInRange(int n){
        //System.out.print("\n*********Function to calculate Prime number ********\n");

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the value of n:");
        //int n=sc.nextInt();
        //System.out.print("Enter the value of r:");
        //int r=sc.nextInt();        
        //System.out.println(BoiCoff(n,r));
        PrimeInRange(100);
    }
}
