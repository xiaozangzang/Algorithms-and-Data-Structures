package demo58;
/**
    * ������һ���ɴ�Сд��ĸ��Ϳո���ɵ��ַ����������ַ����е����һ�����ʳ��ȡ�
 *  ˼·��
 *  �ȴӺ��ҵ�һ����ĸ��λ��x�����û���ҵ��ͷ���0������ҵ������ҵ�һ���ո��λ��Ϊy(y������-1����Ϊû���ҵ��ո�)�����ؽ��x-y��
 */
public class Solution {
	public static int lengthOfLastWord(String s) {
		    int index = s.length() - 1;
	        // �Ӻ�����ǰ�ҵ�һ������' '���ַ�
	        while (index >=0 && s.charAt(index) == ' ') {
	            index--;
	        }
	        if (index < 0) {
	            return 0;
	        }
	        int tmp = index;
	        // ִ�е�����˵���������һ������
	        // �Ӻ�����ǰ�ҵ�һ����' '���ַ�
	        while (index >=0 && s.charAt(index) != ' ') {
	            index--;
	        }
	        return tmp - index;
    }
}
