package demo26;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		int n = Solution.removeDuplicates(nums);
		System.out.println(n);
		System.out.println(Arrays.toString(nums));
	}
}
