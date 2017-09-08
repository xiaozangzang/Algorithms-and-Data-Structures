package test;

import java.util.Scanner;

/**
 *  N!的结果中末尾0的个数
 * 
 */
public class Main11 {

	private static int returnResult(int n){
		int count = 0;
		int j = 0;
		for(int i = 1;i <= n;i++){
			j = i;
			while(j % 5 == 0){
				count++;
				j /= 5;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(returnResult(n));
	}

}
