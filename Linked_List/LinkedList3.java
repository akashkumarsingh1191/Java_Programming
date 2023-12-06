public class LinkedList3 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node Next;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }

    public void delNthfromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itoNode=sz-n;
        Node prev=head;
        while(i < itoNode){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean pallindrone(){
        if(head==null || head.next == null){
            return true;
        }
        // step1 - find mid
        Node mid=findMid(head);
        // step - 2 reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while (curr!=null) {
            next=curr.next;   
            curr.next=prev;
            prev=curr;
            curr=next;         
        }
        Node right = prev;  //right half head
        Node left=head;
        // step - 3 check left half & right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("\nPrinting the Linked List");
        ll.print();
        System.out.println("\nReversing the LinkedList");
        ll.reverse();
        ll.print();
        System.out.println("\nDeleting the nth node from last");
        ll.delNthfromEnd(3);
        ll.print();
        System.out.println("\nChecking Linked List is palindrome or not");
        System.out.println(ll.pallindrone());
    }
}
