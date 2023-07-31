package Bit_Manuplation;
import java.util.*;
public class Bit_Manup {
    public static void Even_Odd(int n){
        int bit=1;
        if((n & bit) ==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static int GetIthBit(int n,int i){
        int bit=1<<i;
        if((n&bit)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int SetIthBit(int n,int i){
        int bit=1<<i;
        return n|bit;
    }
    public static int ClearIthBit(int n,int i){
        int bit=~(1<<i);
        return n & bit;
    }
    public static int ClearLastIthbit(int n, int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        // Even_Odd(3);
        // Even_Odd(6);
        // Even_Odd(13);
        // System.out.println(GetIthBit(13, 2));
        // System.out.println(SetIthBit(15, 2));
        // System.out.println(ClearIthBit(11, 3));
        System.out.println(ClearLastIthbit(12, 4));
    }
}
