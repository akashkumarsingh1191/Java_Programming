/*import java.util.*;
public class assignment{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch;

        int test_case=sc.nextInt();
        for(int i=0;i<test_case;i++){
            int row=sc.nextInt();
            int col=sc.nextInt();
            for( i=0;i<row;i++){
                int count=0;
                for(int j=0;j<col;j++){
                    ch=sc.next().charAt(0);
                    if(ch=='#'){
                        count++;
                    }
                }
                
                System.out.println(count);
                System.out.println();
            }
            System.out.println();
        }
        
    }
}*/
/* import java.util.*;
import java.lang.Math;

class TestClass {
  public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            int c=0,r=0;
            for(int i=0;i<n;i++){
                String s=sc.nextLine();
                s=s.replaceAll("\\.","");
                c=s.length();
                r=Math.max(r,c);

                }
            System.out.println(r);
        }
    }
 */
import java.util.*;
import java.lang.Math;
public class assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int TS;
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int sum=0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                sum=sum+(int)(Math.pow(2,j)*b);
                System.out.print((sum+a) +" ");
            }
            System.out.println();
        }
    }
}
