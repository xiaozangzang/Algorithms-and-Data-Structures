package list.arrList;

import list.listDao.IList;

//数组实现线性表，顺序存储结构
public class SqList implements IList {
	private int[] listElem;
	private int curlen;
	//默认数组长度为100
	public SqList(){
		curlen = 0;
		listElem = new int[100];
	}
	public SqList (int maxSize){
		curlen = 0;
		listElem = new int[maxSize];
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		curlen = 0;
	}

	@Override
	public void display()throws Exception{
		// TODO Auto-generated method stub
		if(curlen == 0)
			throw new Exception("当前顺序表为空");
		for(int i = 0;i < curlen ;i++)
			System.out.println(listElem[i] + "   ");
	}

	@Override
	public int get(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i < 0 || i > curlen)
			throw new Exception("访问位置不合法");
		return listElem[i];
	}

	@Override
	public int indexOf(int x) {
		// TODO Auto-generated method stub
		for(int i = 0 ;i++ < curlen - 1;)
			if(listElem[i] == x)
				return i;
		return -1;
	}

	@Override
	public void insert(int i, int x) throws Exception{
		// TODO Auto-generated method stub
		if(curlen == listElem.length)
			throw new Exception("顺序表已满");
		if(i < 0 || i > curlen)
			throw new Exception("插入位置不合法");
		for(int j = curlen;j-- > i;)
			listElem[j] = listElem[j-1];
		listElem[i] = x;
		curlen++;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(curlen == 0)
			return true;
		return false;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return curlen;
	}

	@Override
	public void remove(int i) throws Exception{
		// TODO Auto-generated method stub
		if(curlen == 0)
			throw new Exception("当前顺序表为空");
		if(i < 0 || i > curlen - 1)
			throw new Exception("删除位置不合法");
		for(;i < curlen - 1;i++)
			listElem[i] = listElem[i+1];
		curlen--;
	}
	//插入元素
	@Override
	public void insert(int x) throws Exception {
		// TODO Auto-generated method stub
		if(curlen == listElem.length)
			throw new Exception("顺序表已满");
		else {
			listElem[curlen] = x;
			curlen++;
			System.out.println("添加成功！");
		}


	}

}
