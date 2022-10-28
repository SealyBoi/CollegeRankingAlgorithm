package Preferences;

public class GPA extends Preferences{
	private static double max = 0;
	private static boolean isPref = false;
	
	public static double getMax() {
		return max;
	}
	
	public void set(String var) {
		GPA.max = Double.parseDouble(var);
	}
	
	public void setPref(boolean isPref) {
		GPA.isPref = isPref;
	}
	
	public int eval(String str) {
		double uni = Double.parseDouble(str);
		if (uni <= max) {
			if (isPref) {
				return 6;
			}
			return 2;
		} else {
			return 0;
		}
	}
}
