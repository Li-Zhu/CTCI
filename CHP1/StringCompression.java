import java.util.*;
import java.lang.*;

class StringCompression {

	public static void main (String[] args) {
		String s1= "bbaatttttts";
		System.out.println(compression(s1));
		
		//System.out.println(""+5);
	}

	public static String compression(String s){
		StringBuilder sb = new StringBuilder();
		int freq = 1;
		for (int i = 0; i<s.length()-1;i++){
			if (i ==s.length()-2){
				if (s.charAt(i)==s.charAt(i+1)) {
					sb.append(s.charAt(i));
					sb.append(""+freq+1);
				}
				else{
					sb.append(s.charAt(i));
					sb.append(""+freq);
					sb.append(s.charAt(i+1));
					sb.append(""+1);
					
				}

			}
			else{
				if (s.charAt(i)==s.charAt(i+1)){
					freq++;
				}
				else {
					sb.append(s.charAt(i));
					sb.append(""+freq);
					freq = 1;
				}
			}
		}
		return sb.toString();
		}
	}


/*
	public static List<String> compression(String s){
		char[] cArray = s.toCharArray();


		List<String> myL = new ArrayList<String> (cArray.length);
		for(char c : cArray){
    		myL.add(String.valueOf(c));
		}
		int feq = 1;
		int temp=0;
		System.out.println(myL);
		for (int i=0; i< myL.size()-1; i++ ){
			if (myL.get(i).equals(myL.get(i+1))){
				System.out.println(feq);
				feq++;
				temp = feq;
			}
			else {
				if (feq == 1){

					myL.add(i-feq+2,"1");
					i++;
					temp = 1;

				} 
				else{

					myL.subList(i-feq+2,i+1).clear();
					myL.add(i-feq+2,Integer.toString(feq));
					i=i-feq+2;
					feq=1;
					temp = 1;
				}
				//if()
			}
		}
		myL.subList(myL.size()-1-temp+2,myL.size()-1+1).clear();
		myL.add(myL.size(),Integer.toString(feq));

		return myL;

	}
}	
*/