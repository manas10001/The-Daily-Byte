/*
Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"abcba", return true
"foobof", return true (remove the first 'o', the second 'o', or 'b')
"abccab", return false
*/
import java.util.Scanner;

class DeletionPalindronme{

	//checks if a given section of str is palindrome or not
	public static boolean isPalindrome(String str, int start, int end){
		
		while(start < end){
			if(str.charAt(start) != str.charAt(end))
				return false;
			else{
				start++;
				end--;
			}	
		}
		return true;
	}

	//checks if a string can be made palindrome on deletion of 1 character
	public static boolean isVaidPal(String str){
		int low = 0, high = str.length() - 1;
		
		while(low < high){
			//if characters are equal then move ahead 
			if(str.charAt(low) == str.charAt(high)){
				low++;
				high--;
			}else{
				//we can either remove the low or high character if any of these removals give us valid palindrome then we will return true
				//remove low so we check plaindrome from low+1 to high
				//remove high so we check plaindrome from low to high-1
				return (isPalindrome(str, low + 1, high) || isPalindrome(str, low, high - 1));
			}
		}
		return true;
	}

	public static void main(String ars[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		sc.close();
		System.out.println(isVaidPal(str));
	}
}
