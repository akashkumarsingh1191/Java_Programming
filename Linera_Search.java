import java.util.*;
public class Linera_Search{
        //---->>>>>Linear Search--->>>>
    public static int Linear_Search(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i+1;
            }
        }
        return -1;
    }

        //---->>>getNumber----->>>>>

        
    public static int getNumber(int number[]){
        int Largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(Largest<number[i]){
                Largest=number[i];
            }
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        System.out.println("Smallest number is:"+Smallest);
        return Largest;
    }
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        Scanner sc=new Scanner(System.in);
        int key=10;
        int index=Linear_Search(number, 16);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is Found at index:"+index);
        }
        //int number[]={1,3,5,2,7,8,3,6};
        //System.out.println("Largest number is :"+getNumber(number));
    }
}