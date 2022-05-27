package com.mintlolly.base;

/**
 * Created on 2022/5/25
 *
 * @author jiangbo
 * Description:
 */
public class ReverseList {
    public static class Node{
        public int num;
        public Node next;
        Node(int num){
            this.num = num;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
//        while (head !=null){
//            System.out.println(head.num);
//            head = head.next;
//        }
        head = reverseNode(head);
        while (head !=null){
            System.out.println(head.num);
            head = head.next;
        }
    }
    public static Node reverseNode(Node node){
        Node pre =null;
        Node next;
        while (node !=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}

