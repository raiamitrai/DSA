package LinkedListPracticeQurstion.Singly_Linked_List.insertion_in_singly_LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Initial nodes input
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter data for node " + i + ": ");
            int data = sc.nextInt();

            st.insertAtEnd(data);
        }

        System.out.println("\nCurrent Linked List:");
        st.display();

        // Insertion choice
        System.out.println("\n1. Insert at Beginning");
        System.out.println("2. Insert at End");
        System.out.println("3. Insert at Position");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter data: ");
        int data = sc.nextInt();

        switch (choice) {

            case 1:
                st.insertAtBegin(data);
                break;

            case 2:
                st.insertAtEnd(data);
                break;

            case 3:
                System.out.print("Enter position: ");
                int position = sc.nextInt();

                st.specificPosition(data, position);
                break;

            default:
                System.out.println("Invalid choice");
        }

        System.out.println("\nAfter Insertion:");
        st.display();


    }

}
