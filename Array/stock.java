import java.util.*;
import java.math.*;
public class stock {
    public static int buy_sell_stock(int price[]){
        int buystock=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buystock < price[i]){
                int profit=price[i]-buystock;
                maxprofit=Math.max(profit, maxprofit);
            }
            else{
                buystock=price[i];
            }

        }
        return maxprofit;
    }

    public static int Trapedwater(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        // int n=height.length;
        // int leftmax[]=new int[n];
        // leftmax[0]=height[0];
        // for(int i=1;i<n;i++){
        //     leftmax[i]=Math.max( height[i],leftmax[i-1]);
        // }

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }

        // int rightmax[]=new int[n];
        // rightmax[n-1]=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //     rightmax[i]=Math.max(height[i],rightmax[i+1]);
        // }

        int TrapWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            TrapWater+=waterlevel-height[i];
        }
        return TrapWater;

        // int trapwater=0;
        

        // for(int i=0;i<n;i++){
        //     int waterlevel=Math.min(leftmax[i], rightmax[i]);
        //     trapwater+=waterlevel-height[i];
        // }
        // return trapwater;

    }

    public static void bubblesort(int arr[]){
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
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void Insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int pre=i-1;
            while(pre>=0 && arr[pre]>curr){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
        }


    }

    public static void main(String args[]){
        // int arr[]={2,4,3,7,5,4,1};
        // bubblesort(arr);
        int arr[]={5,4,1,3,2};
        // selectionsort(arr);
        Insertionsort(arr);
        printarr(arr);
    }

}
