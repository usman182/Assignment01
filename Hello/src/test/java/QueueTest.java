import org.junit.*;
import org.junit.Test;

public class QueueTest 
{
    
    Queue queue = new Queue(10);

    @Test
    public void PassTestCase() throws Exception 
    {
            queue.enqueue(10);
            queue.enqueue(20);
            queue.dequeue();
            Assert.assertEquals(queue.dequeue(), 20);
    }
    
    
    @Test
    public void PassTestCase2() throws Exception 
    {
    	queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        Assert.assertEquals(queue.dequeue(), 20);
    }

    @Test
    public void FailTestCase2() throws Exception 
    {
    		 Assert.assertTrue(queue.size() != 0);
    }
    
    @Test
    public void FailTestCase() throws Exception 
    {
    		// can't dequeue as queue is empty
    		queue.enqueue(10);
            Assert.assertTrue(queue.empty());
    }
    
    @Test
    public void PassTestCase3() throws Exception 
    {
    	queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        Assert.assertEquals(queue.dequeue(), 30);
    }
}
