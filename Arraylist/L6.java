import java.util.ArrayList;

public class L6{
    public static boolean rotatedPair(ArrayList<Integer> list,int target){
        int Bp=-1;  // breaking point(pivot)
        int n=list.size();

        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                Bp=i;
                break;
            }
        } 

        int Rp=Bp;  //Largest value
        int Lp=Bp+1;    //Smallest value
        while(Lp != Rp){
            // case 1
            int Sum=list.get(Lp)+list.get(Rp);
            if(Sum == target){
                return true;
            }

            // case 2 : Sum < target  (lp++)
            else if(Sum < target){
                Lp=(Lp+1)%n;
            }else{      // sum > target  (rp--)
                Rp=(n+Rp-1)%n;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=20;
        System.out.println(list);
        System.out.print(rotatedPair(list, target));
    }
}