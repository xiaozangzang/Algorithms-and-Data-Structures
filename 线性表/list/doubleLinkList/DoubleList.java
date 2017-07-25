package doubleLinkList;

import listDao.IList;

/**
 * 双链表结点类
 */

public class DoubleList implements IList {

	private DoubleNode head;
	
	public DoubleList(){
		head = new DoubleNode();
	}


	@Override
	public void clear() {

	}

	@Override
	public void display() throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head;
		if(current.getNext() == null){
			System.out.println("该链表为空！");
		}else{
			System.out.println("总长度为："+length());
			while(current.getNext() != null){
				current = current.getNext();
				System.out.print(current.getData() + "-->");
			}
			System.out.println("End");
		}

	}

	@Override
	public int get(int i) throws Exception {
		
		return -1;
	}

	@Override
	public int indexOf(int x) {
		DoubleNode current = head;
		int index = 0;
		if(current.getNext() == null){
			System.out.println("链表为空！");
			return -1;
		}else{
			while(current.getNext() != null){
				current = current.getNext();
				index++;
				if(x == index){
					break;
				}
			}
		}
		return current.getData();
	}

	@Override
	public void insert(int x) throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head.getNext();
		DoubleNode node = new DoubleNode(x);
		if (current == null) {
			head.setNext(node);
			node.setPrior(head);
			System.out.println("添加成功！");
		} else {
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
			node.setPrior(current);
			System.out.println("添加成功！");
		}
	}

	@Override
	public void insert(int i, int x) throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head;
		int length = length();
		int index = 0;
		DoubleNode newNode = new DoubleNode(x);
		if(i > length){
			System.out.println("插入位置有误！");
			return;
		}
		while(current.getNext() != null){
			current = current.getNext();
			if(++index == i){
				break;
			}
		}
		newNode.setNext(current);
		newNode.setPrior(current.getPrior());
		current.getPrior().setNext(newNode);
		current.setPrior(newNode);
		System.out.println("添加成功！");
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head.getNext() == null;
	}

	@Override
	public int length() {
		DoubleNode current = head;
		int len = 0;
		if(current.getNext() == null){
			return len;
		}else{
			while(current.getNext() != null){
				current = current.getNext();
				len++;
			}
		}
		return len;
	}

	@Override
	public void remove(int i) throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head.getNext();
		int index = 0;
		if(i <= 0 || i > length()){
			System.out.println("不在链表长度范围内！");
			return;
		}
		while(current != null && ++index < i - 1){
			current = current.getNext();
		}
		if(current == null)
			throw new Exception("该链表长度为空！");
		System.out.println(current.getData());
		current.getNext().getNext().setPrior(current);
		current.setNext(current.getNext().getNext());
		System.out.println("Remove Success!");
	}

}
