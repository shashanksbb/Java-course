package synthesizer;

import java.util.Iterator;

public interface BoundedQueue<Item> extends Iterable<Item>{

	int capacity();
	int fillCount();
	void enqueue(Item x);
	Item dequeue();
	Item peek();

	default boolean isEmpty()
	{
		if(fillCount() == 0)
		{
			return true;
		}

		return false;
	}

	default boolean isFull()
	{
		if(fillCount() == capacity())
		{
			return true;
		}
		return false;
	}
}