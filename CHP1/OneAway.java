import java.util.*;
class OneAway {
	public static void main (String[] args){
		String a = "bble";
		String b = "baale";
		System.out.println(isOneAway(a,b));
	}
	public static boolean isOneAway(String s1, String s2){
		int i=0;
		if (s1.equals(s2)){
			return true;
		}
		if (( (s1.length() - s2.length()) * (s1.length() - s2.length()) <=1 )){
			for(i=0 ; i<Math.min(s1.length(),s2.length()); i++ ){


				if (s1.charAt(i) != s2.charAt(i)){
					if (s1.substring(i).equals(s2.substring(i+1)) || s1.substring(i+1).equals(s2.substring(i)) || s1.substring(i+1).equals(s2.substring(i+1)))  {
						return true;

					}
					else{
						return false;
					}
				
				} 

			}	
			return true;

		}
		else {
			return false;
		}


	}
}