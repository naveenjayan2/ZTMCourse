package Searching;

import DataStructures.Trees.BinarySearchTree;
import DataStructures.Trees.Node;

import java.util.ArrayList;

public class BreadthFirstSearchImpl extends BinarySearchTree {
    public Node currentNode;

    public ArrayList<Integer> breadthFirstSearch(BinarySearchTree bst){
        currentNode = bst.root;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Node> queue = new ArrayList<>();

        queue.add(currentNode);

        while (queue.size() > 0){
            currentNode = queue.get(0);
            queue.remove(0);
            list.add(currentNode.value);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(1);
        bst.insert(20);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);

        BreadthFirstSearchImpl breadthFirstSearchImpl = new BreadthFirstSearchImpl();
        System.out.println(breadthFirstSearchImpl.breadthFirstSearch(bst));

    }
}
