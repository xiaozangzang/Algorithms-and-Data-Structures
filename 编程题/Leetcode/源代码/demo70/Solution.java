package demo70;
/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways 
 * can you climb to the top?
 * Note: Given n will be a positive integer.
 * 题目分析：每次只能走1或2步，问n步的话有多少中走法？？？？

 * @author Joy
 *
 */
public class Solution {
	public int climbStairs1(int n) {
        if (n == 1) {
           return 1;
       }
       int[] dp = new int[n + 1];
       dp[1] = 1;
       dp[2] = 2;
       for (int i = 3; i <= n; i++) {
           dp[i] = dp[i - 1] + dp[i - 2];
       }
       return dp[n];
   }
	
	
	public int climbStairs2(int n) {
        if (n == 1) {
           return 1;
       }
      int first = 1;
      int second = 2;
      int result = 0;
       for (int i = 3; i <= n; i++) {
    	   result = first + second;
    	   first = second;
    	   second = result;
       }
       return result;
   }
	//递归实现
	public int climbStairs3(int n) {
	 if(n == 0){
            return 0;
        }else if(n == 1 || n == 2){
            return n;
        }else{
            return climbStairs3(n - 1) + climbStairs3(n - 2);
        }
   }

}
