package demo;

import java.util.Scanner;
/**
 * 给定一个字符串s，请计算输出含有连续两个s作为子串的最短字符串。注意两个s可能有重叠部分。
 * 例如，”ababa”含有两个aba。
 * 输入：abracadabra
 * 输出：abracadabracadabra
 *
 */
public class Main84 {
	 public static void main(String[] args) {
	        Scanner ss = new Scanner(System.in);
	        String s = ss.next();
	        System.out.println(getString(s));
	    }
	    public static String getString(String s) {
	        char[] charArray = s.toCharArray();//将字符串s转为char数组
	        for (int i = 1; i < charArray.length; i++) {
	            //每次从s1的第i位与s2的第0位开始比较
	            int j = 0;
	            int tempi = i;
	            //如果相等则继续比较s1和s2的下一位字符
	            while (charArray[j] == charArray[tempi]) {
	                //如果到了s1的最后一位都是相等的，则返回最短字符串
	                if (tempi == charArray.length - 1) {
	                    String result1 = s.substring(0, i);
	                    return result1 + s;
	                }
	                j++;
	                tempi++;
	            }
	        }
	        //如果没有重复，则返回两个s拼接的字符串
	        return s + s;
	    }
}
