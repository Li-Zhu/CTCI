class Debugger{

	public static void main (String[] args) {
		int powOfTwo1 = 16;
		int powOfTwo2 = 32;
		int notPowOfTwo1 = 199;
		int notPowOfTwo2 = 34;

		System.out.println (formula(powOfTwo1));
		System.out.println (formula(powOfTwo2));
		System.out.println (formula(notPowOfTwo1));
		System.out.println (formula(notPowOfTwo2));



	}


	public static boolean formula (int n) {

		return ( n & ( n - 1 ))==0;
		// abcd1000 & abcd0111  equal zero only if n is power of two.
		
	}

}