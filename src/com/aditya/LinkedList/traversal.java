package com.aditya.LinkedList;

public class traversal {
    public static void main(String[] args) {
        int[] arr = {12, 5, 6,  8};
        Node head = arrayToLL.arrToLL(arr);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
