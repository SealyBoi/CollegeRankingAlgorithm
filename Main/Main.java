package Main;

public class Main {
	static Evaluate eval = new Evaluate();
	static CardStack stack = new CardStack();
	
	public static void main(String[] args) {
		String[] LSU = {"Louisiana State University", "2.7", "21:1100", "10000", "35000", "LA", "67", "true", "Comp Sci, Biology, Finance", "87", "95", ""};
		String[] NSU = {"Northern State University", "1.6", "18:900", "6000", "2000", "LA", "78", "true", "Bioengineering, Mechanical Engineering, Mass Communications", "90", "98", ""};
		String[] ULM = {"University of Louisiana in Monroe", "2.9", "19:1090", "10000", "4000", "AL", "65", "false", "Comp Sci, Business, Marketing", "78", "89", ""};
		String[] user = {"Aiden K Mathews", "8.0", "39:2080", "111000", "90000", "LA", "50", "true", "Comp Sci", "80", "90"};
		String[] prefs = {"GPA", "Tuition", "Population", "PublicPrivate", "Majors"};
		
		stack.push(LSU);
		stack.push(NSU);
		stack.push(ULM);
		
		eval.setUser(user, prefs);
		LSU[11] = "" + eval.evaluate(LSU);
		NSU[11] = "" + eval.evaluate(NSU);
		ULM[11] = "" + eval.evaluate(ULM);
		stack.sort(0, stack.getSize() - 1);
		
		while (!stack.isNull()) {
			stack.pop();
			System.out.println(stack.getName());
			System.out.println("Top Majors: " + stack.getMajors());
			System.out.printf("Match %%: %.2f\n", Double.parseDouble(stack.getScore()));
			System.out.println("");
		}
	}
	
}
