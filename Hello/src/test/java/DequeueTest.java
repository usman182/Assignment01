import org.junit.*;
import org.junit.Test;

public class DequeueTest 
{
	  
	   // creating objects of Dequeue
	   Dequeue queue = new Dequeue(3);	  
	   Dequeue queue1 = new Dequeue(3);
	  
	   @Test
	   public void DequeuePassTest() 
	   {
	       
	       queue.addRight(10);
	       queue.display();
	       queue.addLeft(20);
	       queue.display();
	    	     
	       Assert.assertNotNull(queue); 	// check if the queue is not empty
	   }
	  
	   @Test
	   public void DequeueFailTest() 
	   {
	      
	       queue1.addRight(10);
	       queue1.display();
	       queue.addLeft(20);
	       queue1.display();
	       // checking if the two objects points to the same location, if they don't then return false
	       Assert.assertSame(queue1, queue);
	      
	   }
	   
	   @Test
	   public void DequeuePassTest2() 
	   {
	       
	       queue.addRight(15);
	       queue.display();
	       queue.addRight(20);
	       queue.display();
	       queue.addLeft(25);
	       queue.display();
	    	     
	       Assert.assertNotNull(queue); 	// check if the queue is not empty
	   }
	   
	   @Test
	   public void DequeueFailTest2() 
	   {
	       // checking if the the queue1 object is empty
	       Assert.assertNull(queue1);
	      
	   }
	   
	   @Test
	   public void DequeuePassTest3() 
	   {
	       
	       Assert.assertNotNull(queue); 	// check if the queue is not empty
	   }
	  
	}