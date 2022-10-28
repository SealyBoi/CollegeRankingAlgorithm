package Main;

import java.util.ArrayList;

public class CardStack {
	
	private static ArrayList<String[]> colleges = new ArrayList<String[]>();
	private static String[] curr = new String[12];
	
	public void push(String[] uni) {
		colleges.add(uni);
	}
	
	public String[] pop() {
		curr = colleges.get(0);
		colleges.remove(0);
		return curr;
	}
	
	public static void swap(int i, int j) {
		String[] tmp = colleges.get(i);
		colleges.set(i, colleges.get(j));
		colleges.set(j, tmp);
	}
	
	public void sort(int left, int right) {
		if (left < right) {
			int piv = partition(left, right);
			sort(left, piv - 1);
			sort(piv + 1, right);
		}
	}
	
	public static int partition(int left, int right) {
		double piv = Double.parseDouble(colleges.get(right)[11]);
		int i = left - 1;
		
		for (int j = left; j < right; j++) {
			if (Double.parseDouble(colleges.get(j)[11]) >= piv) {
				i++;
				swap(i, j);
			}
		}
		
		swap(i + 1, right);
		
		return (i + 1);
	}
	
	public boolean isNull() {
		if (colleges.size() != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int getSize() {
		return colleges.size();
	}
	
	public String getName() {
		return curr[0];
	}
	
	public String getGPA() {
		return curr[1];
	}
	
	public String getAS() {
		return curr[2];
	}
	
	public String getTuition() {
		return curr[3];
	}
	
	public String getPop() {
		return curr[4];
	}
	
	public String getLoc() {
		return curr[5];
	}
	
	public String getAR() {
		return curr[6];
	}
	
	public String getPub() {
		return curr[7];
	}
	
	public String getMajors() {
		return curr[8];
	}
	
	public String getGR() {
		return curr[9];
	}
	
	public String getSchol() {
		return curr[10];
	}
	
	public String getScore() {
		return curr[11];
	}
}
