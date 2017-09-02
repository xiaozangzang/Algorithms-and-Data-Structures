package test;

import java.util.Scanner;
/**
 * 一个数组有 N 个元素，求连续子数组的最大和。
 *  例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
 */
public class Main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		if(n <= 0){
			sum = 0;
		}else{
			//数组长度大于0
			int[] nums = new int[n];
			int temp = 0;
			//生成数组
			for(int i = 0;i < n;i++){
				nums[i] = scanner.nextInt();
			}
			int max = nums[0];
            sum = nums[0];
            for(int i=1;i<n;i++){
                if(sum>=0){
                    sum += nums[i];
                }else{
                    sum=nums[i];
                }
                if(sum>max)max=sum;
            }
		}
		System.out.println(sum);


	}

}
