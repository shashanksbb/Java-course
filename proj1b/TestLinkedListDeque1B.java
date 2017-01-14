import org.junit.Test;
import static org.junit.Assert.*;

public class TestLinkedListDeque1B{
    @Test
    public void test1() {
        StudentLinkedListDeque<Integer> studLLDeque = new StudentLinkedListDeque<Integer>();
        studLLDeque.addLast(5);
        studLLDeque.addLast(10);
        Integer expected1 = 10;
        Integer expected2 = 5;
        Integer actual1 = studLLDeque.removeLast();
        Integer actual2 = studLLDeque.removeLast();
        Integer actual3 = studLLDeque.removeLast();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(null, actual3);

    }

    @Test
    public void test2() {
        StudentLinkedListDeque<Integer> studLLDeque = new StudentLinkedListDeque<Integer>();
        studLLDeque.addLast(5);
        studLLDeque.addFirst(10);
        Integer expected1 = 5;
        Integer expected2 = 10;
        Integer actual1 = studLLDeque.removeLast();
        Integer actual2 = studLLDeque.removeLast();
        Integer actual3 = studLLDeque.removeFirst();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(null, actual3);
    }

    @Test
    public void test3() {
        StudentLinkedListDeque<Integer> studLLDeque = new StudentLinkedListDeque<Integer>();
        studLLDeque.addLast(5);
        studLLDeque.addFirst(10);
        Integer expected1 = 10;
        Integer expected2 = 5;
        Integer actual1 = studLLDeque.removeFirst();
        Integer actual2 = studLLDeque.removeFirst();
        Integer actual3 = studLLDeque.removeFirst();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(null, actual3);
    }

    @Test
    public void test4() {
        StudentLinkedListDeque<Integer> studLLDeque = new StudentLinkedListDeque<Integer>();

        assertEquals(true, studLLDeque.isEmpty());
        assertEquals(0, studLLDeque.size());
        studLLDeque.addLast(5); //[5]
        studLLDeque.addFirst(10); //[10, 5]
        studLLDeque.addFirst(1); //[1, 10, 5]
        studLLDeque.addFirst(3);//[3, 1, 10, 5]
        studLLDeque.addLast(51);//[3, 1, 10, 5,51]
        studLLDeque.addLast(54);//[3, 1, 10, 5,51, 54]
        studLLDeque.addFirst(36); //[36, 3, 1, 10, 5,51, 54]
        studLLDeque.addFirst(29); //[29, 36, 3, 1, 10, 5,51, 54]
        studLLDeque.addFirst(99);//[99, 29, 36, 3, 1, 10, 5,51, 54]
        studLLDeque.addLast(56);//[99, 29, 36, 3, 1, 10, 5,51, 54, 56]
        studLLDeque.addFirst(110); //[110, 99, 29, 36, 3, 1, 10, 5,51, 54, 56]
        studLLDeque.addFirst(0); //[0, 110, 99, 29, 36, 3, 1, 10, 5,51, 54, 56]
        studLLDeque.addLast(532);//[0, 110, 99, 29, 36, 3, 1, 10, 5,51, 54, 56, 532]
        studLLDeque.addFirst(140);//[140, 0, 110, 99, 29, 36, 3, 1, 10, 5,51, 54, 56, 532]
        assertEquals(false, studLLDeque.isEmpty());
        assertEquals(14, studLLDeque.size());

        Integer expected1 = 140;
        Integer expected2 = 532;
        Integer expected3 = 3;
        Integer actual1 = studLLDeque.removeFirst();
        Integer actual2 = studLLDeque.removeLast();
        assertEquals(false, studLLDeque.isEmpty());
        assertEquals(12, studLLDeque.size());
        Integer actual3 = studLLDeque.get(5);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    @Test
    public void test5() {
        StudentLinkedListDeque<Integer> studLLDeque = new StudentLinkedListDeque<Integer>();

        studLLDeque.addFirst(503); //[5]
        studLLDeque.addFirst(505); //[5]
        studLLDeque.addFirst(501); //[5]
        studLLDeque.addFirst(502);

        assertEquals(502, (int)studLLDeque.removeFirst());
        assertEquals(503, (int)studLLDeque.removeLast());
        assertEquals(501, (int)studLLDeque.removeFirst());
        assertEquals(505, (int)studLLDeque.removeFirst());
    }

    public static void main(String[] args) {
        jh61b.junit.TestRunner.runTests(TestLinkedListDeque1B.class);
    }
}