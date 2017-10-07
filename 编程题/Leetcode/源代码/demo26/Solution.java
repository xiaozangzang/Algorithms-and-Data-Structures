package demo26;
/**
 * ����һ����������飬�������е��ظ�Ԫ��ȥ������ͬ��ֻ����һ��������
 * ���������µ�Ԫ�ظ�������Ҫ����һ���µ����������������ڳ���ʱ���ڽ���������
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
