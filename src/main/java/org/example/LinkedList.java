package org.example;

public class LinkedList {

    Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void display(){
        Node current = head;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(50);
        list.insert(5);
        list.insert(57);
        list.display();
    }

}
