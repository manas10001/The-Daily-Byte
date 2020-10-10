/*
Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether or not the sequences produce the same result.

Ex: Given the following strings...

s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
*/

import java.util.Scanner;

class CompareKeystrokes{

	static boolean compare(String s, String t){
		StringBuilder sb1 = new StringBuilder(s);
		StringBuilder sb2 = new StringBuilder(t);

		//process 1st string
		while(sb1.length() != 0){
			if(sb1.indexOf("#") != -1){
				int i = sb1.indexOf("#");
				if(sb1.charAt(i) == '#'){
					sb1.deleteCharAt(i);
					if(i != 0)
						sb1.deleteCharAt(i-1);
				}
			}else
				break;
		}
		
		//process 2nd string
		while(sb2.length() != 0){
			if(sb2.indexOf("#") != -1){
				int i = sb2.indexOf("#");
				if(sb2.charAt(i) == '#'){
					sb2.deleteCharAt(i);
					if(i != 0)
						sb2.deleteCharAt(i-1);
				}
			}else
				break;
		}
		return (sb1.toString().equals(sb2.toString()));
	}	

	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter s and t: ");
		String s = sc.next();
		String t = sc.next();
		sc.close();
		System.out.println(compare(s, t));
	}
}
