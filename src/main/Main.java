package main;

import stack.StackArray;
import stack.StackLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //objects of the classes
        StackLinkedList obj1 = new StackLinkedList();
        StackArray obj2 = new StackArray();

        //object of scanner class
        Scanner sc = new Scanner(System.in);

        //operating on Stack
        System.out.println("Stack using :-");
        System.out.println("Press 1 for LinkedList");
        System.out.println("Press 2 for Array \n");
        System.out.print("Your choice: ");
        int c = sc.nextInt();
        if(c == 1) {
            while(true){
                System.out.println("-------------------------------------------------------------");
                System.out.println("Press 1 for push");
                System.out.println("Press 2 for pop");
                System.out.println("Press 3 for traversal");
                System.out.println("Press 4 to peek");
                System.out.println("Press 5 to exit");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Enter your choice ");
                Scanner scanner = new Scanner(System.in);
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
                    case 4:
                        obj1.peek();
                    case 5: System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Choice !!!");
                }
            }
        }
        else if(c == 2 ) {
            while(true){
                System.out.println("-------------------------------------------------------------");
                System.out.println("Press 1 for push");
                System.out.println("Press 2 for pop");
                System.out.println("Press 3 for traversal");
                System.out.println("Press 4 to peek");
                System.out.println("Press 5 to exit");
                System.out.println("-------------------------------------------------------------");
                System.out.println("Enter your c");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        obj2.push();
                        break;
                    case 2:
                        obj2.pop();
                        break;
                    case 3:
                        obj2.traverse();
                        break;
                    case 4:
                        obj2.peek();
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong Choice !!!");
                }
            }
        }
        else {
            System.out.println("Wrong Choice !!!");
        }
    }
}
