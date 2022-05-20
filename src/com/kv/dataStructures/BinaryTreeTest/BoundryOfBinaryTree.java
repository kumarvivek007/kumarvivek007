package com.kv.dataStructures.BinaryTreeTest;

import java.util.ArrayList;
import java.util.List;
// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }
// edge case 1 if root is null
// edge case 2 if root is the only node
public class BoundryOfBinaryTree {
    public static void main(String [] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);
        root.left = a;
        root.right = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = f;
        BoundryOfBinaryTree bobj =  new BoundryOfBinaryTree();
        System.out.println( bobj.boundary(root));

    }
    public ArrayList<Integer> boundary(Node node)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(node != null){
            if(!isLeafNode(node)) result.add(node.data); // check if root is the only node then
            addLeftBoundry(node,result);
            addleafNodes(node,result);
            addRightBoundry(node,result);
        }

        return result;
    }

    boolean isLeafNode(Node node){
        return (node.left == null && node.right == null);
    }
    void addLeftBoundry(Node node, List<Integer> result){
        Node curr= node.left;
        while(curr != null){
            if(! isLeafNode(curr)) {
                result.add(curr.data);
            }
            if(curr.left == null){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }
    }
    void addleafNodes(Node node,List<Integer> result) {
        if(isLeafNode(node)){
            result.add(node.data);
            return;
        }
        if(node.left != null){
            addleafNodes(node.left, result);
        }
        if(node.right != null){
            addleafNodes(node.right, result);
        }
    }
    void addRightBoundry(Node node, List<Integer> result){
        Node curr = node.right;
        ArrayList<Integer> tempList =  new ArrayList<>();
        while (curr != null){
            if(! isLeafNode(curr)) {
                tempList.add(curr.data);
            }
            if(curr.right == null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
        for (int i= tempList.size()-1 ; i>=0; i--){
            result.add(tempList.get(i) );
        }
    }
}
