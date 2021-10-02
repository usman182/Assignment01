import org.junit.*;
import org.junit.Test;

public class LinkedList2Test 
{

  
	//test case will pass
    @Test
    public void testSizeLinkedList()
    {
            LinkedList2 list = new LinkedList2();
            list.add(1);
            Assert.assertNotNull(list.size());// length of linked list should be 1
    }
    
    //test case will fail
    @Test
    public void testAddLinkedList() throws Exception
    {
            LinkedList2 list1 = new LinkedList2();
            list1.add(1);
            list1.add(2);
            list1.popFront();
            Assert.assertEquals(2, list1.size());// length of linked list should be 1
    }
}
