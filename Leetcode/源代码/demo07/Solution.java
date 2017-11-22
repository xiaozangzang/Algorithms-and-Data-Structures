package demo07;
/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 *��Example2: x = -123, return -321
 */
public class Solution {
	public static int reverse(int x){
		int result = 0;
		while(x != 0){
			int temp = x % 10;
			int newResult = result * 10 + temp;
			//�жϷ�ת��������Ƿ�Խ��
			if((newResult - temp)/10 != result){
				return 0;
			}
			result = newResult;
			x = x /10;
		}
		return result;
	}

}
