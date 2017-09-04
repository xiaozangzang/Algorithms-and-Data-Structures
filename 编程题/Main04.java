package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
	public static String[] getStringArr(int n){
		int len = (1<<n)-1;
		int middle = 0;
		String[] arr = new String[len];
		for(int i =  1;i <= n;i++){
			middle = ((1<<i) - 1)>>1;
			arr[middle] = "down";
			for(int j = middle - 1,d = 1;j >= 0;j--,d++){
				if(arr[j].equals("down")){
					arr[middle+d] = "up";
				}else{
					arr[middle+d] = "down";
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = Main04.getStringArr(n);
		System.out.println(Arrays.toString(str));
	}

}
