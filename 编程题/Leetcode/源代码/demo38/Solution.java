package demo38;
/**
 * n=1时输出字符串1；n=2时，数上次字符串中的数值个数，因为上次字符串有1个1，
 * 所以输出11；n=3时，由于上次字符是11，有2个1，所以输出21；n=4时，由于上次
 * 字符串是21，有1个2和1个1，所以输出1211。依次类推，写个countAndSay(n)函数返回字符串。
 */
public class Solution {
	 public static String countAndSay(int n) {
	    if (n < 1) {
            return null;
        }
        String result = "1";
        for (int i = 2; i <= n ; i++) {
            result = countAndSay(result);
        }
        return result;
	    }

    public static String countAndSay(String str) {
        StringBuilder builder = new StringBuilder(128);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                builder.append(count);
                builder.append(str.charAt(i - 1));
                count = 1;
            }
        }
        builder.append(count);
        builder.append(str.charAt(str.length() - 1));
        return builder.toString();
    }
}
