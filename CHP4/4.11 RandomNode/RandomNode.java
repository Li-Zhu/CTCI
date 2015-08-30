class RandomNode {

	public static void main(String[] args) {

		int[] counts = new int[10];
		for (int i = 0; i < 100000; i++) {
			BTree tree = new BTree();
			int[] array = {1, 0, 6, 2, 3, 9, 4, 5, 8, 7};
			for (int x : array) {
				tree.insertInOrder(x);
			}
			int d = tree.getRandomNode().data;
			counts[d]++;
		}
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println(i + ": " + counts[i]);
		}
	}
}