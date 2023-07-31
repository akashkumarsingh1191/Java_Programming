/*import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer num1=sc.nextInt();
        System.out.println(num1);
        Integer num2=sc.nextInt();
        System.out.println(num2);
        int sum=num1+num2;
        System.out.println(sum);
    }
}*/
/*import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        System.out.println(c);
    }
}
public class sum {
    public static void twoSum(int num[], int target) {
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int sum=num[i]+num[j];
                if(sum==target){
                    System.out.print("["+i+","+j+"]");
                }
            }
        }
    }


    public static void main(String args[]){
        int num[]={2,7,11,15};
        int target=9;
        twoSum(num,target);
    }
} 
import java.util.*;
class Solution {
   /* public int Count_Odd(int low, int high) {
        int coun=0;
        for(int i=low;i<=high;i++){
            if(i%3==0){
                coun++;
            }
        }
        return coun;
} */
/*import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int coun=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0){
                coun++;
            }
        }
        //int coun=Count_Odd(low,high);
        System.out.print(coun);
    }
}*/
class Solution {
    public int Count_Odd(int low, int high) {
        int coun=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0){
                coun++;
            }
        }
        return coun;
}
    public static void main(String args[]){
        
        int low=3;
        int high=7;
        int coun=0;
        for(int i=low;i<=high;i++){
            if(i%2!=0){
                coun++;
            }
        }
        //int coun=Count_Odd(low,high);
        System.out.print(coun);
    }
}