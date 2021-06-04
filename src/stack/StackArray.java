package stack;

import java.util.Scanner;

public class StackArray {
    Scanner scanner = new Scanner(System.in);
    int arr[];
    int top;
    StackArray(){
        arr = new int[10];
        top = -1;
    }
    void push(){
        if(top == arr.length-1){
            System.out.println("Stack Overflow");
        } else {
            int data = scanner.nextInt();

            top++;
            arr[top] = data;
            System.out.println("element "+data+" inserted successfully at "+top);
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Element deleted: "+arr[top]);
            top--;
        }
    }
    void traverse(){

    }
}
