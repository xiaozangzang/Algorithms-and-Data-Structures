package linkList;

import listDao.IList;

import java.util.Scanner;

public class LinkList implements IList {
	private Node head;

	public LinkList() {
		head = new Node();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkList(int n, boolean order) {
		this();
//		 if(order)
//		 insert(n);
//		 else
//		 create2(n);
	}

	@Override
	public void clear() {
		Node current = head;
		Node next;
		while(current.getNext() != null){
			next = current.getNext();
			current.setData(0);
			current.setNext(null);
			current = next;
		}
		head.setData(-1);
		head.setNext(null);
	}

	@Override
	public void display() throws Exception {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		if (current == null)
			System.out.println("当前链表为空");
		while (current != null) {
			System.out.print(current.getData()+"-->");
			current = current.getNext();
		}
		System.out.println("End");
	}

	@Override
	public int get(int i) throws Exception {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		int index = 0;
		if(current == null)
			return -1;
		if(i < 0 || i > length())
			System.out.println("访问的链表位置有误");
		while(current != null){
			if(++index == i)
				return current.getData();
			current = current.getNext();
		}
		return -1;
	}

	@Override
	public int indexOf(int x) {
		Node current = head.getNext();
		int index = 0;
		while (current!= null) {
			index++;
			if (current.getData() == x)
				break;
			current = current.getNext();
		}
		if(current == null)
			return -1;
		return index;
	}



	@Override
	public void insert(int x) throws Exception {
		// TODO Auto-generated method stub
		Node current = head;
		Node newNode = new Node(x);
		if(current.getNext() == null){
			head.setNext(newNode);
			current = current.getNext();
			System.out.println("添加第一个元素成功！");
		}else{
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
			System.out.println("添加成功！");
		}
		
	}
	//插入指定位置
	@Override
	public void insert(int num, int x) throws Exception {
		// TODO Auto-generated method stub
		Node current = head;
		Node newNode = new Node(x);
		int i = 0;
		while(current.getNext() != null){
			if(i > length())
				break;
			if(num == ++i){
				newNode.setNext(current.getNext());
				current.setNext(newNode);
				System.out.println("添加成功！");
				break;
			}
			current = current.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head.getNext() == null;
	}

	@Override
	public int length() {
		Node current = head;
		int i = 0;
		while (current.getNext() != null){
			i++;
			current = current.getNext();
		}
		return i;
	}

	@Override
	public void remove(int i) throws Exception {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		int index = 0;
		while(current != null){
			index++;
			if(index == i - 1){
				current.setNext(current.getNext().getNext());
			}
			current = current.getNext();
		}
	}
	/**
	 * 链表逆序打印输出
	 */
	public void reserver(Node head){
		Node p1,p2;
		p1 = head;
		while(head.getNext() != null){
			p2 = head.getNext();
			head.setNext(p2.getNext());
			p2.setNext(p1);
			p1 = p2;
		}
		this.head = p1;
	}
}
