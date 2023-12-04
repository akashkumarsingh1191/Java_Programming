
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
    public static int size;

    public void addFirst(int data){
        //  step 1= create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step 2 - new Node =head
        newNode.next=head;  //link 

        // step 3 - head = newNode
        head=newNode;
    }

    public void addLast(int data){
        // create a new node
        Node newNode=new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        // tail.next <<-- new node
        tail.next=newNode;
        // new node <<-- tail
        tail = newNode;

    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        
        ll.add(2, 9);
        ll.print();
        ll.add(3, 10);
        ll.print();
        System.out.println(ll.size);
        
    }

    public void removeFirst() {
    }

    public void removeLast() {
    }
}
