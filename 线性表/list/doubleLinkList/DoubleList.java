package doubleLinkList;

import listDao.IList;

/**
 * ˫��������
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
			System.out.println("������Ϊ�գ�");
		}else{
			System.out.println("�ܳ���Ϊ��"+length());
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
			System.out.println("����Ϊ�գ�");
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
			System.out.println("��ӳɹ���");
		} else {
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
			node.setPrior(current);
			System.out.println("��ӳɹ���");
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
			System.out.println("����λ������");
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
		System.out.println("��ӳɹ���");
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
			System.out.println("���������ȷ�Χ�ڣ�");
			return;
		}
		while(current != null && ++index < i - 1){
			current = current.getNext();
		}
		if(current == null)
			throw new Exception("��������Ϊ�գ�");
		System.out.println(current.getData());
		current.getNext().getNext().setPrior(current);
		current.setNext(current.getNext().getNext());
		System.out.println("Remove Success!");
	}

}
