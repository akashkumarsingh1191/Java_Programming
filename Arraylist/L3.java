import java.util.ArrayList;

public class L3 {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[] args) {
        System.out.println(".........Maximium number in list...........");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(6);
        list2.add(8);
        System.out.println(list2);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list2.size();i++){
            if(max<list2.get(i)){
                max=list2.get(i);
            }
        }
        System.out.println("Maximium element = "+ max); 

        int idx1=1,idx2=3;
        System.out.println();
        System.out.println("Original list is \n" + list2);
        System.out.println("After swapping the list element :");
        swap(list2, idx1, idx2);
        System.out.println(list2);

    }
}
