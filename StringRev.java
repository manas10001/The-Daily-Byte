/*
Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...

“Cat”, return “taC”
“The Daily Byte”, return "etyB yliaD ehT”
“civic”, return “civic”
*/

import java.util.Scanner;

public class StringRev{

	public String reverse(String str){
		String sol = "";
		char ch[] = str.toCharArray();
		for(int i = ch.length - 1; i > -1; i--)
			sol += ch[i];
		return sol;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse: ");
		String str = sc.nextLine();
		StringRev sr = new StringRev();
		String sol = sr.reverse(str);
		System.out.println("Reversed string is : "+sol);
	}
}
