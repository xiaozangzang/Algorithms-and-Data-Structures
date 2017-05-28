package list.listDao;
//list接口
public interface IList {
	//清空
	public void clear();
	//判空
	public boolean isEmpty();
	//返回长度
	public int length();
	//查找指定元素
	public int get(int i) throws Exception;
	//插入指定元素
	public void insert(int x)throws Exception;
	//插入指定位置元素
	public void insert(int i, int x) throws Exception;
	//移除指定位置元素
	public void remove(int i) throws Exception;
	//查找指定下标元素
	public int indexOf(int x);
	//打印链表
	public void display() throws Exception;

}
