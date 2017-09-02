package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * �������������
 * x:[A,B,C,B,D,A,B][11,13,14,23,25,26]
 * y:[B,D,C,A,B,A][10,11,12,14,21,26]
 *
 */
public class Main03 {
	//��̬�滮˼�룬���������ʱ��
	public static void LCSLength(int[] x,int y[],int[][] b,int[][] c){
		for(int i = 0;i < x.length;i++){
			for(int j = 0;j < y.length;j++){
				if(x[i] == y[j]){
					c[i+1][j+1] = c[i][j] + 1;
					b[i+1][j+1] = 1;
				}else if(c[i][j+1] >= c[i+1][j]){
					c[i+1][j+1] = c[i][j+1];
					b[i+1][j+1] = 2;
				}else{
					c[i+1][j+1] = c[i+1][j];
					b[i+1][j+1] = 3;
				}
			}
		}
	}
	//����b[][]�����Ƴ�����������
	public static void LCS(int i,int j,int[] x,int[][] b){
		if(i ==0 || j == 0)return;
		if(b[i][j] == 1){
			LCS(i - 1,j - 1,x,b);
			System.out.print(x[i-1] + " ");
		}else if(b[i][j] == 2){
			LCS(i - 1,j,x,b);
		}else{
			LCS(i,j-1,x,b);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������X���еĳ��ȣ�");
		int xLength = scanner.nextInt();
		System.out.print("������Y���еĳ��ȣ�");
		int yLength = scanner.nextInt();
		//����������ά����,������Ŷ�̬�滮�����ֵ
		int[][] c = new int[xLength+1][yLength+1];
		int[][] b = new int[xLength+1][yLength+1];
		//��ʼ����������
		int[] x = new int[xLength];
		int[] y = new int[yLength];
		for(int i= 0;i < xLength;i++){
			System.out.print("������x��");
			x[i] = scanner.nextInt();
		}
		for(int i=0;i < yLength;i++){
			System.out.print("������y��");
			y[i] = scanner.nextInt();
		}
		System.out.print("����XΪ��");
		System.out.println(Arrays.toString(x));
		System.out.print("����YΪ��");
		System.out.println(Arrays.toString(y));
//		int[] x = {11,13,14,23,25,26};
//		int[] y = {10,11,12,14,21,26};
//		int xLength = x.length;
//		int yLength = y.length;
//		int[][] c = new int[xLength+1][yLength+1];
//		int[][] b = new int[xLength+1][yLength+1];
		Main03.LCSLength(x, y, b, c);
//		for(int i = 1;i <= xLength;i++){
//			for(int j = 1;j <= yLength;j++){
//				System.out.print(b[i][j] + " ");
//				if(j == yLength){
//					System.out.println();
//				}
//			}
//		}
//		for(int i = 1;i <= xLength;i++){
//			for(int j = 1;j <= yLength;j++){
//				System.out.print(c[i][j] + " ");
//				if(j == yLength){
//					System.out.println();
//				}
//			}
//		}
		Main03.LCS(xLength, yLength, x, b);
	}

}
