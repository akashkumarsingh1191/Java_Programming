import java.util.*;
public class Advance_pattern{


    public static void Hollow_rectangle(int Totrows,int Totcols){
        for(int i=1;i<=Totrows;i++){
            for(int j=1;j<=Totcols;j++){
                if(i==1||i==Totrows||j==1||j==Totcols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void invert_paramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_paramid_withNumber(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Floyd_Triangle(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void _0_1_Triangle_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // blank space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // blank space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void Solid_Rombus(int n){
        // inner loop
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void hollor_rhombus(int n){
        // inner loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if( i==1|| i==n || j==1 ||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    } 

    public static void Diamond(int n){
        //first half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //Star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int Totrows=sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int Totcols=sc.nextInt();


        Hollow_rectangle(Totrows,Totcols);*/
        //invert_paramid(10);
        //inverted_half_paramid_withNumber(5);
        //Floyd_Triangle(3);
        //butterfly(10);
        //_0_1_Triangle_pattern(5);
        //hollor_rhombus(10);
        Diamond(10);
        //Solid_Rombus(10);
    }
}