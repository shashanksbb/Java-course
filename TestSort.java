import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort{
	@Test
	public  void testSort()
	{
		String [] inputs = {"Shashank", "Krishna", "Aditya", "Chida"};
		String [] expected = { "Aditya","Chida","Krishna","Shashank"};
		String [] actuals = Sort.sort(inputs);

		assertArrayEquals(expected, actuals);
	}

	@Test
	public  void testindexOfTheSmallest()
	{
		String [] inputs = {"Shashank", "Krishna", "Aditya", "Chida"};
		int expected = 2;
		int actuals = Sort.indexOfTheSmallest(inputs, 1);

		assertEquals(expected, actuals);

	}

	public static void main(String [] args)
	{

		jh61b.junit.TestRunner.runTests("all", TestSort.class);

	}
}