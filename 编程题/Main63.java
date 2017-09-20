package demo;

import java.util.Scanner;

public class Main63 {

	private static long fun(int a,int b,int m){
		if(b == 0){
			return 1 % m;
		}
		if(b == 1){
			return a % m;
		}
	    long x = fun(a,b/2,m);
	    long res = x * x % m;
	    if(b%2 == 1){
	    	res = res * a % m;
	    }
	    return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] arr = str.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int m = Integer.parseInt(arr[2]);
		System.out.println(fun(a,b,m));
	}
	
}
