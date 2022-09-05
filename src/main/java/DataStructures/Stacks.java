package DataStructures;

import DataStructures.LinkedLists.Node;

import java.util.ArrayList;

public class Stacks {
    private Node top = null;
    private Node bottom = null;
    private int length = 0;

    public Stacks() {
    }

    public int peek(){
        return this.top.value;

    }

    public void push(int value){
        Node newNode = new Node(value);
        if(this.length==0){
            this.top = newNode;
            this.bottom = newNode;
        }
        else{
            newNode.next = this.top;
            this.top = newNode;
        }
        this.length++;
    }

    public void pop(){
        if(this.top == this.bottom){
            this.bottom = null;
        }
        if(this.top != null) {
            Node tempNode = this.top.next;
            this.top = tempNode;
            this.length--;
        }
    }

    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        stacks.push(3);
        stacks.push(9);
        stacks.push(10);
        System.out.println(stacks.peek());
        stacks.pop();
        System.out.println(stacks.peek());
        stacks.pop();
        System.out.println(stacks.peek());
        stacks.pop();
        System.out.println(stacks.peek());
    }
}
