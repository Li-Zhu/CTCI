//PalindromeArray.java


class PalindromeArray{

	public static void main(String[] args){
		String string= "jjabccbajj";
		System.out.println(string.length());
		//for(String i : arr){
		//	System.out.println(i);
		//}

		System.out.println(longest(string));

	}

	public static Integer longest(String s){
		int length = 0;
		for(int i = 0; i<s.length();i++){
			for(int j = i+1; j< s.length()+1;j++){
				String str = s.substring(i,j);
				int head = 0;
				int tail = str.length()-1;
				while(str.charAt(head)==str.charAt(tail) && head!=str.length()/2){
					head++;
					tail--;
				}
				if(str.charAt(head)==str.charAt(tail) && head==str.length()/2){
					if(str.length()>length){
						length =str.length();
					}
				}
				

			}
		}
		return length;

	}


}