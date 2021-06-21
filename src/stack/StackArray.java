package stack;

import java.util.Scanner;

public class StackArray {
    Scanner scanner = new Scanner(System.in);
    int arr[];
    int top;
    public StackArray(){
        arr = new int[10];
        top = -1;
    }
    public void push(){
        if(top == arr.length-1){
            System.out.println("Stack Overflow");
        } else {
            int data = scanner.nextInt();

            top++;
            arr[top] = data;
            System.out.println("element "+data+" inserted successfully at "+top);
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Element deleted: "+arr[top]);
            top--;
        }
    }
    public void traverse(){
        if(top == -1){
            System.out.println("Stack is Empty :- Underflow!!");
        }
        else {
            for(int i=top; i>=0; i--){
                System.out.println(arr[top]);
            }
        }
    }
    public void peek(){
        if(top == -1){
            System.out.println("Stack is Empty :- Underflow!!");
        }
        else {
            System.out.println("Stack peek:-"+arr[top]);
        }
    }
}
