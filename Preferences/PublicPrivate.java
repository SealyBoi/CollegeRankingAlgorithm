package Preferences;

public class PublicPrivate extends Preferences{
	private static boolean pub = false;
	private static boolean any = false;
	private static boolean isPref = false;
	
	public void set(String val) {
		PublicPrivate.pub = Boolean.parseBoolean(val);
	}
	
	public static void setAny(boolean any) {
		PublicPrivate.any = any;
	}
	
	public void setPref(boolean isPref) {
		PublicPrivate.isPref = isPref;
	}
	
	public int eval(String str) {
		boolean uni = Boolean.parseBoolean(str);
		if (uni == pub || any) {
			if (isPref) {
				return 6;
			}
			return 2;
		} else {
			return 0;
		}
	}
}
