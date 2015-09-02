class Insertion{


	public static void main(String[] args) {
		int n = 1024;
		int m = 19;

		int i = 2;
		int j = 6;

		int result = insertion(n,m,i,j);

		System.out.println(result);

	}

	public static int insertion(int n, int m, int i, int j){
		n = clear(n, i, j);
		m = m << i;
		return n|m;
	}


	private static int clear (int n, int i, int j){
		int ones= ~0;
		int left = ones << (j+1);
		int right = ((1<<i) -1);
		int mask = left | right;
		return n & mask;
	}

}