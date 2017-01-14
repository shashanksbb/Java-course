public class LinkedListLauncher{
	public static void main(String [] args){
		LinkedList<Integer> s1 = new LinkedList<Integer>(5);
		s1.insertFront(10);

		LinkedList<String> s2 = new LinkedList<String>("Man");
		s2.insertFront("Hi");

		System.out.println(s1.getFront());
		System.out.println(s1.getBack());
		System.out.println(s2.getFront());
		System.out.println(s2.getBack());
	}
}