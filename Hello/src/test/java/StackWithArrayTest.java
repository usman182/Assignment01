import org.junit.*;
import org.junit.Test;


public class StackWithArrayTest {

	 StackWithArray stack = new StackWithArray(10);
	
	 @Before
     public void BeforeFunction() throws Exception 
	 {
           
     stack.push(10);
     stack.push(20);
     stack.push(30);
     stack.push(40);
     }

     @Test
     public void ValidTestCase() throws Exception 
     {
             Assert.assertEquals(stack.top(), 40);
     }
     
     @Test
     public void ValidTestCase2() throws Exception 
     {
            Assert. assertEquals(stack.size(), 4);
     }

     @Test
     public void InvalidTestCase() throws Exception 
     {
            Assert. assertEquals(stack.size(), 2);	// as there are 4 elements so the size should be 4
     }
     
     @Test
     public void ValidTestCase3() throws Exception 
     {
    	     stack.pop();
             Assert.assertEquals(stack.top(), 30);
     }
     
     @Test
     public void InvalidTestCase3() throws Exception 
     {
    	 	stack.push(50);	// as we pushed another element so the top should be 50 but we fail it by placing -1
            Assert. assertEquals(stack.top(), -1);
     }
}
