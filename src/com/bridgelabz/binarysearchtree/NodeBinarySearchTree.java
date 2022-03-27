package com.bridgelabz.binarysearchtree;

class Node {
    int data;
    Node left, right;
}
public class NodeBinarySearchTree {
    public Node insert(Node node,int data) {
        if (node == null ){
            return createNode(data);
        }
        if ( data < node.data){
            node.left = insert(node.left,data);

        }else if (data > node.data){
            node.right = insert(node.right,data);
        }
        return node;
    }
    private Node createNode(int data) {
        Node root = new Node();
        root.data = data;
        root.left = null;
        root.right = null;
        return root;
    }

    public boolean searchNode(Node node,int data){
        if (node == null) return false;
        boolean isPresent = false;
        while (node != null){
            if (data < node.data){
                node = node.left;
            }
            else if(data > node.data){
                node=node.right;
            }
            else {
                isPresent = true;
                break;
            }
        }
        return  isPresent;
    }


}
