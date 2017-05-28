package list.linkList;

/**
 * 单链结点类
 * 指针域、数据域
 * 
 */
public class Node {
	private int data;
	private Node next;
	//构造器
	public Node() {
		this(-1, null);
	}

	public Node(int data) {
		this(data, null);
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


}
