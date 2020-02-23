package simple;

/**
 * @apiNote 翻转一个链表
 * 输入: 1->2->3->null
 * 输出: 3->2->1->null
 * @author zeekling
 * @version 1.0
 * @since 2019-12-14
 */
public class ReverseLinkedList {

	public ListNode revert(ListNode head){
		ListNode next = null, pre = null;
		while (head != null){
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
	}
}
