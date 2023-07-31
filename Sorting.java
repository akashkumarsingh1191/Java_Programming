import java.util.*;
public class Sorting{     
    public static void Bubble_Sort(int arr[]){
        int count=0;
        // Checking the array in ascending order
        for(int i=0;i<arr.length-1;i++){
            
            if((arr[i]<arr[i+1]) || (arr[i]>arr[i+1])){
                count=0;
            }else{
                count++;
            }
        } // array is ascending order print array is sorted.
        if(count==0){
            System.out.println("Array is already sorted");
        }else{ // if array is not sorted.
            for(int turn=0;turn<arr.length-1;turn++){
                for(int j=0;j<arr.length-1-turn;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }

    public static void PrintArr(int arr[]){// function to print the array.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }


    public static void Selection_Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j])
                minpos=j;
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int arr[]={10,9,8,7,6,5,4,3,2,1,0};
        Insertion_sort(arr);
        PrintArr(arr);
        Bubble_Sort(arr); // calling the Bubble Function
        PrintArr(arr);
        Selection_Sort(arr);
        PrintArr(arr);  // calling the Print array function to print array.
    }
}
/*
import java.util.*;
public class Sorting{
    public static void Bubble_Sort(int arr[]){

        // 5,2,4,1,3
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   
    }

    public static void Selection_Sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    } 
    public static void PrintArr(int arr[]){// function to print the array.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void main(String args[]){
        int num[]={2,4,3,1,5};
        //Selection_Sort(num);
        Insertion_sort(num);
        //Bubble_Sort(num);
        PrintArr(num);
    }
} */