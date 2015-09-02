import java.util.ArrayList;
class FlipBitToWin {

	public static int SEQUENCE_LENGTH = 49;

	public static void main(String[] args) {
			int n = 0; 
		System.out.println (flipToWin(n));
	
	}



	public static int flipToWin(int num){
		ArrayList<Integer> sequences = getSequences(num);
		System.out.println();
		return getLongest(sequences);
	}

	public static ArrayList<Integer> getSequences(int num) {
		ArrayList<Integer> s = new ArrayList<Integer> ();
		int flag = 0;
		int count = 0;

		//if (num == 0) return s;

		for (int i =0; i< SEQUENCE_LENGTH; i++){
			if ((num & 1) != flag){
				s.add(count);
				flag = num & 1;
				count =0;
			}
			count++;
			num >>= 1;
		}
		s.add(count);
		return s;
	}


	public static int getLongest(ArrayList<Integer> seq) {
		int maxSeq = 1;
		System.out.println(seq.size());
		System.out.println();
		
		for (int i = 0; i < seq.size(); i += 2) { // only check positions of 0s in the sequence. so i+=2
			int zerosSeq = seq.get(i);
			int onesSeqRight = i - 1 >= 0 ? seq.get(i - 1) : 0;
			int onesSeqLeft = i + 1 < seq.size() ? seq.get(i + 1) : 0;
			
			int thisSeq = 0;
			if (zerosSeq == 1) { // Can merge
				thisSeq = onesSeqLeft + 1 + onesSeqRight; 
			} if (zerosSeq > 1) { // Just add a zero to either side
				thisSeq = 1 + Math.max(onesSeqRight, onesSeqLeft);
			} else if (zerosSeq == 0) { // No zero, but take either side
				thisSeq = Math.max(onesSeqRight, onesSeqLeft);
			}
			maxSeq = Math.max(thisSeq, maxSeq);
		}
		
		return maxSeq;
	}
}