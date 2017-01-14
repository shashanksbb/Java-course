public class ListDequeLauncher{
	public static void main(String [] args)
	{
		//LinkedListDeque<Integer> l1 = new LinkedListDeque<Integer>();
		Deque<Integer> l1 = new ArrayDeque<Integer>();
		l1.addFirst(1); //[1]
		l1.addFirst(2); //[2, 1]
		l1.addLast(5); //[2,1,5]
		l1.addFirst(4); //[4,2,1,5]
		l1.addLast(3); //[4,2,1,5,3]
		l1.addFirst(6); //[6,4,2,1,5,3]
		l1.addLast(7);//[6,4,2,1,5,3, 7]
		l1.addFirst(2);//[2,6,4,2,1,5,3, 7]
		l1.addLast(8);//[2,6,4,2,1,5,3, 7,8]
		l1.addFirst(10);//[10,2,6,4,2,1,5,3, 7,8]
		l1.addLast(33);//[10,2,6,4,2,1,5,3, 7,8,33]
		l1.addLast(9);//[10,2,6,4,2,1,5,3, 7,8,33,9]
		l1.addLast(20);//[10,2,6,4,2,1,5,3, 7,8,33,9,20]
		l1.addFirst(11);//[11,10,2,6,4,2,1,5,3, 7,8,33,9,20]
		l1.printDeque();
		System.out.println();
		System.out.println(l1.get(4));
		System.out.println(l1.removeFirst());
		l1.printDeque();
		System.out.println();
		System.out.println(l1.removeFirst());
		l1.printDeque();
		System.out.println();
		System.out.println(l1.removeFirst());
		l1.printDeque();
		System.out.println();
		System.out.println(l1.removeFirst());
		l1.printDeque();
		System.out.println();
		System.out.println(l1.removeLast());
		l1.printDeque();
		System.out.println();
		System.out.println(l1.get(4));
		l1.addFirst(101);//[11,10,2,6,4,2,1,5,3, 7,8,33,9,20]
		l1.addFirst(111);//[11,10,2,6,4,2,1,5,3, 7,8,33,9,20]
		l1.printDeque();

		// Deque<Integer> l1 = new LinkedListDeque<Integer>();

		// l1.addFirst(1); //[1]
		// l1.addFirst(2); //[2, 1]
		// l1.addLast(5); //[2,1,5]
		// l1.addFirst(4); //[4,2,1,5]
		// l1.addLast(3); //[4,2,1,5,3]
		// l1.addFirst(6); //[6,4,2,1,5,3]
		// l1.addLast(7);//[6,4,2,1,5,3, 7]
		// l1.addFirst(2);//[2,6,4,2,1,5,3, 7]
		// l1.addLast(8);//[2,6,4,2,1,5,3, 7,8]
		// l1.addFirst(10);//[10,2,6,4,2,1,5,3, 7,8]
		// l1.addLast(33);//[10,2,6,4,2,1,5,3, 7,8,33]
		// l1.addLast(9);//[10,2,6,4,2,1,5,3, 7,8,33,9]
		// l1.addLast(20);//[10,2,6,4,2,1,5,3, 7,8,33,9,20]
		// l1.addFirst(11);//[11,10,2,6,4,2,1,5,3, 7,8,33,9,20]
		// l1.printDeque();
		
		// System.out.println();
		// System.out.println(l1.get(4));
		// System.out.println(l1.removeFirst());
		// l1.printDeque();
		// System.out.println();
		// System.out.println(l1.removeFirst());
		// l1.printDeque();
		// System.out.println();
		// System.out.println(l1.removeFirst());
		// l1.printDeque();
		// System.out.println();
		// System.out.println(l1.removeFirst());
		// l1.printDeque();
		// System.out.println();
		// System.out.println(l1.removeLast());
		// l1.printDeque();
		// System.out.println();
		// System.out.println(l1.get(4));
		// l1.addFirst(101);//[11,10,2,6,4,2,1,5,3, 7,8,33,9,20]
		// l1.addFirst(111);//[11,10,2,6,4,2,1,5,3, 7,8,33,9,20]
		// l1.printDeque();
	}
}