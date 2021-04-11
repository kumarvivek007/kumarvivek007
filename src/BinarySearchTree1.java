public class BinarySearchTree1 {
    class Node {
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right= null;
        }
    }



    Node root;

    void insert(int d){
        root = insertRec(root,d);
    }

    Node insertRec(Node root, int d){
        if (root== null){
            root = new Node(d);
            return root;
        }
        if(d > root.data){
            root.right = insertRec(root.right, d);
        } else if(d< root.data){
            root.left =  insertRec(root.left, d);
        }

        return root;

    }

    void inOrder(){
        inOrderRec(root);
    }

    void inOrderRec(Node root ){
        if( root != null){
            inOrderRec(root.left);
            System.out.println(root.data);
            inOrderRec(root.right);
        }
    }

    public static void main(String []args){
        BinarySearchTree1 tree = new BinarySearchTree1();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inOrder();

    }


}
