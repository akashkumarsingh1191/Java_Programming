import java.util.LinkedList;
public class LinkedList5 {
    public static void main(String[] args) {
        // create a linkedList
        LinkedList<Integer> ll=new LinkedList<>();
        // add node in first
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(5);
        System.out.println("Adding first node "+ ll);
        // add last
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(6);
        System.out.println("After add last node "+ll);
        //  remove the node
        ll.removeFirst();
        System.out.println("After  removing first node"+ ll);
        ll.removeLast();
        System.out.println("After  removing last node"+ ll);
    }
}
