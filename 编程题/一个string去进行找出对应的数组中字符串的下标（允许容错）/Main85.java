package demo;

import java.util.Scanner;

/**
 * 一个字符串数组，现给定一个string去进行找出对应的数组中字符串的下标  
 * （可以有容错，但两字符串长度必须一致，容错为2）
 *  ["hello","hj","abc"]  
     key=“hellg"  返回下角标0
 *
 */
public class Main85 {
	private static void fun(String[] arr,String str){
		for(int i = 0;i < arr.length;i++){
			//必须两个字符长度相等
			if(arr[i].length() == str.length()){
				int count = 0;
				//两个字符从头开始判断
				for(int j = 0;j < str.length();j++){
					//两个字符串容错不能超过2
					if(arr[i].charAt(j) != str.charAt(j)){
						count++;
					}
					if(count > 2){
						break;
					}
					//如果两个字符串判断结束并且容错在2以内，打印该字符串在数组中的下标
					if(count <= 2 && j == str.length() - 1){
						System.out.println(i);
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		//输入字符串数组的长度，并且输入数组和指定字符串
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[n];
		for(int i = 0;i < n;i++){
			arr[i] = scanner.next();
		}
		String str = scanner.next();
		fun(arr,str);
	}

}
