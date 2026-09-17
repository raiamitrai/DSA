package LinkedListPracticeQurstion.Singly_Linked_List.Student_Record_Management;

public class Node {
    int rollNumber;
    String name;
    int age;
    char grade;
    Node next;

    public Node(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
