package LinkedListPracticeQurstion.Singly_Linked_List.Student_Record_Management;

public class StudentRecordManagement {

    Node head;

    public void addStudentAtBeginning(int rollNumber, String name, int age, char grade){
        Node newNode = new Node(rollNumber,name, age,grade);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next =head;
        head =newNode;
    }

     public void addStudentAtEnd(int rollNumber, String name, int age, char grade){
        Node newNode = new Node(rollNumber,name, age,grade);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp =head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newNode;
        newNode.next = null;
    }

     public void addStudentAtSpecificLocation(int rollNumber, String name, int age, char grade, int pos){
        Node newNode = new Node(rollNumber,name, age,grade);

        if(pos ==1){
            addStudentAtBeginning(rollNumber, name, age, grade);
            return;
        }
        if(pos < 1){
            System.out.println("Invalid Position");
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos - 1 ; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

     public void deleteStudentUsingRollnumber(int rollNumber){
        if(head == null){
            System.out.println("There is no any student records");
            return;
        }
        if(head.rollNumber == rollNumber){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.rollNumber == rollNumber){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("record not found");
        }
    }


     public void searchStudentUsingRollnumber(int rollNumber){

         if(head == null){
            System.out.println("There is no any student records");
            return;
        }

         Node temp = head;
         while(temp != null){
             if(temp.rollNumber ==  rollNumber){
                 System.out.println("Student roll number : " + temp.rollNumber);
                 System.out.println("Student Name : "+ temp.name);
                 System.out.println("Student age : "+ temp.age);
                 System.out.println("Student Grade : "+ temp.grade);
                 return;
             }
             temp = temp.next;
         }
             if(temp == null){
                 System.out.println("Record not found");
             }

    }

    public void displayAllStudentRecords(){
        if(head == null){
            System.out.println("There is no any student records");
            return;
        }

        Node temp = head;

        while(temp != null){

            System.out.println("Student roll number : " + temp.rollNumber);
            System.out.println("Student Name : " + temp.name);
            System.out.println("Student age : " + temp.age);
            System.out.println("Student Grade : " + temp.grade);

            System.out.println("===========================================");

            temp = temp.next;
        }
         System.out.println("null");
    }

}
