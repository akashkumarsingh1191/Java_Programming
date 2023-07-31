import java.util.*;
public class Array_assignment{
    // ques 1:--->>> to print the number of 7's in the array...
    public static int number_in_array(int arr[][],int number){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(number==arr[i][j]){
                    count++;
                }
            }

        }
        return count;
    }
 
    // Ques -->> sum of the second row element....
    public static int sum(int[][]arr){
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[1][j];
        }
        return sum;
    }
    // Print the array..
    public static void printArr(int [][] arr){
        System.out.println("Print the array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,4,9,5},{11,4,3,6},{2,2,3,9}};
        //int arr[][]={{4,7,8},{8,8,7}};
        //int number=8;
        //int count=number_in_array(arr,number);
        //int sum=sum(arr);
        //System.out.println(sum);
        //---->>>>>>           <<<<<<<<<--------
        // transpose a matrix content..
        /*
        row=3,col=4;
        
        */
        printArr(arr);
        int row=3,col=4;
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        printArr(transpose);
    }
}