/*
Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result.

Ex: Given the following strings...

s = "abccba", return ""
s = "foobar", return "fbar"
s = "abccbefggfe", return "a"

Problem available on leetcode: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
*/

import java.util.Scanner;
import java.util.Stack;

class DeleteAdjacent{

	static String deleteAdjacent(String str){
		Stack<Character> st = new Stack<>();
		
		st.push(str.charAt(0));
		
		for(int i = 1; i < str.length(); i++){
			while(!st.isEmpty() && i < str.length() && st.peek() == str.charAt(i)){
				st.pop();
				i++;
			}
			if(i < str.length())
				st.push(str.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty())
			sb.append(st.pop());

		sb.reverse();
		return sb.toString();
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		sc.close();
		System.out.println("\""+deleteAdjacent(str)+"\"");
		
	}
}
