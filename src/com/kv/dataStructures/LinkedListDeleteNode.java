package com.kv.dataStructures;

public class LinkedListDeleteNode {
    static class Node{
        int data ;
        Node next;
        Node(int d){
            data =d;
            next = null;
        }
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
        }
    }

    public static void Main( String[] args){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        printList(node1);

    }
}
