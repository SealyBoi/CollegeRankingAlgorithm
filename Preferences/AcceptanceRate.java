package Preferences;

public class AcceptanceRate extends Preferences{
	private static double min = 0;
	private static boolean isPref = false;
	
	public static double getMin() {
		return min;
	}
	
	public void set(String var) {
		AcceptanceRate.min = Double.parseDouble(var);
	}
	
	public void setPref(boolean isPref) {
		AcceptanceRate.isPref = isPref;
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
