import org.junit.*;
import org.junit.Test;

class QueueWithLinkedListTest 
{
	QueueWithLinkedList queue = new QueueWithLinkedList();

    @Test
    public void test() {
        // adding 5 and 10
    	QueueWithLinkedList.enqueue(5);
    	QueueWithLinkedList.enqueue(10);

        // comparing the result. The size should be 2
        Assert.assertEquals(2, QueueWithLinkedList.size);
    }

    @Test
    public void test1() {
        // adding 5 and 10
    	QueueWithLinkedList.enqueue(5);
    	QueueWithLinkedList.enqueue(10);

        // comparing the result. The size should be 4
        Assert.assertEquals(1, QueueWithLinkedList.size);
    }
}