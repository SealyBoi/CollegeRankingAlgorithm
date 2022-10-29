package Main;

public class Main {
	
	public static final LinkedList llist = PreSortedStack.llist;
	public static final Evaluate eval = PreSortedStack.eval;

	public static void main(String[] args) {
		
		String[] LSU = {"Louisiana State University", "2.7", "21:1100", "10000", "35000", "LA", "67", "true", "Comp Sci, Biology, Finance", "87", "95", ""};
		String[] NSU = {"Northern State University", "1.6", "18:900", "6000", "2000", "LA", "78", "true", "Bioengineering, Mechanical Engineering, Mass Communications", "90", "98", ""};
		String[] ULM = {"University of Louisiana in Monroe", "2.9", "19:1090", "10000", "4000", "AL", "65", "false", "Comp Sci, Business, Marketing", "78", "89", ""};
		String[] user = {"Aiden K Mathews", "8.0", "39:2080", "111000", "90000", "LA", "50", "true", "Comp Sci", "80", "90"};
		String[] prefs = {"GPA", "Tuition", "Population", "PublicPrivate", "Majors"};
		
		eval.setUser(user, prefs);
		
		PreSortedStack stack = new PreSortedStack();
		stack.addElement(LSU);
		stack.addElement(NSU);
		stack.addElement(ULM);
		stack.sendToList();
		
		while (!llist.isNull()) {
			System.out.println("Name: " + llist.Name());
			System.out.println("Majors: " + llist.Majors());
			System.out.println("Match Percent: " + llist.Score() + "%");
			llist.pop();
		}
	}
	
}
