import org.junit.*;
import org.junit.Test;

public class DequeueTest 
{
	  
	   // creating objects of Dequeue
	   Dequeue queue = new Dequeue(3);	  
	   Dequeue queue1 = new Dequeue(3);
	  
	   @Test
	   public void DequeuePass() 
	   {
	       
	       queue.addRight(10);
	       queue.display();
	     
	       queue.addLeft(20);
	       queue.display();
	     
	       Assert.assertNotNull(queue); 
	   }
	  
	   @Test
	   public void DequeueFail() 
	   {
	      
	       queue1.addRight(10);
	       queue1.display();
	       
	       queue.addLeft(20);
	       queue.display();
	     
	       // checking if the two objects points to the same location
	       Assert.assertSame(queue1, queue);
	      
	   }
	  
	}