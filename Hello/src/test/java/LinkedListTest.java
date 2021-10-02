import org.junit.*;
import org.junit.Test;


public class LinkedListTest {
     
	 @Before
     public void BeforeTest() 
	 {
		 LinkedList.pushFront(10);
		 LinkedList.pushBack(20);
		 LinkedList.pushFront(5);
     }

     @Test
     public void TestCaseThatPasses1() 
     {
    	    LinkedList.popFront();
            Assert.assertEquals(LinkedList.head.key, 10);
     }


     @Test
     public void TestCaseThatPasses2() 
     {		// At position 1 we have the 5 value
    	 	 LinkedList.pop(1);
    	 	 Assert.assertEquals(LinkedList.head.key, 5);
     }
     
     @Test
     public void TestCaseThatPasses3() 
     {		// Size of elements is 6 as pushing is happening 6 times
    	 	 LinkedList.pop(1);
             Assert.assertEquals(LinkedList.size, 6);
     }
     
   
     @Test
     public void TestCaseThatFails1() 
     {		// Size of elements is 9 as pushing is happening 9 times
    	 	 Assert.assertEquals(LinkedList.size, 8);
     }
     
     @Test
     public void TestCaseThatFails2() 
     {		// As 5 was pushed and when popping back 5 should be popped back but we will try it with 20 to fail the test
    	 	 LinkedList.popBack();
    	 	 Assert.assertEquals(LinkedList.head.key, 20);
     }
}
