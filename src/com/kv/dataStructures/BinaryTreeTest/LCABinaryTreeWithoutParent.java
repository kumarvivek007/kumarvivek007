package com.kv.dataStructures.BinaryTreeTest;


import java.util.ArrayList;

//Logic
// create 2 arrayList path1 and path2 to store the path of root to node n1 and root to node n2
// create a method findLCA(Node root, int n1, int n2)
// call findPath(Node root, int n, List<> path);
public class LCABinaryTreeWithoutParent {
   Node root;
   ArrayList<Integer> path1 =  new ArrayList<>();
    ArrayList<Integer> path2 =  new ArrayList<>();
    int findLCA(Node root,  int n1, int n2){
return 0;    }

    boolean findPath(Node  root, int n, ArrayList<Integer> path){
        if(root == null) {
            return false;
        }

        path.add(root.data);

        if(root.data == n){
            return true;
        }
        if(root.left != null && findPath(root.left, n,path)){
            return true;
        }
        if(root.right != null && findPath(root.right,n,path)){
            return true;
        }
        path.remove(path.size() -1);
        return  false;
    }
}
