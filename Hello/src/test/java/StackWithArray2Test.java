import org.junit.*;
import org.junit.Test;

public class StackWithArray2Test 
{

	 StackWithArray2 Objstack;
	 @Before
     public void BeforeTest() 
     {
		 
	  Objstack = new StackWithArray2();		 
	  Objstack.push(5);
	  Objstack.push(10);
	  Objstack.push(15);
	  Objstack.push(20);
	  Objstack.push(25);
	  
     }

	 @Test
     public void ValidTestCase()
     {
             Assert.assertEquals(StackWithArray2.pop(),25);
     }

	 
     @Test
     public void InvalidTestCase() 
     {
        Assert.assertEquals(StackWithArray2.size,7);
     }

     @Test
     public void ValidTestCase2()
     {
    	  	 Objstack.push(30);
             Assert.assertEquals(StackWithArray2.pop(),30);
     }
     
     @Test
     public void ValidTestCase3()
     {
             Assert.assertEquals(StackWithArray2.size, 5);
     }
     
     @Test
     public void InvalidTestCase3() 
     {	// 25 should be popped but we are failing the test by putting 20
        Assert.assertEquals(StackWithArray2.pop(),20);
     }
    	

}