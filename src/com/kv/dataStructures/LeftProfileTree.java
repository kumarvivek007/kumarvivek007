package com.kv.dataStructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Print Left  view of a tree.
 *         1
 *    2          3
 *        5   6      7
 *           8
 *   o/p: [1,2,5,8]
 */

public class LeftProfileTree {







    public static void main(String [] args){
        Node root = new Node(1);
        Node a= new Node(2);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);
        root.left =  a;
        root.right = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = f;

        Tree tree = new Tree();
        tree.printTree(root);

        List<Integer> list = new ArrayList<>();

        System.out.println("");

        System.out.println("Only Left View of the tree");
        tree.printOnlyLeftView(root,1);

        System.out.println("Left View of the tree");

        tree.printLeftView(root.left,1, list);

        System.out.println("");

        System.out.println("Right View of the tree");
        Tree.max_val = 0;

        tree.printRightView(root,1,list);

        for(Integer i: list){
            System.out.print(i+" ");
        }
    }
}

class Node{
    int data;
    Node right , left;
    public Node(int data){
        this.data = data;
        this.right = this.left = null;
    }
}

class Tree {
    static int max_val = 0;

    public void printTree(Node root){
        if(root == null) {
            return;
        }

        printTree(root.right);

        printTree(root.left);
        System.out.print( root.data +"  ");

    }

    public void printOnlyLeftView(Node root, int level){
        if(root == null) {
            return;
        }

        if(max_val < level ){
            System.out.print (root.data +"  ");
            //list.add( root.data);
            max_val = level;
        }

        printOnlyLeftView(root.left, level+1);
        printOnlyLeftView(root.right, level+1);

    }

    public void printLeftView(Node root, int level,List<Integer> list){
        if(root == null) {
            return;
        }

        if(max_val < level ){
            list.add( root.data);
            max_val = level;
        }

        printLeftView(root.left, level+1,list);

        //printLeftView(root.right, level+1);

    }

    public void printRightView(Node root, int level, List<Integer> list){
        if(root == null) {
            return;
        }

        if(max_val < level ){
           list.add( root.data);
            max_val = level;
        }

        printRightView(root.right, level+1, list);
        printRightView(root.left, level+1,list);



    }
}