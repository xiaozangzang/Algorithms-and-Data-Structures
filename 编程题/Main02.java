package test;
import java.util.Scanner;

/**
 * �����������������Ԫ����ɵ������г�Ϊ�����е��Ӵ���
 ���ڸ���һ������P��һ������K��ѯ��Ԫ�غ���K�ı������Ӵ�����󳤶ȡ�
  �������С�1,2,3,4,5��������������KΪ 5�����������������Ӵ�Ϊ{5}��{2,3}��{1,2,3,4}��{1,2,3,4,5}��
  ��ô�𰸾�Ϊ 5����Ϊ����Ӵ�Ϊ{1,2,3,4,5}����������������Ӵ������ڣ������ 0��
 *
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int temp = 0;
		int ans = 0;
		if(num <= 0){
			ans = 0;
		}else{
			int k = scanner.nextInt();
			int[] nums = new int[num];
			for(int i = 0;i < num;i++){
				nums[i] = scanner.nextInt();
			}
			for(int i = 0;i<num;i++){
				temp = 0;
				for(int j = i,m=1;j<num;j++,m++){
					temp += nums[j];
					if(temp%k == 0){
						ans = ans > m?ans:m;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
