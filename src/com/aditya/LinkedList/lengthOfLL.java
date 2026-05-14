package com.aditya.LinkedList;

public class lengthOfLL {
    public static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    static void main() {
        int[] arr = {12, 5, 6,  8};
        Node head = arrayToLL.arrToLL(arr);
        System.out.println(lengthOfLL(head));
    }
}
