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

    }
}
