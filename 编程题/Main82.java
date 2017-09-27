package demo;

import java.util.ArrayList;
import java.util.Random;

public class Main82 {
	private static int fun(ArrayList<Integer> list){
		//
		int temp = list.get(0);
		for(int i = 1;i < list.size();i++){
			temp ^= list.get(i);
		}
		for(int i = 0;i < list.size() - 1;i++){
			temp ^= list.get(i);
		}
		return temp;
	}
	public static void main(String[] args) {
		// 将1000个数字放入list，随机生成一个1000以内的数字放入
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 1001; i++) {
			list.add(i);
		}
		int n = new Random().nextInt(1000);
		list.add(n);
		System.out.println(fun(list));
	}

}
