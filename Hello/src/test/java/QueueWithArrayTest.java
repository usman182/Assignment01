import org.junit.*;
import org.junit.Test;


public class QueueWithArrayTest {
    
    Queue queue = new Queue(10);

    @Test
    public void ValidTestCase() throws Exception 
    {
            queue.enqueue(10);
            queue.enqueue(20);
            Assert.assertEquals(queue.dequeue(), 10);
    }
    

    @Test
    public void InValidTestCase() throws Exception 
    {
            Assert.assertFalse(queue.empty()); 
    }

}