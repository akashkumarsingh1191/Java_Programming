public class LinkedList2 {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int helper(Node head,int key){
        if (head==null) {
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(5);
        ll.print();
        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(4));
    }
}
