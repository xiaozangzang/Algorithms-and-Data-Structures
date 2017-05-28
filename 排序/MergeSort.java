package Algorithm_exercise;

import java.util.Arrays;

public class MergeSort {

	public MergeSort() {

	}

	public void mergeSort1(int[] a, int n) {
		int[] b = new int[n];
		int s = 1;
		while (s <= n) {
			mergePass1(a, b, s, n);
			s += s;
			mergePass1(b, a, s, n);
			s += s;
		}
	}

	public void mergePass1(int[] a, int[] b, int s, int n) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i <= n - 2 * s) {
			merge1(a, b, i, i + s - 1, i + 2 * s - 1);
			i = i + 2 * s;
		}
		if (i + s < n)
			merge1(a, b, i, i + s - 1, n - 1);
		else
			for (int j = i; j <= n - 1; j++)
				b[j] = a[j];
	}

	public void merge1(int[] a, int[] b, int p, int m, int r) {
		int i = p, j = m + 1, k = r;
		while ((i <= m) && (j <= r))
			if (a[i] <= a[j])
				b[k++] = a[i++];
			else
				b[k++] = a[j++];
		if (i > m)
			for (int q = j; q <= r; q++)
				b[k++] = a[q];
		else
			for (int q = i; q <= m; q++)
				b[k++] = a[q];

	}

	// µ›πÈ µœ÷
	public void mergeSort2(int[] a, int length) {
		recursive_merge_sort(a, 0, length - 1);
	}

	public void recursive_merge_sort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		if (high > low) {
			recursive_merge_sort(a, low, (high + low) / 2);
			recursive_merge_sort(a, (high + low) / 2 + 1, high);
			// ≈≈–Ú
			merge2(a, low, high);
		}
	}

	public void merge2(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int[] temp = new int[high - low + 1];
		int index = 0;
		int index1 = low, mid = (low + high) / 2, index2 = mid + 1;
		while (index1 <= mid && index2 <= high) {
			if (a[index1] < a[index2])
				temp[index++] = a[index1++];
			else
				temp[index++] = a[index2++];
		}
		while (index1 <= mid)
			temp[index++] = a[index1++];
		while (index2 <= high)
			temp[index++] = a[index2++];
		for (int i = 0; low <= high; low++, i++) {
			a[low] = temp[i];
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 23, 12, 3, 43, 54, 76, 3, 11 };
		System.out.println(Arrays.toString(a));
		new MergeSort().mergeSort2(a, a.length);
		System.out.println(Arrays.toString(a));
	}

}
