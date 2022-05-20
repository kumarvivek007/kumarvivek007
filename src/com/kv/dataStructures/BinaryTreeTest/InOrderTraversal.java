package com.kv.dataStructures.BinaryTreeTest;

/**
 *            5
 *       3         7
 *     2    4     6    8
 */

public class InOrderTraversal {
    public static void main(String args[]){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(6);
        Node g = new Node(8);
        a.left =b;
        a.right =c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        TreeTraversal tree =  new TreeTraversal();
        System.out.println("\n Inorder Traversal ===>");
        tree.inOrder(a);
        System.out.println("\n preorder Traversal ===>");
        tree.preOrder(a);

    }
}

/*class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}*/

class TreeTraversal{
    // inorder=  2 3 4 5 7 6 8
    void inOrder(Node root){
        if( root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //postOrder = 5 3 2 4 7 6 8
    void preOrder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
