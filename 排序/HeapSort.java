package Algorithm_exercise;

/*
 * ¶ÑÅÅÐò
 * 1.½¨¶Ñ
 * 2.ÅÅÐò
 */
import java.util.Arrays;

public class HeapSort {
	private int count;

	public HeapSort() {

	}

	public HeapSort(int count) {
		this.count = count;
	}

	public void buildHeap(int[] a) {
		int i;
		for (i = count / 2 - 1; i >= 0; i--) {
			int current = a[i];
			insertHeap(a, current, i, count - 1);
		}
	}

	public void insertHeap(int[] a, int current, int i, int j) {
		// TODO Auto-generated method stub
		int k = 2 * i + 1;
		while (k <= j) {
			if (k < j && a[k] < a[k + 1])
				k++;
			if (current >= a[k])
				break;
			else {
				a[i] = a[k];
				i = k;
				k = 2 * i + 1;
			}
		}
		a[i] = current;

	}

	// ¶ÑÅÅÐò
	public void heapSort(int[] a) {
		int current, last;
		buildHeap(a);
		for (last = count - 1; last > 0; last--) {
			current = a[last];
			a[last] = a[0];
			insertHeap(a, current, 0, last - 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 23, 12, 43, 54, 76, 3, 11 };
		System.out.println(Arrays.toString(a));
		new HeapSort(a.length).heapSort(a);
		System.out.println(Arrays.toString(a));

	}

}
