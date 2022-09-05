package DataStructures;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.Stack;

public class QueueUsingStack {

    Stack mainStack = new Stack();
    Stack reverseStack = new Stack();
    int length = 0;
    int counter = 0;

    public QueueUsingStack() {
    }

    public void push(int x){
        for(int i=0; i<length; i++){
            reverseStack.push(mainStack.pop());
        }
        mainStack.push(x);
        for(int j=0; j<length; j++){
            mainStack.push(reverseStack.pop());
        }
        length++;
    }
    public int pop(){
        int val = (int) mainStack.pop();
        return val;
    }
//    public int peek(){
//
//    }
//
//    public boolean empty(){
//
//    }
}
