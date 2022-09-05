package DataStructures.LinkedLists;

public class DoublyLinkedLists {

    private DoubleNode head;
    private DoubleNode tail;

    public int getLength() {
        return length;
    }

    private int length;

    public DoublyLinkedLists(int value) {
        this.head = new DoubleNode(value);
        this.tail = this.head;
        this.length = 1;
    }

    public DoublyLinkedLists append(int value){
        DoubleNode node = new DoubleNode(value);

        node.prev = this.tail;
        this.tail.next = node;
        this.tail = node;

        this.length++;
        return this;
    }

    public DoublyLinkedLists prepend(int value){
        DoubleNode node = new DoubleNode(value);

        node.next = this.head;
        this.head.prev = node;
        this.head = node;

        this.length++;
        return this;
    }

    public int[] printList(){
        int[] intArr = new int[length];
        DoubleNode tempNode = this.head;
        for(int i=0; i<length; i++){
            intArr[i] = tempNode.value;
            tempNode = tempNode.next;
        }
        return intArr;
    }
    public int[] printListReverse(){
        int[] revArr = new int[length];
        DoubleNode tempNode = this.tail;
        for(int i=0; i<length; i++){
            revArr[i] = tempNode.value;
            tempNode = tempNode.prev;
        }
        return revArr;
    }
}
