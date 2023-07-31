import java.lang.annotation.Target;
import java.util.*;
public class assignment3{
    // Ques 1 -->> Array assignment 
    public static boolean twicenum(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int Rotated_arr(int arr[],int index,int target){
        for(int i=0;i<index;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={0,1,2,4,5,6,7};
        int index=3;
        int target=3;
        int val=Rotated_arr(arr,index,target);
        System.out.print(val);
        //System.out.print(twicenum(arr));
    }
}