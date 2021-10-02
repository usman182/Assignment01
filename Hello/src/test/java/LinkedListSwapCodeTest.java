import org.junit.*;
import org.junit.Test;


public class LinkedListSwapCodeTest 
{
  
	 @Before
     public void BeforeTest() 
	 {
             LinkedListSwapCode.pushFront(10);
             LinkedListSwapCode.pushBack(20);
             LinkedListSwapCode.pushFront(5);
     }

     @Test
     public void testCase1()
     {
             Assert.assertEquals(LinkedListSwapCode.head.key, 5);
     }


     @Test
     public void testCase2()
     {
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 20);
     }

     @Test
     public void testCase3()
     {
    	 	 LinkedListSwapCode.pushBack(30);
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 30);
     }
     
     @Test
     public void testCase4()
     {		// This test case will fail as the correct output is 100
    	 	 LinkedListSwapCode.pushBack(100);
    	 	 LinkedListSwapCode.pushFront(300);
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 300);
     }
     
     @Test
     public void testCase5()
     {		// This test case will fail as the correct output is 500
    	 	 LinkedListSwapCode.pushBack(100);
    	 	 LinkedListSwapCode.pushFront(300);
    	 	 
    	 	LinkedListSwapCode.pushBack(500);
   	 	 	LinkedListSwapCode.pushFront(700);
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 700);
     }

}
