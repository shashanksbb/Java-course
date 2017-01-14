public class LinkedList<Item> implements List61B<Item>{

	public class Node{
		public Item item;
		public Node next;
		public Node(Item i, Node n)
		{
			item =i;
			next =n;
		}

	}

	private Node sentinel;
	private int size;

	public LinkedList(Item x)
	{
		sentinel = new Node(null, null);
		sentinel.next = new Node(x,null);
		size = 1;
	}

	public LinkedList()
	{
		sentinel = new Node(null, null);
		size = 0;
	}

	@Override
	public void insertFront(Item x)
	{
		sentinel.next = new Node(x, sentinel.next);
		size +=1;
	}

	@Override
	public Item getFront()
	{
		return sentinel.next.item;
	}

	@Override
	public void insertBack(Item x)
	{
		Node P = sentinel;
		while(P.next != null)
		{
			P = P.next;
		} 

		P.next = new Node(x, null);
		size +=1;
	}

	private Node getBackNode()
	{
		Node P = sentinel;

		while(P.next !=null)
		{
			P = P.next;
		}
		return P;
	}

	@Override
	public void insert(Item item, int position)
	{
		if(sentinel.next == null || position == 0)
		{
			insertFront(item);
			return;
		}
		Node currentNode = sentinel.next.next;
		while(position>1 && currentNode.next !=null)
		{
			position -=1;
			currentNode = currentNode.next;
		}
		Node newNode = new Node(item, currentNode.next);
		currentNode.next = newNode;
	}
	
	@Override
	public Item get(int position )
	{
		if(position == 0)
		{
			return getFront();
		}
		Node currentNode = sentinel.next.next;
		while(position>1 && currentNode.next!=null)
		{
			position -=1;
			currentNode = currentNode.next;
		}

		return currentNode.item;
	}

	@Override
	public Item deleteBack()
	{
		Node back = getBackNode();
		if(back == sentinel)
		{
			return null;
		}

		Node p = sentinel;
		while(p.next != back)
		{
			p = p.next;
		}
		p.next = null;
		return back.item;
	}
	@Override
	public Item getBack()
	{
		Node back = getBackNode();
		return back.item;
	}

	@Override
	public int size()
	{
		return size;//intNodeSize(front);
	}
}