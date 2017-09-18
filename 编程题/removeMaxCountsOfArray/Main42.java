package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 整型数组，去除出现次数超过两次的元素，返回新数组长度
 */
public class Main42 {
	public static int fun(int[] a){
		int length = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < a.length;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]) + 1);
				if(map.get(a[i]) > 2){
					list.add(a[i]);
				}
			}else{
				map.put(a[i], 1);
			}
		}
		for(int i = 0;i < a.length;i++){
			if(!list.contains(a[i])){
				length++;
			}
		}
		
		return length;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		for(int i = 0;i < length;i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(fun(arr));

	}

}
