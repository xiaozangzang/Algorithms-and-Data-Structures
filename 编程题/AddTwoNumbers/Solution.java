package itCode.AddTwoNumbers;
/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
 */
public class Solution {
	/**
	 * 递归实现
	 * @param l1
	 * @param l2
	 * @return
	 */
	public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		if(l1 == null)
			return null;
		if(l2 == null)
			return null;
		ListNode head = null;
		int temp = 0;
		int p = (l1.val + l2.val)%10;
		head = new ListNode(p + temp);
		temp = (l1.val + l2.val)/10;
		head.next = addTwoNumbers1(l1.next, l2.next);
		
		return head;
	}
	/**
	 * 非递归实现
	 * @param l1
	 * @param l2
	 * @return
	 */
	 public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		 	int temp = 0;
		 	ListNode head = null;
		 	System.out.println(l1.val+ l2.val);
	        while(l1 != null && l2 != null){
	        	int val = (l1.val + l2.val) % 10;
	        	temp = (l1.val + l2.val)/10;
	        	l1 = l1.next;
	        	l2 = l2.next;
	        }
	        while(head != null){
	        	System.out.println(head.val);
	        	head = head.next;
	        }
	        
	        return head;
	 }
}



