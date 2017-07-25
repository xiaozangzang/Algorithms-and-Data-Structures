package doubleLinkList;
/**
 * 双链表结点类
 * 数据域、前驱后继指针域
 *
 */
public class DoubleNode {
	private int data;
	private DoubleNode prior;  //前驱
	private DoubleNode next;	//后继
	public DoubleNode() {
		this(-1);
	}
	
	public DoubleNode(int data) {
		this.data = data;
		this.prior = null;
		this.next = null;
	}
	
	public DoubleNode(int data,DoubleNode priorNode,DoubleNode nextNode){
		this.data = data;
		this.prior = priorNode;
		this.next = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoubleNode getPrior() {
		return prior;
	}

	public void setPrior(DoubleNode prior) {
		this.prior = prior;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}


}
