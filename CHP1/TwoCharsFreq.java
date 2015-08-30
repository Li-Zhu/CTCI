import java.util.HashMap;

class TwoCharsFreq {
	public static void main(String[] args){
		String str = "aabbbcbceeeccc";

		System.out.println(count(str,2));
	}


	public static int count(String s, int m) {
		 HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

		 int left = 0;
		 int right = 0;
		 int max = -1;
		 hm.put(s.charAt(right),1);

		 while(right < s.length()-1){
			 while(hm.size()<m+1 && right < s.length()-1){
			 	System.out.println("---");
			 	right++;
				if(!hm.containsKey(s.charAt(right))) {
						hm.put(s.charAt(right),1);
					}
				else {
						hm.put(s.charAt(right),hm.get(s.charAt(right))+1);
					}
			 }

			 max = (right - left) > max ? right - left : max;

			 while(hm.size()==m+1){
			 	System.out.println("====");

			 	hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
			 	if(hm.get(s.charAt(left)) == 0)
			 		hm.remove(s.charAt(left));
			 	left++;
			 }

		}

	 	max = (right - left +1) > max ? right - left +1 : max;

		return max;
}

/*

		int temp = 0;
		int max =0;
		int firstIndex = 0;
		for(int i = 0; i < s.length(); i++){
			System.out.println("---");
				if(hm.size() == 3){
					System.out.println("-");
				//remove the first one, and get the max
					for(int j = firstIndex; j< i+1; j++ ){
						if(s.charAt(j) == s.charAt(firstIndex)){
							System.out.println("--");
							hm.put(s.charAt(firstIndex),hm.get(s.charAt(firstIndex))-1);
						}
						if(hm.get(s.charAt(firstIndex))==0){
							hm.remove(s.charAt(firstIndex));
							max = i-firstIndex;
							firstIndex = j+1;
							break;
						}
					}
				}
				
			// put char into the hashmap
				if(!hm.containsKey(s.charAt(i))) {
					hm.put(s.charAt(i),1);
				}
				else {
					hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
				}
		}

		if(hm.size() == 2){
			max = s.length()-firstIndex;


		return max;
	}
	*/
}

