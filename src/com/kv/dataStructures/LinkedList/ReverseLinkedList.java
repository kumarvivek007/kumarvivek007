package com.kv.dataStructures.LinkedList;

public class ReverseLinkedList {
    static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data){
            this .data = data;
        }
    }
    //static ListNode head;
    public static ListNode reverse (ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while ( current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }

    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data+ " -> ");
            curr =curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(node1);
        ListNode head = reverse(node1);
        printList(head);



    }

}
