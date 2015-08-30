//1-1


import java.util.*;

public class IsUnique {

	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Type a Sting:");
		String input = sc.nextLine();

		/*


		//		Not change Char Array to String
		char[] c = input.toCharArray(); 
		Arrays.sort(c);
		for (int i = 0; i<c.length-1; i++ ){
			if (c[i]==c[i+1]){
				System.out.println("Not unique");
				return;
			}

		}
		System.out.println("unique!");
		*/







/*
		//		Change Char Array to String
		String sorted = new String(c);
		for (int i = 0; i< sorted.length()-1; i++){
			if(sorted.charAt(i)==sorted.charAt(i+1)){
				System.out.println("Not unique!");
				return;
			}
		}
		System.out.println("unique!");
	}

*/


/*  
	
	//		HashMap Method
	public static void main(String args[]) {
		Scanner sc = new Scanner ( System.in);
		System.out.print ("Type a string:");
		String input = sc.nextLine();

		HashMap<Character, Integer> table = new HashMap<Character, Integer>();

		int i;
		int j = 0;
		for (i=0; i<input.length(); i++){
			char c=input.charAt(i);
			if(!table.containsKey(c)){
				table.put(c, j++);
			}
			else {
				System.out.println("Not unique!");
				return;

			}
		}
		System.out.println("unique!");

	}
	*/

	boolean isUniqueChars(String str){
		int cheker = 0;
		
	}

}