// Structure of th node : 
class Node{
    int data;
    Node next;
}

public class LinkedList{
    public static void main(String[] args){
        // Node Creation : 

        // 1st Node : 
        Node first = new Node();
        first.data = 10;

        // 2nd Node : 
        Node second = new Node();
        second.data = 20;

        // 3rd Node : 
        Node third = new Node();
        third.data = 30;

        // Address Assigning : 
        first.next = second;
        second.next = third;

        // Display the Linked List : 
        Node car = first;
        while(car != null){
            System.out.print(car.data + " -> ");
            car = car.next;
        }
        System.out.print("NULL");

    }
}