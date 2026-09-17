package LinkedListPracticeQurstion.Singly_Linked_List.Student_Record_Management;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentRecordManagement list = new StudentRecordManagement();

        while (true) {

            System.out.println("\n========== Student Record Management ==========");
            System.out.println("1. Add Student At Beginning");
            System.out.println("2. Add Student At End");
            System.out.println("3. Add Student At Specific Position");
            System.out.println("4. Delete Student By Roll Number");
            System.out.println("5. Search Student By Roll Number");
            System.out.println("6. Display All Student Records");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    int rollNumber1 = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name1 = sc.next();

                    System.out.print("Enter Age: ");
                    int age1 = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    char grade1 = sc.next().charAt(0);

                    list.addStudentAtBeginning(
                            rollNumber1, name1, age1, grade1
                    );

                    break;


                case 2:

                    System.out.print("Enter Roll Number: ");
                    int rollNumber2 = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name2 = sc.next();

                    System.out.print("Enter Age: ");
                    int age2 = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    char grade2 = sc.next().charAt(0);

                    list.addStudentAtEnd(
                            rollNumber2, name2, age2, grade2
                    );

                    break;


                case 3:

                    System.out.print("Enter Roll Number: ");
                    int rollNumber3 = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name3 = sc.next();

                    System.out.print("Enter Age: ");
                    int age3 = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    char grade3 = sc.next().charAt(0);

                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();

                    list.addStudentAtSpecificLocation(
                            rollNumber3,
                            name3,
                            age3,
                            grade3,
                            position
                    );

                    break;


                case 4:

                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRollNumber = sc.nextInt();

                    list.deleteStudentUsingRollnumber(deleteRollNumber);

                    break;


                case 5:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRollNumber = sc.nextInt();

                    list.searchStudentUsingRollnumber(searchRollNumber);

                    break;


                case 6:

                    list.displayAllStudentRecords();

                    break;


                case 7:

                    System.out.println("Program Ended.");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}