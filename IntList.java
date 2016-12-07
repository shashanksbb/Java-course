public class IntList {
	public int head;
	public IntList tail;
	public IntList(int h, IntList t)
	{
		head =h;
		tail =t;
	}

	public int size()
	{
		if(tail==null)
			return 1;
		else
			return (1+ tail.size());
	}
public int get(int i)
{
	if(i>=size())
		return -1;
	else
	{
		IntList p=this;

		for(int n=0;n<i;n++)
		{
			p=p.tail;
		}

		return p.head;
	}
}

public static void displayList(IntList L)
{
	int s=L.sizeInterative();
	for(int i=0;i<s;i++)
	{
		System.out.print(L.head+"-->");
		L=L.tail;
	}
	System.out.println("null");
}

public int getRecursive(int i)
{
	if(i==0)
		return head;
	else
	{
		if(tail!=null)
		return tail.getRecursive(i-1);
		else
			return -1;
	}
}
	public int sizeInterative()
	{
		IntList p =this;
		int size =0;
		while(p!=null)
		{
			size++; 
			p=p.tail;
		}
		return size;
	}

	public static IntList incrList(IntList L, int x)
	{
		if(L.tail==null)
		{
			IntList P = new IntList(L.head+x, null);
			return P;
		}
		
		else
			return  (new IntList(L.head+x, incrList(L.tail, x)));
	}

	public static void main(String[] args)
	{

		IntList L = new IntList(5, null);
		L = new IntList(10, L);
		L = new IntList(15 ,L);
		IntList T = L;
		System.out.println("The list size is "+L.size());
		System.out.println("The list size iterative is "+L.sizeInterative());
		while(T!=null)
		{
			System.out.println(T.head);
			T= T.tail;
		}

		System.out.println(L.get(1));
		System.out.println(L.get(0));
		System.out.println(L.get(2));
		System.out.println(L.get(3));

		System.out.println(L.getRecursive(3));
		System.out.println(L.getRecursive(2));
		System.out.println(L.getRecursive(1));
		System.out.println(L.getRecursive(0));

		displayList(L);
		displayList(incrList(L,3));
		displayList(L);
	}
}