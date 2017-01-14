import static org.junit.Assert.*;
import java.util.List;
import java.util.LinkedList;

public class MapHelper {
	
	public static <KEY, VALUE> VALUE get(ArrayMap<KEY , VALUE> am, KEY k) {
		if(am.containsKey(k)) {
			return am.get(k);
		}
		return null;
	}

	public static <KEY, VALUE> KEY  maxKey(ArrayMap<KEY , VALUE> am) {

	}

	public static void main(String [] args) {

		ArrayMap<Integer ,  String> am = new ArrayMap<Integer, String>();
		am.put(5, "Hello");
		am.put(10, "World");

		System.out.println(MapHelper.get(am, 5));
	}
}