package list.arrList;

import list.listDao.IList;

public class TestDemo {
	public static void main(String[] args) throws Exception{
		IList list = new SqList(20);
		list.insert(33);
		list.insert(44);
		list.insert(55);
		list.display();

		System.out.println(list.get(2));
	}
}
