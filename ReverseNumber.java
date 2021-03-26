/*
    Given a 32 bit signed integer, reverse it and return the result.
    Note: You may assume that the reversed integer will always fit within the bounds of the integer data type.

    Ex: Given the following integer num

    num = 550, return 55

    Ex: Given the following integer num

    num = -37, return -73
*/
import java.util.Scanner;

class ReverseNumber{

    static String revNo(int no){
        
        StringBuilder sb = new StringBuilder(String.valueOf(no));

        //remove trailing 0's 
        while(sb.charAt(sb.length()-1) == '0')
            sb.deleteCharAt(sb.length()-1);
        
        //handle for negative number
        if(no < 0){
            sb.deleteCharAt(0);
            sb.append('-');
        }

        return sb.reverse().toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to reverse: ");
        int no = sc.nextInt();

        System.out.println("Reversed no is: " + revNo(no));

    }
}