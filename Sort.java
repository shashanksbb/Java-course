public class Sort{


	public static int indexOfTheSmallest(String [] inputs, int k)
	{
		int minDex = k;
		for(int i =k;i<inputs.length; i++)
		{
			int cmp = inputs[i].compareTo(inputs[minDex]);
			if(cmp<0)
			{
				minDex = i;
			}
		}
		return minDex;
	}

	private static void swap(String [] inputs, int a, int b)
	{
		String temp;
		temp =  inputs[a];
		inputs[a] = inputs[b];
		inputs[b] = temp;
	}

	private static String [] sort(String [] inputs, int k)
	{
		if(k == inputs.length)
		{
			return inputs;
		}
		int minDex = indexOfTheSmallest(inputs, k);
		swap(inputs, k, minDex);
		return sort(inputs, k+1);
	}
	public static String [] sort(String [] inputs)
	{
		return sort(inputs, 0);
	}

	public static void print(String [] inputs)
	{

	}

	public static void main(String [] args)
	{

	}
}