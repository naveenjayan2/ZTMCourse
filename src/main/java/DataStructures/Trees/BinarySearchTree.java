package DataStructures.Trees;

public class BinarySearchTree {

    public Node root;
    public int elements = 0;

    public BinarySearchTree() {
        this.root = null;
    }

    private BinarySearchTree insertNode(Node node, int value , Node newNode){

        if(value < node.value){
            if(node.left == null){
                node.left = newNode;
                elements++;
            }else{
                insertNode(node.left,value,newNode);
            }
        }else{
            if(node.right == null){
                node.right = newNode;
                elements++;
            }else{
                insertNode(node.right,value, newNode);
            }
        }
        return this;
    }

    public void insert(int value){
        Node newNode = new Node(value);

        if (this.root == null){
            this.root = newNode;
            elements++;
        }
        else{
            insertNode(this.root, value, newNode);
        }
    }

    public void printWithSpace(int numOfSpace, int value){
        for(int i=0; i<numOfSpace; i++){
            System.out.print("-");
        }
        System.out.print(value);
        for(int i=0; i<numOfSpace; i++){
            System.out.print("-");
        }
    }
    public void lookup(int value){
        if(this.root.value == value){
            printWithSpace(elements,value);
        }
        else{
            printWithSpace(elements,this.root.value);
            elements=elements-2;
            System.out.println("");
            lookupNode(this.root, value);
        }
    }

    public void lookupNode(Node node, int value){
        if(value < node.value){
            if(value==node.left.value){
                printWithSpace(elements,node.left.value);
            }else{
                elements=elements-2;
                printWithSpace(elements,node.left.value);
                System.out.println("");
                lookupNode(node.left,value);
            }
        }else{
            if(value == node.right.value){
                printWithSpace(elements,node.right.value);
            }else{
                elements=elements+2;
                printWithSpace(elements,node.right.value);
                System.out.println("");
                lookupNode(node.right,value);
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);
        System.out.println("Elements: " + bst.elements);

        bst.lookup(170);
    }
}
