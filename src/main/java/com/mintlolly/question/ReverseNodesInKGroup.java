package com.mintlolly.question;

/**
 * Created on 2022/5/26
 *
 * @author jiangbo
 * Description:
 * https://www.bilibili.com/video/BV1RT4y1a7aK?p=35
 * https://leetcode.cn/problems/reverse-nodes-in-k-group/
 */
public class ReverseNodesInKGroup {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode2 = listNode;
        while (listNode!=null){
            System.out.print(listNode.val+",");
            listNode = listNode.next;
        }
        System.out.println();
        ListNode listNode1 = reverseKGroup(listNode2, 2);
        while (listNode1!=null){
            System.out.print(listNode1.val+",");
            listNode1 = listNode1.next;
        }
    }
    public static ListNode reverseKGroup(ListNode head,int k) {
        ListNode start = head;
        ListNode end = getKGroupEnd(head,k);
        if(end == null){
            return head;
        }
        head = end;
        reverse(start,end);
        ListNode lastEnd = start;
        while (lastEnd.next != null){
            start = lastEnd.next;
            end = getKGroupEnd(start,k);
            if(end == null){
                return head;
            }
            reverse(start,end);
            lastEnd.next = end;
            lastEnd = start;
        }

        return head;
    }

    public static ListNode getKGroupEnd(ListNode start,int k){
        while (--k!=0 && start!=null){
            start = start.next;
        }
        return start;
    }

    public static void reverse(ListNode start,ListNode end){
        end = end.next;
        ListNode pre =null;
        ListNode next;
        ListNode cur = start;
        while (cur != end){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }
}


