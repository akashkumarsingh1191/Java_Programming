import java.util.ArrayList;

public class L5 {
    // function for Pair Sum
    public static boolean pairSum(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Pairsum(ArrayList<Integer> list,int target){
        int i=0,j=list.size()-1;
        while(i<j){
            int Sum=list.get(i)+list.get(j);
            if(Sum == target){
                return true;
            }
            else if(Sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=1;
        System.out.println(list);
        System.out.println(pairSum(list, target));
        System.out.println(Pairsum(list, target));
    }
}
