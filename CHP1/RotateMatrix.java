class RotateMatrix {

	public static void main (String[] args) {
		int test[][] = {
			{1,2,3,4,5,6,7,8},
			{9,10,11,12,13,14,15,16},
			{17,18,19,20,21,22,23,24},
			{25,26,27,28,29,30,31,32},
			{33,34,35,36,37,38,39,40},
			{41,42,43,44,45,46,47,48},
			{49,50,51,52,53,54,55,56},
			{57,58,59,60,61,62,63,64}

		};
//test.length = length of the column，
//test[0].length = length of the row.
//System.out.println(test[2].length);
		int len= test[0].length;
		int out[][] = rotate(test);
        for(int mm=0; mm<len; mm++) {
      		for(int nn=0; nn<len; nn++)
        		System.out.print(out[mm][nn] + " ");
        		System.out.println("");
        }
    }

    public static int[][] rotate(int[][] m){ //spacetime=O(N^2),runtime=O(N^2)
    	int temp =0;
    	int len= m[0].length;
    	int[][] n = new int[len][len];
    	for (int i =0; i<len; i++){
    		for (int j =0; j<len; j++){
    			n[i][j]= m[len-j-1][i];

    		}
    	}

    	
    	return n;


   }



     }


	
