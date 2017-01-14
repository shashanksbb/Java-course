public class LinkedListDeque<Item> implements Deque<Item>{
	
	public class Node{
		public Node prev;
		public Item item;
		public Node next;

		public Node(Item i, Node p, Node n)
		{
			item = i;
			prev = p;
			next = n;
		}
	}

	private int size;
	public Node sentinel;
	public LinkedListDeque()
	{
		sentinel = new Node(null, null, null);
		sentinel.prev = sentinel;
		sentinel.next = sentinel;
		size = 0;
	}

	@Override
	public void addFirst(Item item)
	{
		
		Node newNode = new Node(item, sentinel, sentinel.next);
		sentinel.next.prev = newNode;
		sentinel.next = newNode;
		size++;
		
	}

	@Override
	public void addLast(Item item)
	{
		Node newNode = new Node(item, sentinel.prev, sentinel);
		sentinel.prev.next = newNode;
		sentinel.prev = newNode;
		size++;
	}

	@Override
	public boolean isEmpty()
	{
		if(size==0)
			return true;
		else
			return false;

	}

	@Override
	public int size()
	{
		return size;
	}

	@Override
	public void printDeque()
	{
		Node P = sentinel.next;
		for(int i=0; i<size;i++)
		{
			System.out.print(P.item+" ");
			P =P.next;
		}
	}

	@Override
	public Item removeFirst()
	{
		if(size==0)
		{
			return  null;
		}

		Node P = sentinel.next;
		P.next.prev = sentinel;
		sentinel.next = P.next;
		P.next = null;
		P.prev = null;
		size--;
		return P.item;
	}

	@Override
	public Item removeLast()
	{
		if(size==0)
		{
			return  null;
		}

		Node P = sentinel.prev;
		P.prev.next = sentinel;
		sentinel.prev = P.prev;
		P.next = null;
		P.prev = null;
		size--;
		return P.item;
	}

	@Override
	public Item get(int index)
	{
		if(size<index)
		{
			return null;
		}
		Node P =sentinel.next;
		for (int i=0;i<index;i++ ) 
		{
			P = P.next;
		}
		return P.item;
	}
}