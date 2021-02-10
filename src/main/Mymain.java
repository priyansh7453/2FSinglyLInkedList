package main;

import implementation.MyLinkedList;

public class Mymain{
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(500);
        linkedList.traverse();
        linkedList.addFirst(700);
        linkedList.addFirst(200);
        linkedList.traverse();
        System.out.println("size = "+ linkedList.size());
        linkedList.addAfterGivenNode(500,34);
        linkedList.traverse();
        System.out.println(linkedList.last());
    }
}