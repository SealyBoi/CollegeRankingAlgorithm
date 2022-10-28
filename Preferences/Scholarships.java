package Preferences;

public class Scholarships extends Preferences{
	private static double min = 0;
	private static boolean isPref = false;
	
	public static double getMin() {
		return min;
	}
	
	public void set(String val) {
		Scholarships.min = Double.parseDouble(val);
	}
	
	public void setPref(boolean isPref) {
		Scholarships.isPref = isPref;
	}
	
	public int eval(String str) {
		double uni = Double.parseDouble(str);
		if (uni >= min) {
			if (isPref) {
				return 6;
			}
			return 2;
		} else {
			return 0;
		}
	}
}
