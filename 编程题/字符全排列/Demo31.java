package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则
 * 打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Demo31 {
	//递归
	public static ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if (str == null || str.length() == 0) {
			return result;
		}
		char[] chars = str.toCharArray();
		TreeSet<String> temp = new TreeSet<>();
		permutation(chars, 0, temp);
		result.addAll(temp);
		return result;
	}

	public static void permutation(char[] chars, int begin,TreeSet<String> result) {
		if (chars == null || chars.length == 0 || begin < 0
				|| begin > chars.length - 1) {
			return;
		}
		if (begin == chars.length - 1) {
			System.out.println(String.valueOf(chars));
			result.add(String.valueOf(chars));
		} else {
			for (int i = begin; i <= chars.length - 1; i++) {
				swap(chars, begin, i);
				permutation(chars, begin + 1, result);
				swap(chars, begin, i);
			}
		}
	}

	public static void swap(char[] x, int a, int b) {
		char t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

	//迭代
	public static ArrayList<String> Permutation1(String str){
		ArrayList<String> res = new ArrayList<>();
		if(str == null && str.length() == 0){
			return null;
		}
		char[] seq = str.toCharArray();
		Arrays.sort(seq);
		res.add(String.valueOf(seq));
		int len = seq.length;
		while(true){
			int p = len - 1,q;
			//从后向前找一个seq[p - 1] < seq[p]
			while(p >= 1 && seq[p - 1] >= seq[p])
				p--;
			if(p == 0) break;
			q = p;
			p--;
			while(q < len && seq[q] > seq[p])
				q++;
			//交换这两个位置上的值
			swap(seq, q, p);
			//将p之后的序列倒序排列
			reverse(seq, p + 1);
			res.add(String.valueOf(seq));
		}
		
		
		return res;
	}
	
	public static void reverse(char[] seq, int start){
		int len;
		if(seq == null || (len = seq.length) <= start)
			return;
		for (int i = 0; i < ((len - start) >> 1); i++) {
		int p = start + i, q = len - 1 - i;
		if (p != q)
			swap(seq, p, q);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		ArrayList list = Permutation1(str);
		System.out.println(list.toString());

	}
}
