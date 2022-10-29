package Main;

public class LinkedList {
	Node head;
	
	//Creates new Nodes
	static class Node {
		String[] data;
		Node next;
		Node (String[] d) {
			data = d;
			next = null;
		}
	}
	
	//Adds node to front of list
	public void push(String[] new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	//Deletes node whose data is equivalent to key from list
	public void deleteNode(String[] key) {
		Node temp = head;
		
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		if (temp == null) {
			return;
		}
	}
	
	public void pop() {
		deleteNode(head.data);
	}
	
	public boolean isNull() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public String Name() {
		return head.data[0];
	}
	
	public String GPA() {
		return head.data[1];
	}
	
	public String AS() {
		return head.data[2];
	}
	
	public String Tuition() {
		return head.data[3];
	}
	
	public String Pop() {
		return head.data[4];
	}
	
	public String Loc() {
		return head.data[5];
	}
	
	public String AR() {
		return head.data[6];
	}
	
	public String Pub() {
		return head.data[7];
	}
	
	public String Majors() {
		return head.data[8];
	}
	
	public String GR() {
		return head.data[9];
	}
	
	public String Schol() {
		return head.data[10];
	}
	
	public String Score() {
		return head.data[11];
	}
	
}
