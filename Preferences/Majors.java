package Preferences;

public class Majors extends Preferences{
	private static String major = "";
	private static boolean isPref = false;
	
	public static String getMajor() {
		return major;
	}
	
	public void set(String var) {
		Majors.major = var;
	}
	
	public void setPref(boolean isPref) {
		Majors.isPref = isPref;
	}
	
	public int eval(String str) {
		String[] uni = str.split(", ");
		for (int i = 0; i < uni.length; i++) {
			if (uni[i].equals(major)) {
				if (isPref) {
					return 6;
				}
				return 2;
			}
		}
		return 0;
	}
}
