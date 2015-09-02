class BitBasic {


	public static void main(String args[]) {
     int a = 60;	/* 60 = 0011 1100 */  
     int b = 13;	/* 13 = 0000 1101 */
     int c = 0;


     // & (bitwise and): return 1 only both are 1
     // Binary AND Operator copies a bit to the result if it exists in both operands.
     c = a & b;       /* 12 = 0000 1100 */ 
     System.out.println("a & b = " + c );



     // | (bitwise or):  return 0 only both are 0
     // Binary OR Operator copies a bit if it exists in either operand.
     c = a | b;       /* 61 = 0011 1101 */
     System.out.println("a | b = " + c );



     // ^ (bitwise XOR)   same--> 0; diff-->1
     // Binary XOR Operator copies the bit if it is set in one operand but not both.
     c = a ^ b;       /* 49 = 0011 0001 */
     System.out.println("a ^ b = " + c );



     // ~ (bitwise compliment) 0-->1; 1-->0
     // Binary Ones Complement Operator is unary and has the effect of 'flipping' bits
     c = ~a;          /*-61 = 1100 0011 */
     System.out.println("~a = " + c );



     // << (left shift) 
     // Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand
     c = a << 2;     /* 240 = 1111 0000 */
     System.out.println("a << 2 = " + c );



     // << (right shift) 
     // Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
     c = a >> 2;     /* 215 = 1111 */
     System.out.println("a >> 2  = " + c );


     // >>> (zero fill right shift)
     // Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand 
     // and shifted values are filled up with zeros.
     c = a >>> 2;     /* 215 = 0000 1111 */
     System.out.println("a >>> 2 = " + c );
  }
} 