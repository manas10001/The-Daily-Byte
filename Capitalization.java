/*
Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
*/

import java.util.Scanner;

class Capitalization{
	static boolean isValid(String str){
		boolean stCap = false;
		int ucount = 0, lcount = 0;
		if(str.charAt(0) > 64 && str.charAt(0) < 91)
			stCap = true;
		else
			lcount++;
			
		for(int i = 1; i < str.length(); ++i){
			if(str.charAt(i) > 64 && str.charAt(i) < 91)
				ucount++;
			else
				lcount++;
		}
		if(ucount == 0){
			if(lcount >= (str.length() - 1))
				return true;
		}else if(stCap){
			if(ucount == 0 && lcount == (str.length() - 1))
				return true;
			else if(ucount == (str.length() - 1) && lcount == 0)
				return true;
		}

		return false;			
	}
	
	public static void main(String ars[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to check: ");
		String str = sc.next();
		sc.close();
		System.out.println(isValid(str));
		
	}
	
}
