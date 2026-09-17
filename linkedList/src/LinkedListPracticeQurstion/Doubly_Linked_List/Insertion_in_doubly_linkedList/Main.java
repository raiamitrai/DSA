package LinkedListPracticeQurstion.Doubly_Linked_List.Insertion_in_doubly_linkedList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {

            System.out.println("\n========== Doubly Linked List ==========");
            System.out.println("1. Insert Node At Beginning");
            System.out.println("2. Insert Node At End");
            System.out.println("3. Insert Node At Specific Position");
            System.out.println("4. Display Forward");
            System.out.println("5. Display Backward");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter data: ");
                    int data1 = sc.nextInt();

                    list.insertNodeAtBeginning(data1);

                    break;


                case 2:

                    System.out.print("Enter data: ");
                    int data2 = sc.nextInt();

                    list.insertNodeAtEnd(data2);

                    break;


                case 3:

                    System.out.print("Enter data: ");
                    int data3 = sc.nextInt();

                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    list.insertNodeAtSpecificLocation(data3, pos);

                    break;


                case 4:

                    System.out.println("\nForward Linked List:");
                    list.displayForward();

                    break;


                case 5:

                    System.out.println("\nBackward Linked List:");
                    list.displayBackward();

                    break;


                case 6:

                    System.out.println("Program Ended.");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}