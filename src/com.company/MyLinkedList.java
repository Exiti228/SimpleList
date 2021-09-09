package com.company;

import java.util.Arrays;

class MyLinkedList {
     private int size = 0;
     private Node head = null;
     public void add(int value) {

         if (head == null) {
             head = new Node(null, value);

         }
         else {
             Node temp = head;
             while (temp.getNext() != null) {
                 temp = temp.getNext();
             }
             temp.setNext(new Node(null, value));
         }
         size++;
     }
    public int getSize() {
         return size;
    }
     public int get(int index) {
        int currentIndex = 0;
        Node temp = head;
        while (head != null) {
            if (currentIndex++ == index) {
                return temp.getValue();
            }
            temp = temp.getNext();

        }

        throw new IllegalArgumentException();
     }

     public void remove(int index) {
         if (head == null) {
             throw new IllegalArgumentException();
         }
         if (index == 0) {
             head = head.getNext();
             size--;
             return;
         }
         int currentIndex = 0;
         Node temp = head;
         while (temp.getNext() != null) {
             if (currentIndex++ == index - 1) {
                 size--;
                 temp.setNext(temp.getNext().getNext());
                 return;
             }

             temp = temp.getNext();
         }
         throw new IllegalArgumentException();

     }

     public String toString() {
         int[] result = new int[size];
         Node temp = head;
         int currentIndex = 0;
         while (temp != null) {
             result[currentIndex++] = temp.getValue();
             temp = temp.getNext();
         }
         return Arrays.toString(result);
     }

     private class Node {
        private Node next;
        private int value;

         public Node(Node next, int val) {
             this.next = next;
             this.value = val;
         }

         public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setVal(int val) {
            this.value = val;
        }
    }


}
