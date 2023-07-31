public class max_arr{
    public static void Max_Sum_arr(int Number[]){
        int Largest=Integer.MIN_VALUE;
        int curr;
        int Prefix[]=new int[Number.length];
        Prefix[0]=Number[0];
        for(int i=1;i<Number.length;i++){
            Prefix[i]=Prefix[i-1]+Number[i];
        }
        for(int i=0;i<Number.length;i++){
            int start=i;
            for(int j=i;j<Number.length;j++){
                int end=j;
                curr=start==0 ? Prefix[end] : Prefix[end]-Prefix[start-1];

                if(Largest<curr){
                    Largest=curr;
                }
            }
        }
        System.out.print("Max sub-Arr"+Largest);
    }

    public static void max_sum_Kadane(int num[]){
        int current_sum=0;
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            current_sum+=num[i];
            if(current_sum<0){
                current_sum=0;
            }
            Largest=Math.max(Largest,current_sum);
        }
        System.out.println("Max sum is:"+Largest);
    }
    public static void main(String args[]){
        int number[]={-1,-1,6,-2,6};
        max_sum_Kadane(number);
    }
}