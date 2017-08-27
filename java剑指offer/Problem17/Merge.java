package Problem17;

public class Merge {
	/*
	 * 输入两个递增的链表，合并这两个链表并使新链表仍然是递增的
	 * 非递归实现
	 */
	public ListNode merge1(ListNode root1,ListNode root2)
	{
		if(root1==null)
			return root2;
		else 
			if(root2==null)
				return root1;
		ListNode mergeHead=null;
		if(root1.data<=root2.data)
		{
			mergeHead=root1;	
			mergeHead.nextNode=merge(root1.nextNode,root2);			
		}
		else {
			mergeHead=root2;	
			mergeHead.nextNode=merge(root1,root2.nextNode);			
		}
		return mergeHead;
	}
	/**
	*递归实现
	*/
	public ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1 == null)return list2;
        if(list2 == null)return list1;
        ListNode head = null;
        head = list1.val > list2.val?list2:list1;
        head.next = list1.val > list2.val?Merge(list1,list2.next):Merge(list1.next,list2);
        return head;
    }
}
class ListNode
{
	int data;
	ListNode nextNode;
}
