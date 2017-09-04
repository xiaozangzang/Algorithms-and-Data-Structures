package test;
/**
 * 对于一个字符串，和字符串中的某一位置，请设计一个算法，将包括i位置在内的左侧部分移动到右边，将右侧部分移动到左边。
	给定字符串A和它的长度n以及特定位置p，请返回旋转后的结果。
 * @author Joy
 *
 */
public class Main06 {
	private static String getNewString(String A,int n,int p){
		StringBuffer bf = new StringBuffer(A);
		String temp = bf.substring(0,p+1);
		bf.delete(0, p).append(temp);
		return bf.toString();
	}

	public static void main(String[] args) {
		String A  = "PQWIVLQQ";
		int n = A.length();
		String newString = Main06.getNewString(A, n, 5);
		System.out.println(newString);

	}

}
