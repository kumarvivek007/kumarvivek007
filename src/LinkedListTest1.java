public class LinkedListTest1 {
    Node head;

    static class Node {
        int data;
        Node next;
        Node (int d){
            data = d;
            next = null;
        }
    }

    public static void main (String args[]) {
        LinkedListTest1 list = new LinkedListTest1();
        list.head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(7);
        Node fourth = new Node(1);
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        list.addStarting(9);
        list.addAfter(third, 5);
        list.printList();
    }

    public void printList() {
        Node n = head;
        while( n != null ){
            System.out.print( n.data +"->");
            n=n.next;
        }
    }

    public void addStarting(int d) {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    public void addAfter(Node prevNode , int d) {
        Node newNode = new Node(d);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }

}

