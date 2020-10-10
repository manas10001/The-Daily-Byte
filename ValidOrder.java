/*
Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order.

Ex: Given the following strings...

"(){}[]", return true
"(({[]}))", return true
"{(})", return false

Problem available on leetcode: 
*/

import java.util.Scanner;

class ValidOrder{

	static boolean validOrder(String str){
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		sc.close();
		System.out.println(validOrder(str));
	}
}
