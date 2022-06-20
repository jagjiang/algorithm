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
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

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
    //1->2->3->4->5
    //一、next = 2->3->4->5   node.next=null pre=1 node=2->3->4->5
    //二、next = 3->4->5  node.next=1 pre=2->1  node=3->4->5
    //三、next = 4->5 node.next=2->1 pre=3->2->1 node=4->5
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
