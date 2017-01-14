public class ArrayMap<K, V>{

	private K[] keys;
	private V[] values;
	private int size;

	public ArrayMap() {
		keys = (K[]) new Object[100];
		values = (V[]) new Object[100];
		size =0;
	}

	private int findKey(K key) {
		for(int i=0;i<size; i++)
		{
			if(keys[i].equals(key))
			{
				return i;
			}
		}
		return -2;
	}

	public void put(K key, V value) {

		int loc = findKey(key);
		if(loc<0){
			keys[size] = key;
			values[size] = value;
			size++;
		}
		else{
			values[loc] =value;
		}
	}

	public V get(K key) {
		return values[findKey(key)];
	}

	public K [] keys() {
		return keys;
	}

	public boolean containsKey(K key) {
		return (findKey(key)>-1);
	}
}