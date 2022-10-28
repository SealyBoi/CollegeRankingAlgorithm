package Preferences;

public class ACTSAT extends Preferences{
	private static int ACT = 0;
	private static int SAT = 0;
	private static boolean isPref = false;
	
	public static int getACT() {
		return ACT;
	}
	
	public static int getSAT() {
		return SAT;
	}
	
	public void set(String var) {
		String[] split = var.split(":");
		ACTSAT.ACT = Integer.parseInt(split[0]);
		ACTSAT.SAT = Integer.parseInt(split[1]);
	}
	
	public void setPref(boolean isPref) {
		ACTSAT.isPref = isPref;
	}
	
	public int eval(String str) {
		String[] uni = str.split(":");
		int uniA = Integer.parseInt(uni[0]);
		int uniS = Integer.parseInt(uni[1]);
		if (uniA <= ACT || uniS <= SAT) {
			if (isPref) {
				return 6;
			}
			return 2;
		} else {
			return 0;
		}
	}
}
