/*
Given two strings s and t return whether or not s is an anagram of t.
Note: An anagram is a word formed by reordering the letters of another word.

Ex: Given the following strings...

s = "cat", t = "tac", return true
s = "listen", t = "silent", return true
s = "program", t = "function", return false
*/
import java.util.Scanner;
import java.util.Arrays;

class ValidAnagram{

	static boolean areAnagram(String s, String t){
		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		s = new String(sArr);
		t = new String(tArr);
		return s.equals(t);
	}
	
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 strings: ");
		String s = sc.next();
		String t = sc.next();
		sc.close();
		System.out.println(areAnagram(s, t));
	}
}
