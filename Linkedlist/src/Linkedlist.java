public class Linkedlist {

    private Node head;



    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if(current == null) {
            head = newNode;
        }
        else {
            head = newNode;
            newNode.next = current;
        }


    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }

    public void remove(int data){
        Node current = head;
        while(current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                break;
            }
        }

    }

    public void removeFirst(){
        Node current = head;
        if(current != null) {
            head = current.next;
        }
        else
            head = null;

    }

    public void removeLast(){
        Node current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }


    public void printValues(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


}
