package disjointSet;

public class Node {
	Node parent;
	int value;
	String id;


	public Node(String id, int value) {
		this.id = id;
		this.value = value;
	}
	
	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
