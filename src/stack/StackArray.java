package stack;

public class StackArray {
    int arr[];
    int top;
    StackArray(){
        arr = new int[10];
        top = -1;
    }
    void push(){
        if(top == arr.length-1){
            System.out.println("Stack Overflow");
        }
    }
}
