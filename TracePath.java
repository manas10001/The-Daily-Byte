/*
Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
*/

import java.util.Scanner;

class TracePath{


	public static boolean tracePath(String path){
		int ud = 0, rl = 0;
		//increase count for right decrease for left
		//increase count for up decrease for down
		for(int i = 0; i < path.length(); i++)
			if(path.charAt(i) == 'U')
				ud++;
			else if(path.charAt(i) == 'D')
				ud--;
			else if(path.charAt(i) == 'R')
				rl++;
			else 
				rl--;
		if(ud == 0 && rl == 0)
			return true;
		return false;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter path of bot: ");
		String path = sc.next();
		sc.close();
		
		if(tracePath(path))
			System.out.println("Back Home");
		else
			System.out.println("Huston looks like we are lost.");
	}
}
