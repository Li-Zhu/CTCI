import java.util.*;
import java.lang.*;

class PalindromePermutation {
	public static void main (String [] args){
		String s = "jjaw"; 
		System.out.println(check(s));
		//System.out.println(Character.getNumericValue('a'));
		//System.out.println(Character.getNumericValue('z')-Character.getNumericValue('a'));

	}
	/*
	static int getCharNumber(Character c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);

		if (a<=val && val <= z){
			return val -a;
		}
		return -1;
	}
	static boolean check (String str){
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')];
		for (char c : str.toCharArray()) {
			int x = getCharNumber(c);
			if (x!=-1){
				table[x]++;
				if (table[x] % 2 ==1) {
					countOdd++;
				}
				else{
					countOdd--;
				}

			}
		}
		return countOdd <=1;
	}
	*/

	static boolean check (String c) {
		int countOdd = 0;
		c.replaceAll("[^a-zA-Z]+", "");
		c.toLowerCase();
		char[] chars = c.toCharArray();
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		for (int i=0; i<chars.length;i++){
			if (!table.containsKey(chars[i])){
				table.put(chars[i],1);

			}else {
				table.put(chars[i],table.get(chars[i])+1);

			}
		}
			Collection co = table.values();
			Iterator itr = co.iterator();
			while(itr.hasNext()){
				if ((Integer)itr.next()%2 ==1){
					countOdd++;
				}
			}
	return countOdd<=1; 

			}
		
	}
	
