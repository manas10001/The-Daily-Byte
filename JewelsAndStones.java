/*
Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/
import java.util.Scanner;
import java.util.HashSet;

class JewelsAndStones{

	static int countCommon(String j, String s){
		HashSet<Character> hs = new HashSet<>();
		int count = 0;
		
		for(int i = 0; i < j.length(); i++)
			hs.add(j.charAt(i));
			
		for(int i = 0; i < s.length(); i++)
			if(hs.contains(s.charAt(i)))
				count++;
				
		return count;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two strings for jewels and stones respectively: ");
		String j = sc.next();
		String s = sc.next();
		sc.close();
		System.out.println(countCommon(j, s));
	}
}
