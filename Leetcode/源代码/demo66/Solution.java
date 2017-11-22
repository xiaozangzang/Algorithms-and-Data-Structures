package demo66;

import java.util.Arrays;
/**
 * ����һ���������ʾ��һ�������������м�һ������
 *��ÿһ����λ���洢�������һ��λ���ϡ������±�Ӵ�С��ʾ��λ�ӵ�λ����λ��
 *
 */
public class Solution {
	 public static int[] plusOne(int[] digits) {
		 if(digits == null || digits.length == 0) return null;
	     int flag = 1;
		 for(int i = digits.length - 1;i >= 0 && flag == 1;i--){
			  digits[i] += flag;
			  //�����ǰԪ�ؼ�1�����10
			  if(digits[i] ==  10){
				  flag = 1;
				  digits[i] = 0;
			  }else{
				  flag = 0;
			  }
		 }
		 //���flag==1����˵�������鳬��ԭ������ĳ���
		 if(flag == 1){
			 digits = Arrays.copyOf(digits, digits.length+1);
			 digits[0] = 1;
		 }
		 return digits;
     }
}
