import java.util.*;
public class operation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // add - O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(12);
        list.add(11);
        list.add(8);
        list.add(90);
        System.out.println(list);
        // get operation - O(n)
        int element=list.get(5);
        System.out.println(element);

        // delete - O(n)
        list.remove(5);
        System.out.println(list);

        // set
        list.set(5, 10);
        System.out.println(list);

        // contain
        System.out.println(list.contains(7));
        System.out.println(list.contains(10));

        // add - O(n)
        list.add(1,24);
        System.out.println(list);

        System.out.println("using size() to print the size of list");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
