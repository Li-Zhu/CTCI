import java.lang.StringBuilder;

class BinaryToString {

	public static void main(String[] args) {

		 System.out.println("Binary eqivalent of 100 = " + Integer.toString(1000, 2));
         System.out.println("Octal eqivalent of 100 = " + Integer.toString(1000, 8));
         System.out.println("Decimal eqivalent of 100 = " + Integer.toString(1000, 10));
         System.out.println("Hexadecimal eqivalent of 100 = " + Integer.toString(1000, 16));
		
		for (int i = 0; i < 100; i++) {
			double num = i / 100.0;
			String binary = printBinary(num);
			if (!binary.equals("ERROR") ) {
				System.out.println(num + " : " + binary );
			}
		}
	}

	public static String printBinary(double num) {
		if (num >= 1 || num <= 0) {
			return "ERROR";
		}
	
		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while (num > 0) {
			/* Setting a limit on length: 32 characters */
			if (binary.length() > 32) {
				return "ERROR";
			}
			double r = num * 2;
			if (r >= 1) {
				binary.append(1);
				num = r - 1;
			} else {
				binary.append(0);
				num = r;
			}
		}
		return binary.toString();
	}

}