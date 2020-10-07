/*
Given two integer arrays, return their intersection.
Note: the intersection is the set of elements that are common to both arrays.

Ex: Given the following arrays...

nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]
nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]
nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []

*/

import java.util.Scanner;
import java.util.HashSet;

class ArrayIntersection{

	static void getIntersection(int a1[], int a2[]){
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i = 0; i < a1.length; i++)
			hs.add(a1[i]);
		
		for(int i = 0; i < a2.length; i++)
			if(hs.contains(a2[i]))
				System.out.print(a2[i]+" ");
		
	}

	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 array sizes: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		
		int a1[] = new int[s1];
		int a2[] = new int[s2];
		
		System.out.print("Enter 1st array "+s1+" elements: ");
		for(int i = 0; i < s1; i++)
			a1[i] = sc.nextInt();

		System.out.print("Enter 2nd array "+s2+" elements: ");
		for(int i = 0; i < s2; i++)
			a2[i] = sc.nextInt();
			
		sc.close();
		
		System.out.print("[ ");
		getIntersection(a1,a2);
		System.out.println(" ]");
	}
}
