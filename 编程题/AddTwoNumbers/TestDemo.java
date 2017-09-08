package itCode.AddTwoNumbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l3 = new Solution().addTwoNumbers1(l1, l2);
		while(l3 != null){
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
}
