package org.example;

import java.util.Scanner;

public class Stack {

    int [] stack;
    int size;
    int pointer = 0;

    public Stack(int size){
        stack = new int [size];
    }

    public void push(int data){
        if(pointer>stack.length-1){
            System.out.println("The stack is full :");
        }else{
            stack[pointer++]=data;
        }
    }

    public void display(){
        for(int i=0; i<stack.length; i++){
            System.out.println("The content of the stack : " + stack[i]);
        }
    }

    public void pop(){
        if (pointer < 0){
            System.out.println("Under stack");
        }else{
            if (pointer == 0){
                System.out.println("The poped item : " + stack[pointer--]);
                pointer --;
            }else {
                System.out.println("The poped item : " + stack[pointer-- - 1]);
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}
