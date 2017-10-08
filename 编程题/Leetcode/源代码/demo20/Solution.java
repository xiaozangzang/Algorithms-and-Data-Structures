package demo20;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', 
 * '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" 
 * are all valid but "(]" and "([)]" are not.
 *  
 */
public class Solution {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0;i < s.length();i++){
			
			//�жϵ�ǰ�ַ�Ϊ'(','{','['����ѹջ
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
				stack.push(s.charAt(i));
			}
			//�жϵ�ǰ�ַ�Ϊ')','}',']'���������ж�ջ�Ƿ�Ϊ�գ����ж�ջ��Ԫ���Ƿ�Ϊ'(','{','['
			if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
				if(stack.empty()){
					return false;
				}
				if((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '{' && s.charAt(i) == '}') || (stack.peek() == '[' && s.charAt(i) == ']')){
					stack.pop();
				}else
					return false;
			}
		}
		//���ѭ��������ջ������Ԫ���򷵻�false
		if(!stack.empty()){
			return false;
		}
		return true;
	}

}
