public class ArrayDeque<Item> implements Deque<Item>{
	
	private int size;
	private int first;
	private int last;

	private Item [] items;
	private static int SCALE_FACTOR = 2;
	public ArrayDeque()
	{
		size = 0;
		first = 1;
		last = -1;
		items = (Item []) new Object[10];
	}


	private Item [] resize(Item [] items, int newSize)
	{
		Item [] newItems = (Item []) new Object[newSize];

		if(first>last){
			System.arraycopy(items, first, newItems, 0, items.length - first);
			System.arraycopy(items, 0, newItems, items.length - first, last+1);
		}
		else{
			System.arraycopy(items, first, newItems, 0, last-first+1);
		}
		
		first = 0;
		last = size - 1;
		return newItems;
	}

	@Override
	public void addFirst(Item item)
	{

		if(size==items.length)
		{
			items = resize(items, items.length * SCALE_FACTOR);
			addFirst(item);
		}
		first--;
		if(first<0)
		{
			first = items.length+first;
		}
		items[first] = item;
		size++;
		if(size==1)
		{
			last++;
		}
	}

	@Override
	public void addLast(Item item)
	{

		if(size==items.length)
		{
			items = resize(items, items.length * SCALE_FACTOR);
			addLast(item);
		}

		last++;
		if(last==items.length)
		{
			last = 0;
		}
		items[last] = item;
		size++;
		if(size==1)
		{
			first--;
		}
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
		if(size==0)
		{
			System.out.println("Empty List");
		}
		else
		{
			int index = first;
			for(int i=0;i<size;i++)
			{
				System.out.print(items[index]+" ");
				index++;
				if(index==items.length)
				{
					index=0;
				}
			}
		}
	}

	@Override
	public Item removeFirst()
	{
		if(size==0)
		{
			return null;
		}
		size--;
		Item firstItem = items[first];
		items[first] = null;
		first++;
		if(first==items.length)
		{
			first = 0;
		}

		if((((double)size/items.length)<0.25) && (items.length>10))
		{
			items = resize(items, items.length/SCALE_FACTOR);
		}
		return firstItem;
	}

	@Override
	public Item removeLast()
	{
		if(size==0)
		{
			return null;
		}
		size--;
		Item lastItem = items[last];
		items[last] = null;
		last--;
		if(last<0)
		{
			last = items.length+last;
		}

		if((((double)size/items.length)<0.25) && (items.length>10))
		{
			items = resize(items, items.length/SCALE_FACTOR);
		}
		return lastItem;
	}

	@Override
	public Item get(int index)
	{
		int arrayIndex = first+index;
		if(arrayIndex>=items.length)
		{
			arrayIndex -= items.length;
		}
		return items[arrayIndex];
	} 
}