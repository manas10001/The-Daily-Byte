/*
Given a string, return whether or not it forms a palindrome ignoring case and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true
*/

import java.util.Scanner;

class ValidPalindrome{

	public boolean isValid(String s){
		s = s.toUpperCase();
		int i = 0, j = s.length() - 1;
		
		while(i <= j){
			if((s.charAt(i) < 65 || s.charAt(i) > 90) && (s.charAt(i) < 48 || s.charAt(i) > 57)){
				i++;
				continue;
			}
			if((s.charAt(j) < 65 || s.charAt(j) > 90) && (s.charAt(j) < 48 || s.charAt(j) > 57)){
				j--;
				continue;
			}
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to check: ");
		String inp = sc.nextLine();
		sc.close();
		ValidPalindrome vp = new ValidPalindrome();
		
		if(vp.isValid(inp))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
