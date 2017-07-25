package doubleLinkList;

import listDao.IList;

public class Test {
	public static void main(String[] args) throws Exception{
		IList list = new DoubleList();
		list.insert(11);
		list.insert(13);
//		list.display();
//		list.insert(1, 14);
//		list.display();
		list.insert(2,12);
		list.insert(8);
		list.display();
		list.remove(3);
		list.display();
	}
	
}
