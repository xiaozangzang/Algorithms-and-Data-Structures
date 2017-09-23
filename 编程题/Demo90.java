package demo;

import java.util.Scanner;
/**
 * 输入年月日，输出在该年中的该天~
 * @author Joy
 *
 */
public class Demo90 {

	public static void fun(String str){
		int year;
        int month;
        int day=0;
        int days;
        //累计天数
        int d=0;
		String[] arr = str.split(" ");
		year = Integer.parseInt(arr[0]);
        month = Integer.parseInt(arr[1]);
        days = Integer.parseInt(arr[2]);
        if (month < 0 || month > 12 || days < 0 || days > 31) {
            return;
        }
        for (int i = 1; i < month; i++) {
            switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                day = 31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                day = 30;
                break;
            }
            case 2: {
                /**
                 * 闰年:①：非整百年数除以4，无余为闰，有余为平；②整百年数除以400，无余为闰有余平
                 * 二月：平年28天、闰年29天
                 */
                if ((year % 100 !=0 &&year % 4 == 0) || (year % 100 == 0 && year%400==0)) {
                    day = 29;
                } else {
                    day = 28;
                }
            }
            default:
                break;
            }
            d += day;
        }
        d += days;
        System.out.println(d);
	}
	public static void main(String[] args) {
		
		 
	        Scanner scanner = new Scanner(System.in);
	        while(true){
	        	String str = scanner.nextLine();
	        	fun(str);
	        }
	}

}
