package demo53;

public class Solution {
	public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
        	throw new IllegalArgumentException();
        }
        int sum = nums[0];
        int b = 0;
        for(int i = 0;i<nums.length;i++){
            if(b > 0)
                b += nums[i];
            else
                b = nums[i];
            if(b > sum)
                sum = b;
        }
        return sum;
    }
}
