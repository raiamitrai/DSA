package LinkedListPracticeQurstion.Doubly_Linked_List.Insertion_in_doubly_linkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void insertNodeAtBeginning(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertNodeAtEnd(int data){
        Node newNode = new Node(data);

         if(head == null){
            head = newNode;
            tail=newNode;
            return;
        }
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
    }

    public void insertNodeAtSpecificLocation(int data, int pos){

        if(pos < 1){
            System.out.println("Invalid Position");
            return;
        }

        // Position 1
        if(pos == 1){
            insertNodeAtBeginning(data);
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

        Node newNode = new Node(data);

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

    public void displayForward() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }



}
