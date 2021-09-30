import org.junit.*;
import org.junit.Test;


public class StackWithArray2Test 
{
	 @Before
      public void StackJUnit() 
      {
       StackWithArray2.push(10);
       StackWithArray2.push(20);
       StackWithArray2.push(30);
       StackWithArray2.push(2);
      }

      @Test
      public void testCase1() 
      {
    	  
         Assert.assertEquals(StackWithArray2.size, 4);
      }

      @Test
      public void testCase2()
      {
              Assert.assertEquals(StackWithArray2.pop(), 10);
      }
}
