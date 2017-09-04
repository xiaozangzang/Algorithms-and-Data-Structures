package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 对于一个矩阵，请设计一个算法，将元素按“之”字形打印。具体见样例。
 *      给定一个整数矩阵mat，以及他的维数nxm，请返回一个数组，其中元素依次为打印的数字。
 *
 */
public class Main05 {
	private static int[] returnArray(int[][] arr,int n, int m){
		int[] returnArr = new int[n*m];
		int i = 0;
		for(int j = 0;j < n;j++){
			if(j % 2 != 0){
				for(int k = m -1;k >= 0;k--){
					returnArr[i++] = arr[j][k];
				}
			}else{
				for(int k = 0;k < m;k++){
					returnArr[i++] = arr[j][k];
				}
			}
		}
		return returnArr;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int n = arr.length;
		int m = arr[0].length;
		int[] returnArr = Main05.returnArray(arr,n,m);
		System.out.println(Arrays.toString(returnArr));
	}

}
