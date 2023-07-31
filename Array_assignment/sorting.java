package Array_assignment;
import java.util.*;
public class sorting{
    public static void Bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void Insertsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
    } 


    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void spiral(int arr[][]){
        int startrow=0;
        int endrow=arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){  
            // top 
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            // right
            for(int i=startrow+1;i<=endrow;i++){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[i][endcol]+" ");
            }
            // bot tom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            // left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        // int arr[][]={3,2,5,7,6};
        // Insertsort(arr);
        // printarr(arr);
        int arr[][]={{1,2,3,4},
                    {6,7,8,9},
                    {11,12,13,14}};
        spiral(arr);
    }
}