public class AList<Item> implements List61B<Item>{


	private Item [] items;
	private int size;

	private double usageRatio;
	private static int REFACTOR = 2;
	public AList()
	{
		items =  (Item[]) new Object[100];
		size = 0;
		usageRatio = size/items.length;
	}

	private void resize(int capacity)
	{
			Item [] a =  (Item[]) new Object[capacity];;
			System.arraycopy(items, 0, a, 0, size);
			items = a;
	}

	@Override
    public void insertBack(Item x)
	{

		if(size==items.length)
		{
			resize(size * REFACTOR);
		}
		items[size] = x;
		size++;

	}

	@Override
    public Item get(int i)
	{
		return items[i];
	}

	@Override
    public Item getBack()
	{
		return items[size-1];
	}	

	@Override
    public int size()
	{
		return size;
	}

	@Override
    public Item deleteBack()
	{

		Item itemToReturn = getBack();
		items[size-1] = null;
		size -=1;

		if(usageRatio<0.25)
		{
			resize(items.length/2);
		}

		return itemToReturn;
	}

	    @Override
    public void insert(Item x, int position) {
        Item[] newItems = (Item[]) new Object[items.length + 1];

        System.arraycopy(items, 0, newItems, 0, position);
        newItems[position] = x;

        System.arraycopy(items, position, newItems, position + 1, items.length - position);
        items = newItems;
    }

    /** Inserts an item at the front. */
    @Override
    public void insertFront(Item x) {
        insert(x, 0);
    }

    /** Gets an item from the front. */
    @Override
    public Item getFront() {
        return get(0);
    }

		public static void main(String [] args){
		AList<Integer> l1 = new AList<Integer>();
		int i=0;
		while(i<100000000)
		{
			l1.insertBack(i);
			i++;
		}
		System.out.println("Done");
	}
}