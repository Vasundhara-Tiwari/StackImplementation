package stack;


import java.util.Scanner;

public class StackLinkedList {
    Node top;
    static Scanner sc = new Scanner(System.in);
    StackLinkedList(){
        top = null;
    }
    public void push(){
        int data = sc.nextInt();

        Node newNode = new Node();
        newNode.data = data;
        newNode.next=top;

        top = newNode;
    }
    public void pop(){
        if(top == null){
            System.out.println("Cannot delete, stack is empty: Underflow");
        } else {
            System.out.println("Element deleted: "+top.data);
            top = top.next;
        }
    }
}
