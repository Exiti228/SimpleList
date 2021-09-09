package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(2);
        System.out.println(list);
    }
}
