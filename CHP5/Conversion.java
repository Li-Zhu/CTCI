class Conversion{
	public static void main(String[] args) {
		int a = 29;
		int b = 15;

		int num = numOfSwap(a,b);
		System.out.println(num);
	}

	public static int numOfSwap(int a, int b){
		int c = a ^ b;
		int count = 0;
		while (c != 0){
			count++;
			c = c & (c-1);
		}
		return count;
	}
}