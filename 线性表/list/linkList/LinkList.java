package list.linkList;

import list.listDao.IList;

import java.util.Scanner;

public class LinkList implements IList {
	private Node head;

	public LinkList() {
		head = new Node();
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
		// TODO Auto-generated method stub
		head.setData(-1);
		head.setNext(null);
	}

	@Override
	public void display() throws Exception {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		if (current == null || head == null)
			System.out.println("当前链表为空");
		while (current != null) {
			System.out.print(current.getData()+"  ");
			current = current.getNext();
		}
	}

	@Override
	public int get(int i) throws Exception {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		int index = 0;
		if(head == null)
			return -1;
		if(i < 0 || i > length())
			System.out.println("访问的链表位置有误");
		while(current != null){
			if(++index == i)
				return current.getData();
		}
		return -1;
	}

	@Override
	public int indexOf(int x) {
		// TODO Auto-generated method stub
		Node current = head.getNext();
		int index = 0;
		while (current.getNext() != null) {
			index++;
			if (current.getData() == x)
				break;
		}
		return index;
	}



	@Override
	public void insert(int x) throws Exception {
		// TODO Auto-generated method stub
		Node current = null;
		Node newNode = new Node(x);
		if(head == null) {
			head.setNext(newNode);
			current = newNode;
		}else{
			current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
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
			current = current.getNext();
			i++;
			if(i > length())
				return ;

			if(num == i -1){
				newNode.setNext(current);
				current.setNext(newNode);
				System.out.println("添加成功！");
				return;
			}
		}
		System.out.println("添加失败");
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head.getNext() == null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		int i = 0;
		while (head.getNext() != null)
			i++;
		return i;
	}
	public void remove() throws NumberFormatException, Exception{
		System.out.println("1.按序号删除  2.按数据元素删除");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.valueOf(scanner.nextLine());
		if(num == 1){
			System.out.println("请输入数据：");
			remove(Integer.valueOf(scanner.nextLine()));
		}else if(num == 2){
			remove(scanner.nextLine());
		}else{
			
		}
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
	public void remove(Object obj){
		Node current = head.getNext();
		while(current != null){
			if(obj.equals(current.getData())){
				current.setNext(current.getNext().getNext());
			}
			current = current.getNext();
		}
	}
}
