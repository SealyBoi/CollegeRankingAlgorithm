package Main;

/**
 * @author Aiden Mathews
 * @since October 29, 2022
 * 
 * The main method will set up dummy variables of colleges to be sorted
 * **Note that these colleges will be pulled from a database in it's actual implementation**
 * Main will set the user's preferences, and send each college to the dynamic array in PreSortedStack.
 * Afterwards, it will sort them and send them to the LinkedList; where they will be accessed one by one from
 * the head Node to present their data.
 */
public class Main {
	
	public static final LinkedList llist = PreSortedStack.llist;
	public static final Evaluate eval = PreSortedStack.eval;

	public static void main(String[] args) {
		
		//Initial colleges/user
		String[] LSU = {"Louisiana State University", "2.7", "21:1100", "10000", "35000", "LA", "67", "true", "Comp Sci, Biology, Finance", "87", "95", ""};
		String[] NSU = {"Northern State University", "1.6", "18:900", "6000", "2000", "LA", "78", "true", "Bioengineering, Mechanical Engineering, Mass Communications", "90", "98", ""};
		String[] ULM = {"University of Louisiana in Monroe", "2.9", "19:1090", "10000", "4000", "AL", "65", "false", "Comp Sci, Business, Marketing", "78", "89", ""};
		String[] user = {"Aiden K Mathews", "8.0", "39:2080", "111000", "90000", "LA", "50", "true", "Comp Sci", "80", "90"};
		String[] prefs = {"GPA", "Tuition", "Population", "PublicPrivate", "Majors"};
		
		eval.setUser(user, prefs);
		
		//Fill the stack and sort it
		PreSortedStack stack = new PreSortedStack();
		stack.addElement(LSU);
		stack.addElement(NSU);
		stack.addElement(ULM);
		stack.sendToList();
		
		//Print every variable within the LinkedList
		while (!llist.isNull()) {
			System.out.println("Name: " + llist.Name());
			System.out.println("Majors: " + llist.Majors());
			System.out.println("Match Percent: " + llist.Score() + "%");
			llist.pop();
		}
	}
	
}
