package Preferences;

public class Location extends Preferences{
	private static String loc = "";
	private static boolean isPref = false;
	
	public static String getLoc() {
		return loc;
	}
	
	public void set(String var) {
		Location.loc = var;
	}
	
	public void setPref(boolean isPref) {
		Location.isPref = isPref;
	}
	
	public int eval(String uni) {
		if (uni.equals(loc) || loc.equals("Any")) {
			if (isPref) {
				return 6;
			}
			return 2;
		} else {
			return 0;
		}
	}
}
