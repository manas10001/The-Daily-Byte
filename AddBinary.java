/*
Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...

"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
*/

import java.util.Scanner;

class AddBinary{

	static String addition(String a, String b){
		StringBuilder sb = new StringBuilder();
        
        char carry = '0';
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while(i >= 0 || j >= 0){
            char ac = (i >= 0) ? a.charAt(i--) : '0';
            char bc = (j >= 0) ? b.charAt(j--) : '0';
            
            char ans = add(ac, bc, carry);
            if(ans > '1') 
            	carry = '1';
            else 
            	carry = '0';
            sb.append(ans % 2);
        }
        if(carry == '1') 
        	sb.append(carry);
        return sb.reverse().toString();
    }
    
    private static char add(char a, char b, char c){
        return (char)(a - '0' + b - '0' + c);
    }

	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 nos: ");
		String first = sc.next();
		String second = sc.next();
		sc.close();
		System.out.print("Addition is: "+addition(first, second));
	}
}
