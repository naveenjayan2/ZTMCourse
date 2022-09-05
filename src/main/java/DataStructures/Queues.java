package DataStructures;

import DataStructures.LinkedLists.Node;

import java.util.Queue;

public class Queues {

    private Node first = null;
    private Node last = null;
    private int length = 0;

    public Queues() {
    }

    public int peek(){
        if(first!=null){
            return this.first.value;
        }
        else return -99999;
    }
    public void enqueue(int value){
        if(length==0){
            Node newNode = new Node(value);
            this.first = newNode;
            this.last = newNode;
            length++;
        }
        else {
            Node newNode = new Node(value);
            this.last.next = newNode;
            this.last = newNode;
            this.length++;
        }

    }
    public void dequeue(){
        this.first = this.first.next;
        this.length--;
    }

    public static void main(String[] args) {
        Queues queues = new Queues();
        System.out.println(queues.peek());
        queues.enqueue(8);
        System.out.println(queues.peek());
        queues.enqueue(7);
        System.out.println(queues.peek());
        queues.enqueue(459);
        System.out.println(queues.peek());
        System.out.println(queues.peek());
        queues.dequeue();
        System.out.println(queues.peek());
    }
}
