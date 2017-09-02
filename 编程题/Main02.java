package test;
import java.util.Scanner;

/**
 * 序列中任意个连续的元素组成的子序列称为该序列的子串。
 现在给你一个序列P和一个整数K，询问元素和是K的倍数的子串的最大长度。
  比如序列【1,2,3,4,5】，给定的整数K为 5，其中满足条件的子串为{5}、{2,3}、{1,2,3,4}、{1,2,3,4,5}，
  那么答案就为 5，因为最长的子串为{1,2,3,4,5}；如果满足条件的子串不存在，就输出 0。
 *
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = 0;
		int ans = 0;
		if(num <= 0){
			ans = 0;
		}else{
			int k = scanner.nextInt();
			int[] nums = new int[num];
			for(int i = 0;i < num;i++){
				nums[i] = scanner.nextInt();
			}
			for(int i = 0;i<num;i++){
				temp = 0;
				for(int j = i,m=1;j<num;j++,m++){
					temp += nums[j];
					if(temp%k == 0){
						ans = ans > m?ans:m;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
