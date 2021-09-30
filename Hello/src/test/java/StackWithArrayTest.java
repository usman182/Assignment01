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
     public void testCase1() throws Exception 
     {
             Assert.assertEquals(stack.top(), 40);
     }
     
     @Test
     public void testCase2() throws Exception 
     {
            Assert. assertEquals(stack.size(), 4);
     }

     @Test
     public void testCase3() throws Exception 
     {
            Assert. assertEquals(stack.size(), 2);
     }
}
