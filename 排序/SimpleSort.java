package Algorithm_exercise;
/*
 * ���롢ѡ��ð�ݡ�ϣ������
 */
import java.util.Arrays;

public class SimpleSort {

	private SimpleSort() {

	}

	// �������� ����������
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

	// ��������(��a[0]Ϊ����Ҫ�����¿ռ�)
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

	// ð������
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

	// ѡ������
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
//	ϣ������----(��������)
	/*
	 * һ������  �����ݼ���1
	 * i:����--n
	 * j:i-����--0,j -= ����
	 */
	private int increame = 10;//����ֵ��Ϊ10

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
