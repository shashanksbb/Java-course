public class SList{

public class IntNode {
	public int item;
	public IntNode next;
	public IntNode(int i, IntNode n)
	{
		item =i;
		next =n;
	}

	}

	private IntNode front;
	private int size;
	public SList(int x)
	{
		front = new IntNode(x, null);
		size = 1;
	}

		public SList()
	{
		front = null;
		size = 0;
	}

	public void insertFront(int x)
	{
		front = new IntNode(x, front);
		size +=1;
	}

	public int getFront()
	{
		return front.item;
	}

	public void insertBack(int x)
	{
		IntNode P = front;
		while(P.next != null)
		{
			P = P.next;
		} 

		P.next = new IntNode(x, null);

		size +=1;
	}

public static  int intNodeSize(IntNode n)
{
	if(n.next == null)
	{
		return 1;
	}
	else 
		return 1 + intNodeSize(n.next);
}
	public int size()
	{
		return size;//intNodeSize(front);
	}
	public static void main(String [] args)
	{
		SList s1 = new SList(10);
		s1.insertFront(5);
		s1.insertFront(0);
		System.out.println(s1.front.item);

		System.out.println(s1.front.next.item);

		System.out.println(s1.front.next.next.item);
		System.out.println(s1.getFront());
		s1.insertBack(-5);

		System.out.println(s1.size());
	}
}