package Main;

public class PreSortedStack {
	private static String[][] colleges;
	private int count;
	private int sizeOfArray;
	static Evaluate eval = new Evaluate();
	static LinkedList llist = new LinkedList();
	
	public PreSortedStack() {
		colleges = new String[1][];
		count = 0;
		sizeOfArray = 1;
	}
	
	//Adds element to dynamic array
	public void addElement(String[] a) {
		if (count == sizeOfArray) {
			growSize();
		}
		colleges[count] = a;
		count++;
	}
	
	//Doubles the size of the array
	public void growSize() {
		String[][] tmp = new String[sizeOfArray * 2][];
		for (int i = 0; i < sizeOfArray; i++) {
			tmp[i] = colleges[i];
		}
		colleges = tmp;
		sizeOfArray = sizeOfArray * 2;
	}
	
	public int Size() {
		return sizeOfArray;
	}
	
	//Evaluates all of the colleges in the array, then sorts them based on score. Afterwards, it sends them to the LinkedList
	public void sendToList() {
		for (int i = 0; i < sizeOfArray - 1; i++) {
			colleges[i][11] = "" + eval.evaluate(colleges[i]);
		}
		sort(0, count - 1);
		for (int i = count - 1; i >= 0; i--) {
			llist.push(colleges[i]);
		}
	}
	
	//Quick Sort
	public void sort(int left, int right) {
		if (left < right) {
			int piv = partition(left, right);
			sort(left, piv - 1);
			sort(piv + 1, right);
		}
	}
	
	public static int partition(int left, int right) {
		double piv = Double.parseDouble(colleges[right][11]);
		int i = left - 1;
		
		for (int j = left; j < right; j++) {
			if (Double.parseDouble(colleges[j][11]) >= piv) {
				i++;
				swap(i, j);
			}
		}
		
		swap(i + 1, right);
		
		return (i + 1);
	}
	
	public static void swap(int i, int j) {
		String[] tmp = colleges[i];
		colleges[i] = colleges[j];
		colleges[j] = tmp;
	}
}
