public class pairFriend {
    public static int friend(int n){
        if (n==1 | n==2){
            return n;
        }
        // single friend
        int fnm1=friend(n-1);
        // pair
        int fnm2=(n-1)*friend(n-2);
        // int pairWay=(n-1)*fnm2;
        int totWay=fnm1+fnm2;
        return totWay;
    }

    // Print Binary String with Consecutive '1'

    public static void printBinaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastplace==0){
            printBinaryString(n-1, 0, str+"0");
            printBinaryString(n-1, 1, str+"1");
        }
        else{
            printBinaryString(n-1, 0, str+"0");
        }
    }

    // Print Binary String with Consecutive '0'
    public static void printBinaryString0(int n,int lastplace,String str){
        if (n==0){
            System.out.println(str);
            return;
        }
        // if(lastplace==1){
        //     printBinaryString(n-1,1, str+"1");
        //     printBinaryString(n-1,0, str+"0");
        // }
        // else{
        //     printBinaryString(n-1,1, str+"0");
        // }

        // OR
        printBinaryString0(n-1, 1, str+"1");
        if(lastplace==1){
            printBinaryString0(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        // int n=4;
        // System.out.println(friend(n));
        int n=3;
        String str="";
        printBinaryString(n, 0, str);
        System.out.println(" ");
        printBinaryString0(n, 1, str);
    }
}
