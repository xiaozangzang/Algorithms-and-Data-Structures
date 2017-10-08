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
			
			//判断当前字符为'(','{','['，则压栈
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
				stack.push(s.charAt(i));
			}
			//判断当前字符为')','}',']'，则首先判断栈是否为空，再判断栈顶元素是否为'(','{','['
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
		//如果循环结束，栈中仍有元素则返回false
		if(!stack.empty()){
			return false;
		}
		return true;
	}

}
