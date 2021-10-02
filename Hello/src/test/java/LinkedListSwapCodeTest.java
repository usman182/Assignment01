import org.junit.*;
import org.junit.Test;


public class LinkedListSwapCodeTest 
{
  
	 @Before
     public void BeforeTest() 
	 {
             LinkedListSwapCode.pushFront(10);
             LinkedListSwapCode.pushBack(20);
             LinkedListSwapCode.pushFront(30);
     }

     @Test
     public void PassTestCase1()
     {
             Assert.assertEquals(LinkedListSwapCode.head.key, 30);
     }


     @Test
     public void PassTestCase2()
     {
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 20);
     }

     @Test
     public void PassTestCase3()
     {
    	 	 LinkedListSwapCode.pushBack(100);
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 100);
     }
     
     @Test
     public void FailTestCase1()
     {		// This test case will fail as the correct output is 100
    	 	 LinkedListSwapCode.pushBack(100);
    	 	 LinkedListSwapCode.pushFront(300);
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 300);
     }
     
     @Test
     public void FailTestCase2()
     {		// This test case will fail as the correct output is 500
    	 	 LinkedListSwapCode.pushBack(100);
    	 	 LinkedListSwapCode.pushFront(300);
    	 	 
    	 	LinkedListSwapCode.pushBack(500);
   	 	 	LinkedListSwapCode.pushFront(700);
    	 	 LinkedListSwapCode.swap();
             Assert.assertEquals(LinkedListSwapCode.head.key, 700);
     }

}
