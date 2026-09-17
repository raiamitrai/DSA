package LinkedListPracticeQurstion.Doubly_Linked_List.Movie_Management_System;

public class Node {
    String movieTitle;
    String director;
    String yearOfRelease;
    int reting;

    Node next;
    Node prev;

    public Node(String movieTitle, String director, String yearOfRelease, int reting) {
        this.movieTitle = movieTitle;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.reting = reting;
        this.next =  null;
        this.prev = null;
    }
}
