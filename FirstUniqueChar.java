/*
Given a string, return the index of its first unique character. If a unique character does not exist, return -1.

Ex: Given the following strings...

"abcabd", return 2
"thedailybyte", return 1
"developer", return 0
*/
import java.util.Scanner;

class FirstUniqueChar{

	static int firstUniqueChar(String str){
		int[] counter = new int[26];
		
		//all are counted
		for(int i = 0; i < str.length(); i++)
			counter[str.charAt(i) - 'a']++;
		
		for(int i = 0; i < str.length(); i++)
			if(counter[str.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}

	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();
		sc.close();
		System.out.println(firstUniqueChar(str));
	}
}
