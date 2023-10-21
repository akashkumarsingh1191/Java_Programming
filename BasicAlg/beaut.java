package BasicAlg;

import java.util.*;


public class beaut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter low:");
        int low = sc.nextInt();
        System.out.println("Enter high:");
        int high = sc.nextInt();
        System.out.println("Enter k:");
        int k = sc.nextInt();
        int c1 = 0, c2 = 0;
        for (int i = low; i <= high; i++) {
            if (low % 2 == 0) {
                c1 = c1 + 1;
            } else {
                c2 = c2 + 1;
            }
        }
        if(c1==c2){
            System.out.println("Number is beautiful");
        }
        else{
            System.out.println(("Number is not beautiful"));
        }
    }
}
