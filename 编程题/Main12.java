package test;

import java.util.Scanner;

/**
 * 求N！的二进制表示中最低位1的位置
 *
 */
public class Main12 {

	private static int lowestOne(int n){
		int pos = 0;
		while(n != 0){
			n >>= 1;
			pos += n;
		}
		return pos;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(lowestOne(n));

	}

}
