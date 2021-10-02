import org.junit.*;
import org.junit.Test;


public class CircularLinkedListTest {

	
	 @Before
     public void BeforeTest() 
	 {
		 CircularLinkedList.pushFront(10);
		 CircularLinkedList.pushBack(20);
		 CircularLinkedList.pushFront(5);
     }

	@Test
	public void PassingTestCase1() 
	{
				Assert.assertEquals(CircularLinkedList.head.key, 5);

	}
	
	@Test
	public void PassingTestCase2() 
	{
		 		CircularLinkedList.popFront();
				Assert.assertEquals(CircularLinkedList.head.key , 10);

	}
	
	@Test
	public void PassingTestCase3() 
	{
		 		CircularLinkedList.pushBack(50);
		 		CircularLinkedList.pushFront(60);
		 		CircularLinkedList.pushBack(70);
		 		// 60 is correct as we are retrieving front values
				Assert.assertEquals(CircularLinkedList.head.key , 60);

	}
	
	 @Test
     public void FailingTestCase1() 
	 {
		 CircularLinkedList.popBack();
		 CircularLinkedList.pushFront(100);
		 // 100 should be in front but we will use -1 to check fail the test
		 Assert.assertEquals(CircularLinkedList.head.key , -1);
     }
	 
	 @Test
     public void FailingTestCase2() 
	 {
		 CircularLinkedList.pushFront(40);
		 // 100 should be in front but we will use 30 to check fail the test
		 Assert.assertEquals(CircularLinkedList.head.key , 30);
     }

}
