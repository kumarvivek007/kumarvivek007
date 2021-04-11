import java.util.HashSet;

/**
 * Remove duplicate from LinkedList using hashset.
 */
public class LinkedListRemoveDuplicate {

    static class Node {
        int value;
        Node next;
        Node(int d){
            value =d;
            next = null;
        }
    }

    public static  class Chain {
        Node head;
        Node last;
        public  Chain add(int value){
            Node node = new Node(value);
            if(head == null){
                head = node;
                last= node;
            } else {
                last.next = node;
                last = node;
            }
            return this;
        }
    }

    public  static Chain removeDuplicate(Chain input) {
        Chain output = new Chain();
        HashSet<Integer> set = new HashSet();
        Node currentNode = input.head;
        while (currentNode != null ){
            if(! set.contains(currentNode.value)){
                set.add(currentNode.value);
                output.add(currentNode.value);
            }
            currentNode =currentNode.next;
        }

        return output;
    }

    public static void printList (Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.value +" -> ");
            curr = curr.next;
        }
    }

    public static void main (String []args) {
        Chain input = new Chain();
        input.add(10);
        input.add(12);
        input.add(11);
        input.add(11);
        input.add(12);
        input.add(11);
        input.add(10);
        System.out.println("LL with duplicate :");
        printList(input.head);

        System.out.println("LL without  duplicate :");

        Chain output = removeDuplicate(input);
        printList(output.head);


    }

}
