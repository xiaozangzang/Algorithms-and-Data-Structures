package list.linkList;

import list.listDao.IList;

public class Test {
	public static void main(String[] args) throws Exception {
		IList list = new LinkList();
		list.insert(33);
		list.insert(44);
		list.insert(55);
		list.insert(1,11);
		list.display();
		list.remove(4);
		list.display();
//		System.out.println(list.indexOf(55));
	}
}
