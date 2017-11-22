package demo28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strA = scanner.next();
		String strB = scanner.next();
		System.out.println(Solution.strStr(strA, strB));

	}

}
