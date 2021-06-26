package main;

import stack.StackArray;
import stack.StackLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackLinkedList obj1 = new StackLinkedList();
        StackArray obj2 = new StackArray();
        System.out.println("Stack using :-");
        System.out.println("Press 1 for LinkedList");
        System.out.println("Press 2 for Array \n");
        System.out.print("Your choice: ");
        int c = scanner.nextInt();
        if(c == 1) {
            while(true){
                System.out.println("-------------------------------------------------------------");
                System.out.println("Press 1 for push");
                System.out.println("Press 2 for pop");
                System.out.println("Press 3 for traversal");
                System.out.println("Press 4 to exit");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Enter your choice");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        obj1.push();
                        break;
                    case 2:
                        obj1.pop();
                        break;
                    case 3:
                        obj1.traverse();
                        break;
                    case 4: System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Choice !!!");
                }
            }
        }
        else if(c == 2 ) {

        }
    }
}
