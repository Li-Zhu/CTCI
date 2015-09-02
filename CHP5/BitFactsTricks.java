class BitFactsTricks {
	public static void main(String[] args) {
		int a = 60;	/* 60 = 0011 1100 */  
     	int b = 13;	/* 13 = 0000 1101 */
     	int c = 0;
	

		System.out.println("if multiplying   1     2     4     8     16     32     64");
		System.out.println("we left shift << 0     1     2     3     4      5      6 ");
		System.out.println();



     	System.out.println("a = 60 = 0011 1100 \n b = 13 = 0001101 ");
     	System.out.println();


     	c = a ^ 0;
     	System.out.println("a & 0s = a (" + c + ")");
     	System.out.println();


     	c = a ^ -0;
     	System.out.println("a & 1s = ~a (" + c + ")");
     	System.out.println();


     	c = a ^ ~a;
     	System.out.println("a ^ ~a = -1 (" + c + ")");
     	System.out.println();

     	c = a ^ a;
     	System.out.println("a ^ a = 0 (" + c + ")");
     	System.out.println();

     	c = a & 0;
     	System.out.println("a & 0s = 0 (" + c + ")");
     	System.out.println();

     	c = a & -0;
     	System.out.println("a & 1s = a (" + c + ")");
     	System.out.println();

     	c = a & a;
     	System.out.println("a & a = a (" + c + ")");
     	System.out.println();

     	c = a | 0;
     	System.out.println("a | 0s = a (" + c + ")");
     	System.out.println();

     	c = a | -0;
     	System.out.println("a | 1s = 1s (" + c + ")");
     	System.out.println();

     	c = a | a;
     	System.out.println("a | a = a (" + c + ")");
     	System.out.println();


     	c = ~(1 << 2);
     	c = 5 & c;
     	System.out.println(c);





	}
}