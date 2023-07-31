import java.lang.ref.Cleaner;

public class Binary {
    public static int Binary_Search(int Arr[],int key){
        int start=0,end=Arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(Arr[mid]==key){
                return mid;
            }
            if(Arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

        //---Reverse a array---->>>
 
    public static void Reverse(int array[]){
        int first=0,last=array.length-1;
        int temp;
        while(first<last){
            temp=array[last];
            array[last]=array[first];
            array[first]=temp;
            first++;
            last--;
        }
    }
 
  

        // --->>>Print the pair of an array --->>>


        public static void Print_pair(int Number[]){
            int count=0;
            for(int i=0;i<Number.length;i++){
                int curr=Number[i];
                for(int j=i+1;j<Number.length;j++){
                    System.out.print("("+curr+","+Number[j]+")");
                    count++;
                }
                System.out.println();
            }
            System.out.print("Number of pairs:"+count);
        }

        //---->>>>> Printing the Sub-Array ----->>>>

        public static void SubArray(int Number[]){
            int count=0;
             int Largest =Integer.MIN_VALUE;
             int Smallest=Integer.MAX_VALUE;
            for(int i=0;i<Number.length;i++){
                for(int j=i;j<Number.length;j++){
                    int sum=0;
                    for(int k=i;k<=j;k++){
                        System.out.print(Number[k]+" ");
                        sum=sum+Number[k];
                        count++;
                    }
                    System.out.print("-->>Sum of Sub-Array="+sum);
                    if(Largest < sum){
                        Largest=sum;
                    }
                    if(Smallest>sum){
                        Smallest=sum;
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("Number of Sub-Array="+count);
            System.out.println("Largest sum of the array="+Largest);
            System.out.println("Smallest sum of the array="+Smallest);
        }

        public static void main(String args[]){
            // --->>> Reverse a array --->>>>
            int Arr[]={2,4,6,8,10};
    //      Reverse(Arr);
     //     for(int i=0;i<Arr.length;i++){
       //        System.out.print(Arr[i]+" ");
         // }
            Max_Sub_Arr_Sum(Arr);
         //Print_pair(Arr);   
    }

    public static void Max_Sub_Arr_Sum(int number[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                curr=0;
                for(int k=i;k<=j;k++){
                    curr+=number[k];
                }
                System.out.println(curr);
                if(max<curr){
                    max=curr;
                }    
            }
        }
        System.out.println("Max sum of sub arr is :"+max);
    }
}