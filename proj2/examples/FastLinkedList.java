import javafx.scene.text.Text;

public class FastLinkedList{

	public class Node{
		public Node prev;
		public Text text;
		public Node next;

		public Node(Text i, Node p, Node n)
		{
			text = i;
			prev = p;
			next = n;
		}
	}

	private Node sentinel;
	private Node currentNode;
	private int currentPos;

	public FastLinkedList()
	{
		sentinel = new Node(null, null, null);
		currentNode = sentinel;
		currentPos = 0;
	}

	public void addChar(char c)
	{

		Node t = new Node(new Text(0,0, String.valueOf(c)), null, null);
		t.next = currentNode.next;
		t.prev = currentNode;
		if(currentNode.next !=null)
		{
			currentNode.next.prev = t;
		}
		currentNode.next = t;
		currentNode = currentNode.next;
		currentPos++;

	}

	public void deleteText()
	{
		if(currentNode==sentinel)
		{
			return;
		}

		currentNode.next.prev = currentNode.prev;
		currentNode.prev.next = currentNode.next;
		currentNode = currentNode.prev;
		currentPos--;
	}

	public int currentPos()
	{
		return currentPos;
	}

	public Node getFirst()
	{
		return sentinel.next;
	}
}