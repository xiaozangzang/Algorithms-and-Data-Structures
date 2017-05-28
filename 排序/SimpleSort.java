package Algorithm_exercise;
/*
 * 插入、选择、冒泡、希尔排序
 */
import java.util.Arrays;

public class SimpleSort {

	private SimpleSort() {

	}

	// 插入排序 不带监视哨
	/*
	 * i:1--n 
	 * j:(i-1)--0
	 */
	public void insertSort(int[] a) {
		int temp;
		int i, j;
		for (i = 1; i < a.length; i++) {
			temp = a[i];
			for (j = i - 1; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}

	}

	// 带监视哨(即a[0]为不需要开辟新空间)
	public void insertSort2(int[] a) {
		int i, j;
		for (i = 1; i < a.length; i++) {
			a[0] = a[i];
			for (j = i - 1; a[0] < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = a[0];
		}
	}

	// 冒泡排序
	/*
	 * i:1--n j:0--(n-i)
	 */
	public void bubbleSort(int[] a) {
		int temp;
		boolean flag = true;
		for (int i = 1; i < a.length; i++) {
			flag = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;

				}
			}
		}
	}

	// 选择排序
	/*
	 * i:0--n 
	 * j:i+1--n
	 */
	public void selectSort(int[] a) {
		int temp;
		int i, j;
		for (i = 0; i < a.length; i++) {
			int min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != j) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
//	希尔排序----(插入排序)
	/*
	 * 一个增量  增量递减至1
	 * i:增量--n
	 * j:i-增量--0,j -= 增量
	 */
	private int increame = 10;//增量值设为10

	public void shellSort(int[] a) { 
		int temp;
		int i, j;
		while (increame	 > 1) {
			increame = increame / 3 + 1;
			for(i = increame;i < a.length;i++){
				temp = a[i];
				for(j = i - increame;j >= 0 && temp < a[j];j -= increame){
					a[j + increame] = temp;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 23, 12, 43, 54, 76, 3, 11 };
		SimpleSort sort = new SimpleSort();
		System.out.println(Arrays.toString(a));
		sort.insertSort(a);
		System.out.println(Arrays.toString(a));
		sort.bubbleSort(a);
		System.out.println(Arrays.toString(a));
		sort.selectSort(a);
		System.out.println(Arrays.toString(a));
		sort.shellSort(a);
		System.out.println(Arrays.toString(a));

		
	}

}
