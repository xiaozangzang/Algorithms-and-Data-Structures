package demo14;

public class Solution {
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null){
			return null;
		}
		if(strs.length == 0){
			return "";
		}
        //�ҳ�����ַ���
        String shortStr = strs[0];
        for(int i = 1;i < strs.length;i++){
            if(shortStr.length() > strs[i].length()){
                shortStr = strs[i];
            }
        }
        //���ַ��������е��ַ�����һ������ַ����Ƚϣ��ҳ��ǰ׺
        int n = shortStr.length();
        for(int i = 0;i < strs.length;i++){
        	for(int j = 0;j < shortStr.length();j++){
        		if(strs[i].charAt(j) != shortStr.charAt(j)){
        			if(j < n){
        				n = j;
        			}
        		}
        	}
        }
        return shortStr.substring(0,n);
    }
}
