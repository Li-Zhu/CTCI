//Check Permutation: Given two strings, writer a method to decide if one is a permutation of the otehr. 

import java.util.*;
class CheckPermutation {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1: ");
		String string1 = sc.nextLine();
		System.out.print("String 2: ");
		String string2 = sc.nextLine();
		if (!isPermutation(string1,string2)){
			System.out.println("No!");
		}
		else{
			System.out.println("Yes!");
		}

	}
	static String sort(String str){
		char[] chars= str.toCharArray();
		java.util.Arrays.sort(chars);
		return new String(chars);

	}
	static boolean isPermutation(String s1, String s2){
		if (s1.length() != s2.length()){
			return false;
		}
		return sort(s1).equals(sort(s2));

	}  

}