/*
Given two strings representing sentences, return the words that are not common to both strings (i.e. the words that only appear in one of the sentences). You may assume that each sentence is a sequence of words (without punctuation) correctly separated using space characters.

Ex: given the following strings...

sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]
*/


import java.util.Scanner;
import java.util.HashMap;

class UncommonWords{

	static void getUncommon(String sent1, String sent2){
		HashMap<String, Integer> hm = new HashMap<>();
		
		String ar1[] = sent1.split(" ");
		String ar2[] = sent2.split(" ");	
		
		for(String s : ar1)
			if(hm.containsKey(s))
				hm.put(s, hm.get(s) + 1);
			else
				hm.put(s, 1);
		
		for(String s : ar2)
			if(hm.containsKey(s))
				hm.put(s, hm.get(s) + 1);
			else
				hm.put(s, 1);
			
		for(String s : hm.keySet())
			if(hm.get(s) == 1)
				System.out.print(s+" ");
		
		System.out.println();
		
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st sentence: ");
		String sent1 = sc.nextLine();
		System.out.print("Enter 2nd sentence: ");
		String sent2 = sc.nextLine();
		sc.close();
		
		getUncommon(sent1, sent2);
	}
}
