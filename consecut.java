import java.util.*;
public class consecut{
    public static int Consecutive_Sum(int arr[]){
        int max=Integer.MIN_VALUE;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else if(max < count){
                max=count;
            }
            else{
                count=1;
            }
        }
        return max;
    }

        
    public static boolean Search_Mat(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key found at index: ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }

    public static Boolean search_Mat(int matrix[][],int key){
        int row=matrix.length-1,col=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Key found at index: ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>key){
                row--;
            }
            else{
                col++;
            }
            
        }
        System.out.println("Key does not exist!!");
        return false;
    }
    public static int SevenS(int matrix[][],int key){
        int count =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("key noy found!!!");
            return 0;
        }
        return count;
    }
    public static int sum_Mat(int matrix[][]){
        int sum=0;
        for(int j=0;j<matrix.length;j++){
                sum+=matrix[1][j];
        }
        return sum;
    }

    public static void transpose(int matrix[][]){
        int arr[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[j][i]=matrix[i][j];
                // System.out.print(arr[j][i]+" ");
            }
            // System.out.println();
        }
        printarr(arr);
    }
    public static void printarr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public boolean isPalindrome(int arr[]){
        int n=arr.length;
        int reverse[]=new int[n];
        for(int i=0;i<=n;i++){
            arr[n-1-i]=reverse[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=reverse[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        // int arr[]={0,1,0,1,1,0,1,1,1};
        // System.out.print(Consecutive_Sum(arr));
        // int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        // int key=30;
        // Search_Mat(matrix, key);
        // search_Mat(matrix, key);
        // int matrix[][]={{4,7,8},{8,8,7}};
        // int key=7;
        // int matrix[][]={{1,4,9},{11,4,3},{2,2,2}};
        // System.out.println(SevenS(matrix,key));
        // System.out.println(sum_Mat(matrix));
        // int matrix[][]={{1,2,3},{4,5,6}};
        // transpose(matrix);
        // printarr(matrix);
        int num=121;
        System.out.print(isPalindrome(num));
    }
}