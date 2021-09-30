import org.junit.*;
import org.junit.Test;

public class StackWithLinkedListTest {

	@Before
	public void BeforeClass()
	{
		
		 StackWithLinkedList.push(5);
		 StackWithLinkedList.push(10);
		 StackWithLinkedList.push(15);
		
	}
	
		@Test
	    public void ValidTestCase1() 
		{
	       
	        Assert.assertEquals(15, StackWithLinkedList.top());
	    }

	    @Test
	    public void InvalidTestCase2() 
	    {
	        Assert.assertEquals(7, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void ValidTestCase3() 
		{
	    	 StackWithLinkedList.pop();
	        
	        Assert.assertEquals(10, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void InvalidTestCase4() 
	    {
	        Assert.assertEquals(-1, StackWithLinkedList.top());
	    }
	    
	    @Test
	    public void ValidTestCase5() 
		{
	    	 StackWithLinkedList.pop();
	        Assert.assertEquals(10, StackWithLinkedList.top());
	    }

}
