package com.kv.dataStructures.LinkedList;

public class LLRemoveKthNode {


    public static void main(String arg[]){
        LinkedList list= new  LinkedList(0);
        LinkedList list1= new  LinkedList(1);
        LinkedList list2= new  LinkedList(2);
        LinkedList list3= new  LinkedList(3);
        LinkedList list4= new  LinkedList(4);
        list.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        printList(list);
        System.out.println();

        removeKthNodeFromEnd(list ,1);

        System.out.println();

        printList(list);



    }

    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        LinkedList temp = head;
        int len  = 0;
        while (temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;
        if(len<k){
            return;
        }
        int pos = len - k;
        while(pos > 0 && temp.next!= null){
            temp = temp.next;
            pos--;
        }


        temp.value = temp.next.value;
        temp.next = temp.next.next;
    }

    public static void printList (LinkedList head){
        LinkedList curr = head;
        while(curr != null){
            System.out.print(curr.value +" -> ");
            curr = curr.next;
        }
    }
    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
