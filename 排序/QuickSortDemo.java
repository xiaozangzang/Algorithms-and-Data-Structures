package Algorithm_exercise;

import java.util.Arrays;

/*
 * 快速排序
 */
public class QuickSortDemo {
	
	public QuickSortDemo(){
		
	}


	// 数组a，首元素索引和尾元素索引
	public void QuickSort(int[] a,  int p, int r) {
		if (p < r) {
			int q = Partition( a,  p, r);
			QuickSort(a, p, q - 1);
			QuickSort(a, q + 1, r);
		}
	}

	public int Partition(int[] a, int p, int r) {
		int i = p;
		int j = r + 1;
		int x = a[p];// 基准
		while (true) {
			while (a[++i] < x && i < r);
			while (a[--j] > x);
			if (i >= j)
				break;
			
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		a[p] = a[j];
		a[j] = x;
		return j;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 23, 12, 43, 54,3, 76, 3, 11 };
		System.out.println(Arrays.toString(a));
		new QuickSortDemo().QuickSort(a,0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}
	
	
	

}
