package Main;

import java.util.ArrayList;

public class Sort {
	
	private static ArrayList<Double> scores = new ArrayList<Double>();
	private static double curr = 0;
	
	public void push(double x) {
		scores.add(x);
	}
	
	public double pop() {
		curr = scores.get(0);
		scores.remove(0);
		return curr;
	}
	
	public int getSize() {
		return scores.size();
	}
	
	public double getScore() {
		return curr;
	}
	
	public static void swap(int i, int j) {
		double tmp = scores.get(i);
		scores.set(i, scores.get(j));
		scores.set(j, tmp);
	}
	
	public void sort(int left, int right) {
		if (left < right) {
			int piv = partition(left, right);
			sort(left, piv - 1);
			sort(piv + 1, right);
		}
	}
	
	public static int partition(int left, int right) {
		double piv = scores.get(right);
		int i = left - 1;
		
		for (int j = left; j < right; j++) {
			if (scores.get(j) >= piv) {
				i++;
				swap(i, j);
				CardStack.swap(i, j);
			}
		}
		
		swap(i + 1, right);
		CardStack.swap(i + 1, right);
		
		return (i + 1);
	}
	
}
