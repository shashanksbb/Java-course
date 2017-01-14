package synthesizer;
import java.util.Iterator;


public class ArrayRingBuffer<T>  extends AbstractBoundedQueue<T>{
    /* Index for the next dequeue or peek. */
    private int first;            // index for the next dequeue or peek
    /* Index for the next enqueue. */
    private int last;
    /* Array for storing the buffer data. */
    private T[] rb;

    /**
     * Create a new ArrayRingBuffer with the given capacity.
     */
    public ArrayRingBuffer(int capacity) {
        rb = (T []) new Object[capacity];
        first = 0;
        last =0;
        this.capacity = capacity;
        fillCount = 0;
    }

    /**
     * Adds x to the end of the ring buffer. If there is no room, then
     * throw new RuntimeException("Ring buffer overflow"). Exceptions
     * covered Monday.
     */
    public void enqueue(T x) {
        if(isFull())
        {
            throw new RuntimeException("Ring buffer overflow");
        }
        else
        {
            rb[last] = x;
            last++;
            fillCount++;
            if(last == capacity())
            {
                last = 0;
            } 
        }
    }

    /**
     * Dequeue oldest item in the ring buffer. If the buffer is empty, then
     * throw new RuntimeException("Ring buffer underflow"). Exceptions
     * covered Monday.
     */
    public T dequeue() {
        T firstItem;
        if(isEmpty())
        {
            throw new RuntimeException("Ring buffer underflow");
        }
        else
        {
            firstItem = rb[first];
            rb[first] = null;
            first++;
            fillCount--;
            if(first == capacity())
            {
                first = 0;
            } 
        }
        return firstItem;
    }

    /**
     * Return oldest item, but don't remove it.
     */
    public T peek() {
        if(isEmpty())
        {
            throw new RuntimeException("Ring buffer underflow");
        }
        else
        {
            return rb[first];
        }
    }

    // TODO: When you get to part 5, implement the needed code to support iteration.

    public class ItemIterator implements Iterator<T>{
        private int pointer;

        public ItemIterator()
        {
            pointer = 0;
        }
        public boolean hasNext()
        {
            return (pointer<fillCount);
        }
        public T next()
        {
            int dataPointer;
            dataPointer = (pointer+first)<capacity? (pointer+first) : (pointer+first)-capacity;
            T currentItem =  rb[dataPointer];
            pointer++;
            return currentItem;
        }


    }

    public ItemIterator iterator()
    {
        return new ItemIterator();
    }
}
