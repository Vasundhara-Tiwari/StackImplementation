package main;

import stack.StackArray;
import stack.StackLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackLinkedList obj1 = new StackLinkedList();
        //StackArray obj2 = new StackArray();
        while(true){
            System.out.println("-------------------------------------------------------------");
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traversal");
            System.out.println("Press 4 to peek");
            System.out.println("Press 5 to exit");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    obj1.push();
                    //obj2.push();
                    break;
                case 2:
                    obj1.pop();
                    //obj2.pop();
                    break;
                case 3:
                    obj1.traverse();
                    //obj2.traverse();
                    break;
                case 4: 
                    obj1.peek();
                    //obj2.peek();
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice !!!");
            }
        }
    }
}
