package LinkedListPracticeQurstion.Singly_Linked_List.insertion_in_singly_LinkedList;

public class Student {

    Node head;

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = newNode;
            newNode.next = null;
        }
        }

    }

    public void specificPosition(int data , int pos){

        if(pos == 1){
            insertAtBegin(data);
        }
        Node temp = head;
        for(int i = 1 ; i < pos ; i++ ){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next=temp.next;
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
    }

}
