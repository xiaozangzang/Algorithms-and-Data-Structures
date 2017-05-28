package Algorithm_exercise;

import java.util.Arrays;

/*
 * 基数排序  ，“桶子法”  分配式排序
 */
public class RadixSort {

	public RadixSort() {

	}

	public void radixSort(int[] a, int d) {
		int k = 0;
		int n = 1;
		int m = 1;
		int[][] temp = new int[a.length][a.length];
		int[] order = new int[a.length];
		while (m <= d) {
			for (int i = 0; i < a.length; i++) {
				int lsd = ((a[i] / n) % 10);
				temp[lsd][order[lsd]] = a[i];
				order[lsd]++;
			}
			for (int i = 0; i < d; i++) {
				if (order[i] != 0)
					for (int j = 0; j < order[i]; j++) {
						a[k] = temp[i][j];
						k++;
					}
				order[i] = 0;
			}
			n *= 10;
			k = 0;
			m++;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 23, 12, 43, 54, 76, 3, 11 };
		int d = 2;
		System.out.println(Arrays.toString(a));
		new RadixSort().radixSort(a, d);
		System.out.println(Arrays.toString(a));

	}

}
