/*
Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters.

Ex: Given the following arrays...

["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
*/
import java.util.Scanner;

class LCP{

	public static String lcp(String[] strs){
		String pre = strs[0];
		
		for(int i = 1; i < strs.length; i++){
			pre = compPre(pre, strs[i]);
			if(pre == "")
				break;
		}
		return pre;
	
	}
	public static String compPre(String pre, String cur){
		int mn = Math.min(pre.length(), cur.length());
		
		for(int i = 0; i < mn; i++)
			if(pre.charAt(i) != cur.charAt(i))
				return pre.substring(0, i);
				
		return pre.substring(0, mn);
	}

	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		String[] strs = new String[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("\nEnter string: ");
			String s = sc.next();
			strs[i] = s;
		}
		System.out.println("Longest common prefix is: "+ lcp(strs));
	}
}
