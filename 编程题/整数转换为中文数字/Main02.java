package com.demo;

/**
 * Created by Joy on 2017/12/31.
 */
public class Main02 {
    private static String[] hanArr = { "零", "一", "二", "三", "四", "五", "六", "七",
        "八", "九" };
    private static String[] unitArr = { "十", "百", "千", "万", "十", "百", "千", "亿",
            "十", "百", "千" };
    public static void main(String[] args) {
        for (int i = 2109999999; i < 2110000000; i++) {
            System.out.println(toHanStr(i));
        }

    }

    private static String toHanStr(Integer number) {
        String numStr = number + "";
        String result = "";
        int numLen = numStr.length();
        for (int i = 0; i < numLen; i++) {
            int num = numStr.charAt(i) - 48;
            if (i != numLen - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLen - 2 - i];
                if (number >= 10 && number < 20) {
                    result = result.substring(1);
                }
            } else {
                if (!(number >= 10 && number % 10 == 0)) {
                    result += hanArr[num];
                }
            }
        }
        return result;
    }


}
