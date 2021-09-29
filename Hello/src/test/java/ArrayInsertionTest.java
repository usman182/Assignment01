import org.junit.*;
import org.junit.Test;




public class ArrayInsertionTest 
{
	int [] M_array;
	@Before
	public void beforeTest()
	{
		M_array = new int[10];
	
	}
	@Test
	public void PassingArrayInsert()
	{
		//int [] array = new int[10];
		ArrayInsertion.insert(M_array, 1, 0);
		ArrayInsertion.insert(M_array, 56, 1);
		ArrayInsertion.insert(M_array, 5, 2);
		ArrayInsertion.insert(M_array, 90, 3);
		ArrayInsertion.insert(M_array, 12, 4);
		ArrayInsertion.insert(M_array, 2, 6);
		ArrayInsertion.insert(M_array, 16, 7);
		int [] expectedArray = {1,56,5,90,12,0,2,16,0,0};
		Assert.assertArrayEquals(expectedArray, M_array);
		
	}
	
	@Test
	public void FailingArrayInsert()
	{
		//int [] array = new int[10];
		ArrayInsertion.insert(M_array, 1, 0);
		ArrayInsertion.insert(M_array, 56, 1);
		ArrayInsertion.insert(M_array, 5, 2);
		ArrayInsertion.insert(M_array, 90, 3);
		ArrayInsertion.insert(M_array, 12, 4);
		ArrayInsertion.insert(M_array, 2, 6);
		ArrayInsertion.insert(M_array, 16, 7);
		int [] expectedArray = {1,56,5,-1,12,0,2,16,0,0};
		Assert.assertArrayEquals(expectedArray, M_array);
		
	}
	
	/*@Test
	public void PassingArrayInsert2()
	{
		int [] array = new int[10];
		ArrayInsertion.insert(array, 1, 0);
		ArrayInsertion.insert(array, 5, 1);
		ArrayInsertion.insert(array, 4, 2);
		ArrayInsertion.insert(array, 7, 3);
		ArrayInsertion.insert(array, 2, 4);
		ArrayInsertion.insert(array, 0, 5);
		ArrayInsertion.insert(array, 0, 6);
		ArrayInsertion.insert(array, 0, 7);
		ArrayInsertion.insert(array, 0, 8);
		int [] expectedArray = {1,5,4,7,2,0,0,0,0,0};
		Assert.assertArrayEquals(expectedArray, array);
		
	}*/
	
	/*@Test
	public void PassingArrayInsert2()
	{
		ArrayInsertion.insert(array, 5, 2);
		int [] expectedArray = {1,0,5,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(expectedArray, array);
		
	}
	*/
	
/*	@Test
	public void FailingArrayInsert()
	{
		int [] array = {1,5,4,7,2,0,0,0,0,0};
		ArrayInsertion.insert(array, 3, 9);
		int [] expectedArray = {1,5,4,7,2,0,0,0,0,-1};
		Assert.assertArrayEquals(expectedArray, array);
	}

	@Test
	public void PassingArrayInsert2()
	{
		int [] array = {1,5,4,7,2,0,0,0,0,0};
		ArrayInsertion.insert(array, 8, 9);
		int [] expectedArray = {1,5,4,6,2,0,0,0,0,8};
		Assert.assertArrayEquals(expectedArray, array);
	}*/
//ArrayInsertion.insert(array, 15, 0);
//ArrayInsertion.insert(array, 25, 1);
//ArrayInsertion.insert(array, 35, 2);
//ArrayInsertion.insert(array, 45, 3);   

//}
//Trying to insert at index that is out of range
//@Test
//public void TestInsertWithNegitiveCase(){
//int[] array = new int[5];
//ArrayInsertion.insert(array, 15, 5);   

}