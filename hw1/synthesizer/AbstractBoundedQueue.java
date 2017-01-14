package synthesizer;

public abstract class AbstractBoundedQueue<Item> implements BoundedQueue<Item>{

	protected int fillCount;
	protected int capacity;
	public int fillCount()
	{
		return fillCount;
	}
	public int capacity()
	{
		return capacity;
	}
}