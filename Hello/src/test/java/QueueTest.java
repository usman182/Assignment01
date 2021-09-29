import org.junit.*;
import org.junit.Test;


public class QueueTest 
{
    
    Queue queue = new Queue(10);

    @Test
    public void testCase1Pass() throws Exception 
    {
            queue.enqueue(10);
            queue.enqueue(20);
            queue.dequeue();
            Assert.assertEquals(queue.dequeue(), 20);
    }
    
    @Test
    public void testCase2Fail() throws Exception 
    {
            Assert.assertTrue(queue.size!=0);
    }

}
