
import java.util.*;

public class LinkedList {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        //  step 1= create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step 2 - new Node =head
        newNode.next=head;  //link 

        // step 3 - head = newNode
        head=newNode;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        
    }
}
