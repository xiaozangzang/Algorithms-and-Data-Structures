package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main62 {

	public static void print(String str,int n){
		str = str.replaceAll(" ", ""); 
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		StringBuffer left = new StringBuffer();
		StringBuffer right = new StringBuffer();
		for(int i = 0;i < n;i++){
			left.append(charArr[i]);
			left.append(" ");
		}
		for(int i = charArr.length-1;i >= charArr.length-n;i--){
			right.append(charArr[i]);
			right.append(" ");
		}
		System.out.println(left.toString());
		System.out.println(right.toString());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int n = scanner.nextInt();
		print(str,n);
	}



}
