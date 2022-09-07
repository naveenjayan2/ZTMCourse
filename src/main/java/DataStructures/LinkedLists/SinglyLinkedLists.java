package DataStructures.LinkedLists;

public class LinkedLists {

    private Node head;
    private Node tail;
    private int length;

    public LinkedLists(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        length = 1;
    }

    public LinkedLists append(int value){
        Node newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        return this;
    }

    public LinkedLists prepend(int value){
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
        return this;
    }

    public LinkedLists insert(int index, int value){
        Node newNode = new Node(value);
        if(index==0){
            prepend(value);
        }else if (index>=length){
            append(value);

        }else{
            int i=0;
            Node tempNode = this.head;
            while(i<length){

                if(i==index-1){
                    Node holdNode = tempNode.next;
                    tempNode.next = newNode;
                    newNode.next = holdNode;
                    this.length++;
                    break;
                }
                tempNode = tempNode.next;
                i++;
            }
        }
        return this;
    }

    public LinkedLists remove(int index){

        if(index>length-1){
            return this;
        }
        else if(index==0){
            this.head = this.head.next;
            length--;
        }
        else{
            Node tempNode = this.head;

            int i=0;

            while(i<length){
                if(i==index-1){
                    tempNode.next = tempNode.next.next;
                    this.length--;
                    break;
                }
                tempNode = tempNode.next;
                i++;
            }
        }

        return this;
    }

    public LinkedLists reverse(){

        Node first = this.head;
        Node second = this.head.next;

        while(second!=null){
            Node tempNode = second.next;
            second.next = first;
            first = second;
            second = tempNode;
        }
        this.head.next = null;
        this.head = first;
        return this;
    }

    public int[] printList(){
        int[] intArr = new int[length];
        Node node = this.head;
        for(int i=0; i<length; i++){
            intArr[i] = node.value;
            node = node.next;
        }
        return intArr;
    }
}


