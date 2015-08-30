class StringRotation {
	public static void main(String[] args){
		String str1 = "zhuli";
		String str2 = "lizhu";
		System.out.println(isRotation(str1,str2));

	}

	static boolean isRotation(String s1, String s2){
		if(s1.length()==s2.length() && s1.length() > 0){
			String s=s2.concat(s2); // String s2s2= s2+s2
			return  isSubString(s1,s);
		}
		return false;


	}

	static boolean isSubString (String string1, String target){
		System.out.println(target.indexOf(string1));
		if (target.indexOf(string1) != -1){
			return true;
		}
		else {return false;}

	}
}