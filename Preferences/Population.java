package Preferences;

public class Population extends Preferences{
	private static int max = 0;
	private static boolean isPref = false;
	
	public static int getMax() {
		return max;
	}
	
	public void set(String val) {
		Population.max = Integer.parseInt(val);
	}
	
	public void setPref(boolean isPref) {
		Population.isPref = isPref;
	}
	
	public int eval(String str) {
		int uni = Integer.parseInt(str);
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
