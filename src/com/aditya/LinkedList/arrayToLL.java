package com.aditya.LinkedList;

public class arrayToLL {

    public static Node arrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void main() {
        int[] arr = {12, 5, 6,  8};
        Node head = arrToLL(arr);
        System.out.println(head.data);
    }
}
