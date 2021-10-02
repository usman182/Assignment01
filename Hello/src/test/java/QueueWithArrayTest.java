import org.junit.*;
import org.junit.Test;


public class QueueWithArrayTest {
    
    Queue queue = new Queue(10);

    @Test
    public void PassTestCase() throws Exception 
    {
            queue.enqueue(10);
            queue.enqueue(20);
            Assert.assertEquals(queue.dequeue(), 10);
    }
    

    @Test
    public void FailTestCase() throws Exception 
    {
            Assert.assertFalse(queue.empty()); 
    }
    
    @Test
    public void PassTestCase2() throws Exception 
    {
            queue.enqueue(11);
            queue.enqueue(12);
            queue.dequeue();
            Assert.assertEquals(queue.dequeue(), 12);
    }
    
    @Test
    public void FailTestCase2() throws Exception 
    {
    		queue.enqueue(13);
    		queue.enqueue(14);
            Assert.assertTrue(queue.empty()); 
    }
    
    @Test
    public void PassTestCase3() throws Exception 
    {
    		queue.enqueue(55);
            Assert.assertEquals(queue.dequeue(), 55);
    }

}