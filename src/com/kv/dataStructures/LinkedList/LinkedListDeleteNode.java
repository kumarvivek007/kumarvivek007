package com.kv.dataStructures.LinkedList;

public class LinkedListDeleteNode {
    static class Node{
        int data ;
        Node next;
        Node(int d)
        {
            data =d;
            next = null;
        }
    }

    public static void deleteNode(Node head, int key){
        Node curr = head;
        System.out.println("Deleting node");
        Node prev = curr;
        while(curr != null){
            if(curr.data == key && curr.next != null){
               curr.data = curr.next.data;
               curr.next =curr.next.next;
            }
            if(curr.data == key && curr.next == null){
                prev = null;
            }
            prev = curr;
            curr= curr.next;
        }
        printList(head);

    }
    public static void printList(Node head){
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();


    }

    public static void main( String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        printList(node1);
        deleteNode(node1, 4);

    }
}
