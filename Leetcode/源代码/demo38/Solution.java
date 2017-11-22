package demo38;
/**
 * n=1ʱ����ַ���1��n=2ʱ�����ϴ��ַ����е���ֵ��������Ϊ�ϴ��ַ�����1��1��
 * �������11��n=3ʱ�������ϴ��ַ���11����2��1���������21��n=4ʱ�������ϴ�
 * �ַ�����21����1��2��1��1���������1211���������ƣ�д��countAndSay(n)���������ַ�����
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
