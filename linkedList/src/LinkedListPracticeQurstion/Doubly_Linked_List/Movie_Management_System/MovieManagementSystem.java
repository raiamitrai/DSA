package LinkedListPracticeQurstion.Doubly_Linked_List.Movie_Management_System;

public class MovieManagementSystem {

    Node head;
    Node tail;

    public void addMovieRecordAtBeginning(String movieTitle, String director, String yearOfRelease, int reting){
        Node newNode = new Node(movieTitle, director, yearOfRelease, reting);

        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }


     public void addMovieRecordAtEnd(String movieTitle, String director, String yearOfRelease, int reting){
        Node newNode = new Node(movieTitle, director, yearOfRelease, reting);

         if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
          tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
    }


     public void addMovieRecordAtSpecificPosition(String movieTitle, String director, String yearOfRelease, int reting, int pos){
        Node newNode = new Node(movieTitle, director, yearOfRelease, reting);

        if(pos < 1){
            System.out.println("Invalid Position");
            return;
        }

        // Position 1
        if(pos == 1){
            addMovieRecordAtBeginning(movieTitle, director, yearOfRelease, reting);
            return;
        }

        // Empty list
        if(head == null){
            System.out.println("Invalid Position");
            return;
        }
        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            if(temp.next == null){
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if(temp.next != null){
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        if(newNode.next == null){
            tail = newNode;
        }

    }

    public void removeMovieRecordUsingMovieTitle(String movieTitle){
        if(head == null){
            System.out.println("Movie not found because record list is empty");
            return;
        }
        if(head.movieTitle.equalsIgnoreCase( movieTitle)){
            head = head.next;

             if(head == null){
                 tail = null;
            } else {
                head.prev = null;
            }
            return;
        }
        if(tail.movieTitle.equalsIgnoreCase( movieTitle)){
            tail = tail.prev;
            tail.next= null;
            return;
        }

        Node temp = head;
        while(temp != tail){
            if(temp.movieTitle.equalsIgnoreCase( movieTitle)){
                temp.prev.next=temp.next;
                temp.next.prev= temp.prev;
                return;
            }
            temp= temp.next;
        }
    }


    public void searchMovieRecord(String director, int reting){
         if(head == null){
            System.out.println("Movie not found because record list is empty");
            return;
        }
          if(head.director.equalsIgnoreCase( director) || head.reting == reting){
              System.out.println("Movie Title : "+ head.movieTitle);
              System.out.println("Director : "+ head.director);
              System.out.println("Year Of Release : " + head.yearOfRelease);
            return;
        }

          if(tail.director.equalsIgnoreCase( director) || tail.reting == reting){
              System.out.println("Movie Title : "+ tail.movieTitle);
              System.out.println("Director : "+ tail.director);
              System.out.println("Year Of Release : " + tail.yearOfRelease);
            return;
        }
          Node temp = head;
        while(temp != tail){
            if(temp.director.equalsIgnoreCase( director) || temp.reting == reting){
                 System.out.println("Movie Title : "+ temp.movieTitle);
                 System.out.println("Director : "+ temp.director);
                 System.out.println("Year Of Release : " + temp.yearOfRelease);
                 return;
            }
            temp= temp.next;
        }
        System.out.println("Movie record not found");

    }


    public void displayForward() {
        if(head == null){
            System.out.println("Movie record list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println("Movie Title : " + temp.movieTitle);
            System.out.println("Director : " + temp.director);
            System.out.println("Year Of Release : " + temp.yearOfRelease);
            System.out.println("Rating : " + temp.reting);
            System.out.println("====================================");
            temp = temp.next;
        }
    }

    public void displayBackward() {
        if(tail == null){
            System.out.println("Movie record list is empty");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.println("Movie Title : " + temp.movieTitle);
            System.out.println("Director : " + temp.director);
            System.out.println("Year Of Release : " + temp.yearOfRelease);
            System.out.println("Rating : " + temp.reting);
            System.out.println("====================================");
            temp = temp.prev;
        }
    }


     public void updateMovieRetingUsingMovieTitle(String movieTitle, int movieReting){
         if(head == null){
            System.out.println("Movie not found because record list is empty");
            return;
        }
         if(head.movieTitle.equalsIgnoreCase( movieTitle)){
            head.reting = movieReting;
            return;
        }
         if(tail.movieTitle.equalsIgnoreCase( movieTitle)){
            tail.reting = movieReting;
            return;
        }
         Node temp = head;
        while(temp != tail){
            if(temp.movieTitle.equalsIgnoreCase( movieTitle)){
                temp.reting = movieReting;
                return;
            }
            temp= temp.next;
        }
        System.out.println("Movie record not found");
    }

}
