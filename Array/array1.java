import java.util.*;
import java.math.*;
public class array1{
    public static int LargestN(int arr[]){
        int num=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(num<arr[i]){
                num=arr[i];
            }
        }
        return num;
    }


    public static int BinarySearch(int arr[],int Si,int Ei,int Key){
        while(Si<=Ei){
            int mid=(Si+Ei)/2;
            if(arr[mid]==Key){
                return mid;
            }
            if(arr[mid]<Key){
                Si=mid+1;
            }else{
                Ei=mid-1;
            }
        }
        return -1;
    }
    
    // public static void Pairarr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         // int curr=arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             System.out.print("("+arr[i]+","+arr[j]+")");
    //         }
    //         System.out.println("");
    //     }
    // }
    

    
    // public static void maxsum(int arr[]){
    //     int max=Integer.MIN_VALUE;
    //     int prefix[]=new int[arr.length];
    //     prefix[0]=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         prefix[i]=prefix[i-1]+arr[i];
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             int currSum=0;
    //             currSum=i==0?prefix[j-1]:prefix[j]-prefix[i-1];
    //             if(max<currSum){
    //                 max=currSum;
    //             }
    //         }
    //     }
    //     System.out.println(max);
    // }

    // public static void maxsum(int arr[]){
    //     int max=Integer.MIN_VALUE;
    //     int prefix[]=new int[arr.length];
    //     prefix[0]=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //         prefix[i]=prefix[i-1]+arr[i];
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             int currSum=0;
    //             currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
    //             if(max<currSum){
    //                 max=currSum;
    //             }
    //         }
    //     }
    //     System.out.println(max);
    // } 

    // public static void kadanes(int arr[]){
    //     int max=Integer.MIN_VALUE;
    //     int currSum=0;
    //     for(int i=0;i<arr.length;i++){
    //         currSum=currSum+arr[i];
    //         if(max<currSum){
    //             max=currSum;
    //         }
    //         if(currSum<0){
    //             currSum=0;
                
    //         }
            // max=Math.max(currSum,max);
    //     }
    //     System.out.println(max);
    // }

        public static void main(String args[]){
        int marks[]={2,3,6,1,9,4,10};
        System.out.println(LargestN(marks));
        // int marks[]={2,3,4,6,8,10};
        // int marks[]={-2,-3,4,-1,-2,1,5,-3};
        // int num[]={-2,-4,-3,-1};
        // int marks[]={2,4,6,8,10};
        // ReverseArray(marks, 0, marks.length-1);
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
        System.out.println("item found at index"+BinarySearch(marks, 0, marks.length-1, 9));
        // System.out.println();
        // Pairarr(marks);
        // maxsum(marks);
        // kadanes(num);
    }
}