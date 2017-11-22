package demo09;

public class Solution {
	public static boolean isPalindrome(int x) {
		if(x < 0){
			return false;
		}
		//将数字反转
		long result = 0;
		long temp = x;
		while(temp != 0){
			result = result * 10 + temp % 10;
			temp = temp / 10;
		}
		return result == x;
	}

}
