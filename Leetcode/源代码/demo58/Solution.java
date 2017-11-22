package demo58;
/**
    * 　给定一个由大小写字母组和空格组成的字符串，返回字符串中的最后一个单词长度。
 *  思路：
 *  先从后找第一个字母的位置x，如果没有找到就返回0，如果找到，再找第一个空格的位记为y(y可能是-1，因为没有找到空格)，返回结果x-y。
 */
public class Solution {
	public static int lengthOfLastWord(String s) {
		    int index = s.length() - 1;
	        // 从后面向前找第一个不是' '的字符
	        while (index >=0 && s.charAt(index) == ' ') {
	            index--;
	        }
	        if (index < 0) {
	            return 0;
	        }
	        int tmp = index;
	        // 执行到下面说明存在最后一个单词
	        // 从后面向前找第一个是' '的字符
	        while (index >=0 && s.charAt(index) != ' ') {
	            index--;
	        }
	        return tmp - index;
    }
}
