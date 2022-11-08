package Searching;

import DataStructures.Trees.Node;
import DataStructures.Trees.BinarySearchTree;

import java.util.ArrayList;

public class DepthFirstSearchImpl {
    ArrayList<Integer> output = new ArrayList<>();


    public ArrayList<Integer> preOrder(BinarySearchTree input){

        preOrderRec(input.root);
        return output;
    }

    public void preOrderRec(Node node){

        if(node.left != null){
            preOrderRec(node.left);
        }
        output.add(node.value);
        if(node.right != null){
            preOrderRec(node.right);
        }
    }

    public ArrayList<Integer> inOrder(BinarySearchTree input){

        inOrderRec(input.root);
        return output;
    }

    public void inOrderRec(Node node){
        output.add(node.value);
        if(node.left != null){
            inOrderRec(node.left);
        }
        if(node.right != null){
            inOrderRec(node.right);
        }
    }

    public ArrayList<Integer> postOrder(BinarySearchTree input){

        postOrderRec(input.root);
        return output;
    }

    public void postOrderRec(Node node){
        if(node.left != null){
            postOrderRec(node.left);
        }
        if(node.right != null){
            postOrderRec(node.right);
        }
        output.add(node.value);

    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(10);
        bst.insert(4);
        bst.insert(9);
        bst.insert(20);
        bst.insert(1);
        bst.insert(5);
        bst.insert(20);

        DepthFirstSearchImpl dfs1 = new DepthFirstSearchImpl();
        DepthFirstSearchImpl dfs2 = new DepthFirstSearchImpl();
        DepthFirstSearchImpl dfs3 = new DepthFirstSearchImpl();

        System.out.println(dfs1.preOrder(bst));
        System.out.println(dfs2.inOrder(bst));
        System.out.println(dfs3.postOrder(bst));


    }
}
