package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 输入字符串，只包含大小写字母，要求删除给定字符串中出现次数最少的字符，
 * 输出删除的字符串，有多个出现次数一样的字符，一并删除。
 *
 */
public class Main41 {
	
	public static String fun(String str){
		StringBuffer buffer = new StringBuffer();
		char[] charArr = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0;i < charArr.length;i++){
			if(map.containsKey(charArr[i])){
				map.put(charArr[i], map.get(charArr[i]) + 1);
			}else{
				map.put(charArr[i], 1);
			}
		}
		int min = Collections.min(map.values());
		for(int i = 0;i < charArr.length;i++){
			if(map.get(charArr[i]) != min){
				buffer.append(charArr[i]);
			}
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(fun(str));
	}

}
