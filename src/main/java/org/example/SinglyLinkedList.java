package org.example;

import java.util.List;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayContentOfList(){
        ListNode current = head;

        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertIntoList(ListNode node){
        node.next = head;
        head = node;
    }

    public void insertIntoListAtEnd(ListNode node){
        ListNode current = head;

        while (current.next!=null){
            current = current.next;
        }
        current.next = node;
        node.next = null;
    }

    public void insertIntoListAtSpecificPosition(ListNode node, int position){
        ListNode current = head;
        int count = 1;
        while(count < position -1){
            current = current.next;
            count++;
        }
        current = node;


    }
    public static void main(String [] args){

      SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
      singlyLinkedList.head = new ListNode(10);

      // Create nodes
        ListNode node1 = new ListNode(20);
        ListNode node2 = new ListNode(30);
        ListNode node3 = new ListNode(40);
        ListNode node4 = new ListNode(50);

        singlyLinkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //singlyLinkedList.displayContentOfList();

        singlyLinkedList.insertIntoList(new ListNode(100));
        singlyLinkedList.insertIntoListAtEnd(new ListNode(900));
        singlyLinkedList.displayContentOfList();
        singlyLinkedList.insertIntoListAtSpecificPosition(new ListNode(600), 3);
    }

}
