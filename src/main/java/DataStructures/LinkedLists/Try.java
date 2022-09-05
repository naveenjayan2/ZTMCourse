package DataStructures.LinkedLists;

import java.util.Arrays;

class Try{
    public static void main(String[] args) {
        System.out.println("********Singly Linked Lists**********");
        LinkedLists linkedLists = new
                LinkedLists(10);
        linkedLists.append(16);
        linkedLists.prepend(24);
        linkedLists.append(50);
        System.out.println(Arrays.toString(linkedLists.printList()));
        linkedLists.insert(4,99);
        System.out.println(Arrays.toString(linkedLists.printList()));
        linkedLists.remove(1);
        linkedLists.remove(0);

        System.out.println(Arrays.toString(linkedLists.printList()));
        System.out.println(Arrays.toString(linkedLists.reverse().printList()));

        System.out.println("********Doubly Linked Lists**********");
        DoublyLinkedLists doublyLinkedLists = new
                DoublyLinkedLists(15);
        doublyLinkedLists.append(19);
        doublyLinkedLists.prepend(27);
        System.out.println(doublyLinkedLists.getLength());
        System.out.println(Arrays.toString(doublyLinkedLists.printList()));
        System.out.println(Arrays.toString(doublyLinkedLists.printListReverse()));
    }
}
