package demo38;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			int n = scanner.nextInt();
			System.out.println(Solution.countAndSay(n));
		}
	}

}
