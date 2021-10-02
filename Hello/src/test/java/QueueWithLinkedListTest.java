import org.junit.*;
import org.junit.Test;

public class QueueWithLinkedListTest 
{
	QueueWithLinkedList queue = new QueueWithLinkedList();
    
	@Test
    public void ValidTestCase1() 
	{
        
    	QueueWithLinkedList.enqueue(15);
    	QueueWithLinkedList.enqueue(20);

        Assert.assertEquals(2, QueueWithLinkedList.size);
    }
	
    @Test
    public void ValidTestCase2() 
    {
       
    	QueueWithLinkedList.enqueue(30);
    	QueueWithLinkedList.enqueue(40);

        Assert.assertEquals(2, QueueWithLinkedList.size);
    }
   
    @Test
    public void ValidTestCase3() 
    {
       
    	QueueWithLinkedList.enqueue(10);
    	QueueWithLinkedList.enqueue(20);

        Assert.assertEquals(10, QueueWithLinkedList.dequeue());
    }
    
    @Test
    public void InValidTestCase() 
    {
       
    	QueueWithLinkedList.enqueue(60);
    	QueueWithLinkedList.enqueue(70);

        Assert.assertEquals(70, QueueWithLinkedList.dequeue());
    }
    
    @Test
    public void InValidTestCase2() 
    {
       
    	QueueWithLinkedList.enqueue(60);
    	QueueWithLinkedList.enqueue(70);

        Assert.assertNotEquals(60, QueueWithLinkedList.dequeue());
    }
    


}