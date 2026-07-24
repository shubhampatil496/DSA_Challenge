import java.util.*;

class Node{
    int data;
    Node next;
}

public class AdvancedLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        while(true){
            System.out.print("Enter the data : ");
            int value = sc.nextInt();

            if(value == -1){
                break;
            }

            Node newNode = new Node();
            newNode.data = value;
            newNode.next = null;

            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}