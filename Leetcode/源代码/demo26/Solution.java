package demo26;
/**
 * 给定一个排序的数组，将数组中的重复元素去掉，相同的只保留一个，并且
 * 返回数组新的元素个数，不要创建一个新的数组来保存结果。在常量时间内解决这个问题
 * @author Joy
 *
 */
public class Solution {
	public static int removeDuplicates(int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int j = 0;
		for(int i = 1;i < nums.length;i++){
			if(nums[i] != nums[j]){
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}
}
