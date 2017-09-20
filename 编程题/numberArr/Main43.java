package demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 整型数组，让所有的奇数排列在偶数前面
 *
 */
public class Main43 {
	public static int[] fun(int[] a){
		int i = -1,j = a.length;
		while(i < j){
			while(i < j && a[++i] % 2 == 1);
			while(i < j && a[--j] % 2 == 0);
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		for(int i = 0;i < length;i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(fun(arr)));
	}

}
