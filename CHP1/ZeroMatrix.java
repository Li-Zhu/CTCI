import java.util.*;
class ZeroMatrix {

	public static void main (String[] args){
		int test[][] = {
			{1,2,3,4,5,6,7,8},
			{9,10,11,12,13,14,15,16},
			{17,18,19,20,21,22,23,24},
			{25,26,22,28,29,30,31,32},
			{33,34,35,36,37,0,39,40},
			{41,42,43,44,45,46,47,48},
			{49,50,51,52,53,54,55,56},
			{49,50,51,52,53,54,55,56}

		};
//test.length = length of the column，
//test[0].length = length of the row.
//System.out.println(test[2].length);
		int rlen= test.length;
    	int clen= test[0].length;
		int out[][] = doZero(test);
        for(int mm=0; mm<clen; mm++) {
      		for(int nn=0; nn<rlen; nn++)
        		System.out.print(out[mm][nn] + " ");
        		System.out.println("");
        }
    }


// ArrayList stores the position of 0s. 
//Also can use boolean[] row = new boolean[m.length];
//			 boolean[] column = new boolean[m[0].length];
/*
    static int[][] doZero(int[][] m){
    	int rlen= m.length;
    	int clen= m[0].length;
    	ArrayList<Integer> columns = new ArrayList<Integer>();
    	ArrayList<Integer> rows = new ArrayList<Integer>();
    	for (int i = 0; i < clen ; i++){
    		for (int j = 0; j < rlen ; j++){
    			if (m[i][j] == 0){
    				columns.add(j);
    				rows.add(i);
    			}
    		}
    	}

    	for (int x =0; x < rows.size(); x++){
    		nullifyRow(m,rows.get(x));
    		nullifyColumn(m,columns.get(x));
    	} 
			return m;
		}

		// runtime complexity O(N^2)

*/

	static int[][] doZero(int[][] m){
		boolean rHasZero = false;
		boolean cHasZero = false;
		

		//Chekc the first row has a zero.
		for (int i = 0; i < m[0].length; i++){
			if (m[0][i] == 0){
				rHasZero = true;
				break;

			}
		}


		//Chekc the first column has a zero.
		for (int j = 0; j < m.length; j++){
			if (m[j][0] == 0){
				cHasZero = true;
				break;

			}
		}


		//Check the rest of the martrix.
		for (int i = 0; i< m.length; i++){
			for (int j = 0; j<m[0].length; j++){
				if(m[i][j] == 0){
					m[0][j] = 0;
					m[i][0] = 0;
				}
			}
		}


		//Check the 0s' in first rows, and nullify the columns.
		for(int i = 0; i < m[0].length; i++ ){
			if (m[0][i] == 0){
				nullifyColumn(m, i);
			}
		}



		//Check the 0s' in first column, and nullify the rows.
		for(int j = 0; j < m.length; j++ ){
			if (m[j][0] == 0){
				nullifyRow(m, j);
			}
		}


		//nullify the rows if rHasZero is true.
		for(int i = 0; i < m[0].length; i++ ){
			if (rHasZero) {
				nullifyRow(m,0);
			}
		}


		//nullify the rows if cHasZero is true.
		for(int i = 0; i < m[0].length; i++ ){
			if (rHasZero) {
				nullifyColumn(m,0);
			}

		}
		return m;
	}


	static void nullifyRow(int[][] matrix, int row){
		for (int i = 0; i < matrix[0].length; i++ ){
			matrix[row][i] = 0;
		}
	}
	static void nullifyColumn(int[][] matrix, int column){
		for (int j = 0; j < matrix.length; j++ ){
			matrix[j][column] = 0;
		}
	}

	
}
