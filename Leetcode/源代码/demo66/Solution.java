package demo66;

import java.util.Arrays;
/**
 * 给定一个用数组表示的一个数，对它进行加一操作。
 *　每一个数位都存储在数组的一个位置上。数组下标从大到小表示数位从低位到高位。
 *
 */
public class Solution {
	 public static int[] plusOne(int[] digits) {
		 if(digits == null || digits.length == 0) return null;
	     int flag = 1;
		 for(int i = digits.length - 1;i >= 0 && flag == 1;i--){
			  digits[i] += flag;
			  //如果当前元素加1后等于10
			  if(digits[i] ==  10){
				  flag = 1;
				  digits[i] = 0;
			  }else{
				  flag = 0;
			  }
		 }
		 //如果flag==1，则说明新数组超过原来数组的长度
		 if(flag == 1){
			 digits = Arrays.copyOf(digits, digits.length+1);
			 digits[0] = 1;
		 }
		 return digits;
     }
}
