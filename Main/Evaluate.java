package Main;

import Preferences.*;

public class Evaluate {
	private double score = 0;
	private Preferences pref;
	static enum list {GPA, ACTSAT, TUITION, POPULATION, LOCATION, ACCEPTANCERATE, PUBLICPRIVATE, MAJORS, GRADUATIONRATE, SCHOLARSHIPS};
	static list factors = list.GPA;
	
	public double evaluate(String[] uni) {
		int i = 0;
		for (list j : list.values()) {
			factors = j;
			parse();
			score = score + pref.eval(uni[i + 1]);
			i++;
		}
		double percent = (score/40) * 100;
		score = 0;
		return percent;
	}
	
	public void setUser(String[] user, String[] prefs) {
		int i = 0;
		for(list j : list.values()) {
			factors = j;
			parse();
			pref.set(user[i + 1]);
			i++;
		}
		for(int k = 0; k < prefs.length; k++) {
			determinePref(prefs[k]);
			parse();
			pref.setPref(true);
		}
	}
	
	public void determinePref(String str) {
		factors = list.valueOf(str.toUpperCase());
	}
	
	public void parse() {
		switch (factors) {
		case GPA:
			pref = new GPA();
			break;
		case ACTSAT:
			pref = new ACTSAT();
			break;
		case TUITION:
			pref = new Tuition();
			break;
		case POPULATION:
			pref = new Population();
			break;
		case LOCATION:
			pref = new Location();
			break;
		case ACCEPTANCERATE:
			pref = new AcceptanceRate();
			break;
		case PUBLICPRIVATE:
			pref = new PublicPrivate();
			break;
		case MAJORS:
			pref = new Majors();
			break;
		case GRADUATIONRATE:
			pref = new GraduationRate();
			break;
		case SCHOLARSHIPS:
			pref = new Scholarships();
			break;
		}
	}
}
