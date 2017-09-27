package test;

import java.util.Scanner;

/**
 * 0-1背包
 * 5
 * 5 4 3 5 2
 * 2 2 3 5 1
 *
 */
public class Demo22 {
	public static int fun(int[] v,int[] w,int c){
		int[] x = new int[v.length];
        x[0] = 1; 
        int[][] m = new int[v.length][c + 1];
        for (int j = 1; j <= c; j++) {
            if (j >= w[0]) {
                m[0][j] = v[0];
            }
        }

        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j <= c; j++) {
                if (j < w[i]) m[i][j] = m[i - 1][j];
                else {
                    if (m[i - 1][j - w[i]] + v[i] > m[i - 1][j]) m[i][j] = m[i - 1][j - w[i]] + v[i]; 
                    else m[i][j] = m[i - 1][j];
                }
            }
        }
        return m[w.length - 1][c];
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            w[j] = scanner.nextInt();
        }
        int c = scanner.nextInt();
        System.out.println(fun(v, w, c));
    }
}
