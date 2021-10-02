import org.junit.*;
import org.junit.Test;

public class LinkedList2Test 
{
	LinkedList2 list;
	@Before
	public void BeforeTest()
	{
		 list = new LinkedList2();
	}
	
    @Test
    public void ValidTestCase1()
    {
            list.add(5);
            Assert.assertNotNull(list.size());
    }
    
    @Test
    public void InvalidTestCase1() throws Exception
    {
            list.add(5);
            list.add(10);
            list.popFront();
            Assert.assertEquals(2, list.size());
    }
    
    @Test
    public void ValidTestCase2() throws Exception
    {
            list.pushFront(50);
            Assert.assertEquals(list.topFront(), 50);
    }
    
    @Test
    public void ValidTestCase3() throws Exception
    {
            list.pushFront(50);
            list.pushFront(100);
            list.pushBack(150);
            list.popFront();
            Assert.assertEquals(list.topBack() , 150);
    }
    
    @Test
    public void InvalidTestCase3() throws Exception
    {
            list.add(200);
            // size should be 5 but we will fail the test
            Assert.assertEquals(2, list.size());
    }
}
