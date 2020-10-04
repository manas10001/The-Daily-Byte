/*
Given an array of integers, return whether or not two numbers sum to a given target, k.
Note: you may not sum a number with itself.

Ex: Given the following...

[1, 3, 8, 2], k = 10, return true (8 + 2)
[3, 9, 13, 7], k = 8, return false
[4, 2, 6, 5, 2], k = 4, return true (2 + 2)
*/

import java.util.Scanner;
import java.util.HashMap;
class TwoSum{
	
	static boolean findSum(int[] arr, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++){
			int diff = k - arr[i];
			if(map.containsKey(diff))
				return true;
			map.put(arr[i], i);
		}
		return false;
	}
	
	public static void main(String st[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter "+ n +" array elements: ");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
			
		System.out.print("Enter desired sum: ");
		int k = sc.nextInt();
		sc.close();
		
		System.out.println(findSum(arr, k));
	}	
	
}
