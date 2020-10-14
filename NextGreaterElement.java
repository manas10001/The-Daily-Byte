/*
Given two arrays of numbers, where the first array is a subset of the second array, return an array containing all the next greater elements for each element in the first array, in the second array. If there is no greater element for any element, output -1 for that number.

Ex: Given the following arrays…

nums1 = [4,1,2], nums2 = [1,3,4,2], return [-1, 3, -1]
because no element in nums2 is greater than 4, 3 is the first number in nums2 greater than 1, and no element in nums2 is greater than 2.
nums1 = [2,4], nums2 = [1,2,3,4], return [3, -1]
because 3 is the first greater element that occurs in nums2 after 2 and no element is greater than 4.
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class NextGreaterElements{

	static int[] getNextGreater(int[] nums1, int[] nums2){
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i  = 0; i < nums2.length; i++)
			mp.put(nums2[i], i);

		int sol[] = new int[nums1.length];
		Arrays.fill(sol, -1);
		int j = 0;

		for(int i = 0; i < nums1.length; i++){
			int ind = mp.get(nums1[i]) + 1;
			while(ind < nums2.length){
				if(nums2[ind] > nums1[i]){
					sol[j] = nums2[ind];
					break;
				}
				ind++;
			}
			j++;
		}
		return sol;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sizes of arrays: ");
		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int nums1[] = new int[n];
		int nums2[] = new int[n2];

		System.out.print("Enter 1st array elements: ");
		for(int i = 0; i < n; i++)
			nums1[i] = sc.nextInt();
		System.out.print("Enter 2ndt array elements: ");
		for(int i = 0; i < n2; i++)
			nums2[i] = sc.nextInt();

		int sol[] = getNextGreater(nums1, nums2);

		for (int ele : sol)
			System.out.print(ele + " ");
	}
}
