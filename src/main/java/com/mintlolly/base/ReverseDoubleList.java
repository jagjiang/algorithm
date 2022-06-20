package com.mintlolly.base;

/**
 * Created on 2022/6/8
 *
 * @author jiangbo
 * Description:
 */
public class ReverseDoubleList {
    static class DoubleNode{
        int num;
        DoubleNode last;
        DoubleNode next;
        DoubleNode(int num){
            this.num = num;
        }
    }

    public static void main(String[] args) {

    }

    public static DoubleNode reverse(DoubleNode head){
        DoubleNode pre =null;
        DoubleNode next = null;
        while (head !=null){
            next =head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}