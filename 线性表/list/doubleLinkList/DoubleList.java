package list.doubleLinkList;

import list.listDao.IList;

/**
 * 双链表结点类
 */

public class DoubleList implements IList {

	private DoubleNode head;

	public DoubleList(DoubleNode head) {
		head = new DoubleNode();
		head.setPrior(null);
		head.setNext(null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head.setData(-1);
		head.setNext(null);
		head.setPrior(null);
	}

	@Override
	public void display() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public int get(int i) throws Exception {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public int indexOf(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(int x) throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head.getNext();
		DoubleNode node = new DoubleNode(x);
		if (current == null) {
			head.setNext(node);
			node.setPrior(head);
		} else {
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
			node.setPrior(current);
		}
	}

	@Override
	public void insert(int i, int x) throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head.getNext();
		int j = 0;
		while (current != null && j < i) {
			current = current.getNext();
			++j;
		}
		if (j != i && current != null)
			throw new Exception("");
		DoubleNode node = new DoubleNode(x);
		current.getPrior().setNext(node);
		node.setPrior(current.getPrior());
		node.setNext(current);
		current.setPrior(node);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head.getNext() == null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(int i) throws Exception {
		// TODO Auto-generated method stub
		DoubleNode current = head.getNext();
		int j = 0;
		while(current != null && j < i - 1){
			current = current.getNext();
			++j;
		}
		if(current == null)
			throw new Exception("ɾ��λ�ò�����");
		current.getNext().getNext().setPrior(current);
		current.setNext(current.getNext().getNext());
		

	}

}
