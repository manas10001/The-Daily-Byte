/*
Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order.

Ex: Given the following strings...

"(){}[]", return true
"(({[]}))", return true
"{(})", return false

Problem available on leetcode: https://leetcode.com/problems/valid-parentheses/
*/

import java.util.Scanner;
import java.util.Stack;

class ValidOrder{

	static boolean validOrder(String str){
		Stack<Character> st = new Stack<Character>();
		for (char c : str.toCharArray()){
			if(c =='(' || c=='[' || c=='{')
			    st.push(c);
			else if(c==')' && !st.empty() && st.peek() == '(')
			    st.pop();
			else if(c==']' && !st.empty() && st.peek() == '[')
			    st.pop();
			else if(c=='}' && !st.empty() && st.peek() == '{')
			    st.pop();
			else
			    return false;
		} 
		return st.isEmpty();
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		sc.close();
		System.out.println(validOrder(str));
	}
}
