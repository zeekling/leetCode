package com.leetcode.list;

class ListNode {
	int val;
	ListNode next;
	public ListNode(int x) {
		val = x;
	}
}
/**
 *
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode{

	public ListNode middleNode(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int size = 0;
        while(head != null){
            arr[size++] = head;
            head = head.next;
        }
        return arr[size / 2];
    }
}
