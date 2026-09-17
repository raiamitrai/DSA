package LinkedListPracticeQurstion.Doubly_Linked_List.Movie_Management_System;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieManagementSystem movieList = new MovieManagementSystem();

        while (true) {

            System.out.println("\n========== Movie Management System ==========");
            System.out.println("1. Add Movie At Beginning");
            System.out.println("2. Add Movie At End");
            System.out.println("3. Add Movie At Specific Position");
            System.out.println("4. Remove Movie Using Movie Title");
            System.out.println("5. Search Movie");
            System.out.println("6. Display Movies Forward");
            System.out.println("7. Display Movies Backward");
            System.out.println("8. Update Movie Rating");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Movie Title: ");
                    String title1 = sc.nextLine();

                    System.out.print("Enter Director: ");
                    String director1 = sc.nextLine();

                    System.out.print("Enter Year Of Release: ");
                    String year1 = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    int rating1 = sc.nextInt();

                    movieList.addMovieRecordAtBeginning(
                            title1, director1, year1, rating1
                    );

                    break;


                case 2:

                    System.out.print("Enter Movie Title: ");
                    String title2 = sc.nextLine();

                    System.out.print("Enter Director: ");
                    String director2 = sc.nextLine();

                    System.out.print("Enter Year Of Release: ");
                    String year2 = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    int rating2 = sc.nextInt();

                    movieList.addMovieRecordAtEnd(
                            title2, director2, year2, rating2
                    );

                    break;


                case 3:

                    System.out.print("Enter Movie Title: ");
                    String title3 = sc.nextLine();

                    System.out.print("Enter Director: ");
                    String director3 = sc.nextLine();

                    System.out.print("Enter Year Of Release: ");
                    String year3 = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    int rating3 = sc.nextInt();

                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();

                    movieList.addMovieRecordAtSpecificPosition(
                            title3, director3, year3, rating3, pos
                    );

                    break;


                case 4:

                    System.out.print("Enter Movie Title To Remove: ");
                    String removeTitle = sc.nextLine();

                    movieList.removeMovieRecordUsingMovieTitle(removeTitle);

                    break;


                case 5:

                    System.out.print("Enter Director: ");
                    String searchDirector = sc.nextLine();

                    System.out.print("Enter Rating: ");
                    int searchRating = sc.nextInt();

                    movieList.searchMovieRecord(
                            searchDirector, searchRating
                    );

                    break;


                case 6:

                    System.out.println("\n========== Forward ==========");
                    movieList.displayForward();

                    break;


                case 7:

                    System.out.println("\n========== Backward ==========");
                    movieList.displayBackward();

                    break;


                case 8:

                    System.out.print("Enter Movie Title: ");
                    String updateTitle = sc.nextLine();

                    System.out.print("Enter New Rating: ");
                    int newRating = sc.nextInt();

                    movieList.updateMovieRetingUsingMovieTitle(
                            updateTitle, newRating
                    );

                    break;


                case 9:

                    System.out.println("Program Ended.");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}