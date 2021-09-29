import org.junit.*;
import org.junit.Test;

public class ArrayTest 
{
	@Test
	public void PassArrayTest()
	{
		Array array = new Array();
		array.insert(1,0);
		array.insert(3,1);
		array.insert(5,2);
		array.insert(7,3);
		array.insert(9,4);
  
		array.display();
		array.bubbleSort();
		array.delete(1);
		array.display();
  
		Assert.assertTrue(array.linearSearch(5) == true);
		Assert.assertTrue(array.binarySearch(7,0,5) == true);
		Assert.assertTrue(array.binarySearch(9,0,5) == true);
	}
  
	@Test
	public void FailArrayTest()
	{
		Array array = new Array();
		array.insert(10,0);
		array.insert(30,1);
		array.insert(20,2);
		array.insert(40,3);
  
		array.display();
		array.bubbleSort();
		array.delete(40);
		array.display();
  
		Assert.assertTrue(array.linearSearch(50) == true);
		Assert.assertTrue(array.binarySearch(20,0,3));
	}
	
	@Test
	public void PassArrayTest2()
	{
		Array array = new Array();
		array.insert(10,0);
		array.insert(30,1);
		array.insert(20,2);
		array.insert(40,3);
  
		array.display();
		array.bubbleSort();
		array.delete(40);
		array.display();
  
		Assert.assertTrue(array.linearSearch(50) == false);
		Assert.assertTrue(array.binarySearch(20,0,3));
	}
	
	@Test
	public void FailArrayTest2()
	{
		Array array = new Array();
		array.insert(10,0);
		array.insert(30,1);
		array.insert(20,2);
		array.insert(40,3);
  
		array.display();
		array.bubbleSort();
		array.delete(10);
		array.display();
  
		Assert.assertTrue(array.linearSearch(60) == false);
		Assert.assertTrue(array.binarySearch(20,0,3));
	}
	
	@Test
	public void PassArrayTest3()
	{
		Array array = new Array();
		array.insert(1,0);
		array.insert(2,1);
		array.insert(3,2);
		array.insert(4,3);
		array.insert(5,4);
		array.insert(6,5);
		array.insert(7,6);
  
		array.display();
		array.bubbleSort();
		array.delete(7);
		array.display();
  
		Assert.assertTrue(array.linearSearch(1) == true);
		Assert.assertTrue(array.binarySearch(4,0,7));
	}
	
	@Test
	public void FailArrayTest3()
	{
		Array array = new Array();
		array.insert(1,0);
		array.insert(2,1);
		array.insert(3,2);
		array.insert(4,3);
		array.insert(5,4);
		array.insert(6,5);
		array.insert(7,6);
  
		array.display();
		array.bubbleSort();
		array.delete(7);
		array.display();
  
		Assert.assertTrue(array.linearSearch(1) == false);
		Assert.assertTrue(array.binarySearch(4,0,7));
	}
	
	@Test
	public void PassArrayTest4()
	{
		Array array = new Array();
		array.insert(1,0);
		array.insert(2,1);
		
  
		array.display();
		array.bubbleSort();
		array.delete(1);
		array.display();
  
		Assert.assertTrue(array.linearSearch(1) == false);
		Assert.assertTrue(array.binarySearch(2,0,1));
	}
	
	@Test
	public void FailArrayTest4()
	{
		Array array = new Array();
		array.insert(1,0);
		array.insert(2,1);
		
  
		array.display();
		array.bubbleSort();
		array.delete(1);
		array.display();
  
		Assert.assertTrue(array.linearSearch(1) == true);
		Assert.assertTrue(array.binarySearch(2,0,1));
	}
	
	@Test
	public void PassArrayTest5()
	{
		Array array = new Array();
		array.insert(55,0);
		array.insert(56,0);
		array.insert(57,0);
		
  
		array.display();
		array.bubbleSort();
		array.delete(55);
		array.display();
  
		Assert.assertTrue(array.linearSearch(56) == true);
		Assert.assertTrue(array.binarySearch(55,0,2));
	}
	
	@Test
	public void FailArrayTest5()
	{
		Array array = new Array();
		array.insert(55,0);
		array.insert(56,0);
		array.insert(57,0);
		
  
		array.display();
		array.bubbleSort();
		array.delete(55);
		array.display();
  
		Assert.assertTrue(array.linearSearch(56) == true);
		Assert.assertTrue(array.binarySearch(58,0,2));
	}
}