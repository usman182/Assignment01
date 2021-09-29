import org.junit.*;


public class ArrayDeleteTest {

	@Test
	public void PassingArrayDelete() 
	{
		int[] array = {1, 6, 34, 0, 2, 43};
		int IndexToDelete = 3;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {1, 6, 34, 2, 43,-1};
		Assert.assertArrayEquals("Value at index 3 should be deleted and " + "original array should be affected", expectedArray, array);
	}
	
	@Test
	public void FailingArrayDelete()
	{
		int [] array = {3, 4, 5, 11, 12, 13};
		int indexToDelete = 5;
		ArrayDeletion.delete(array, indexToDelete);
		int [] expectedArray = {3, 4, 5, 11, 12, -1};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void PassingArrayDelete2() 
	{
		int[] array = {1, 2, 3, 4, 5, 6};
		int IndexToDelete = 0;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {2, 3, 4, 5, 6,-1};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	
	// This test case basically compares the length
	@Test
    public void FailingArrayDelete2() 
	{
        int[] array = {3, 4, 5, 11, 12, 13};
        int indexToDelete = 3;
        ArrayDeletion.delete(array, indexToDelete);
        int expectedArrayLength = array.length - 1;
        Assert.assertEquals("Array size should reduce by 1 upon deletion", expectedArrayLength, array.length);
    }
	
	@Test
	public void PassingArrayDelete3() 
	{
		int[] array = {1, 2, 3, 4, 5, 6};
		int IndexToDelete = 1;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {1, 3, 4, 5, 6,-1};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void FailingArrayDelete3() 
	{
		int[] array = {1, 2, 3, 4, 5, 6};
		int IndexToDelete = 1;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {1, 2, 3, 4, 5, 6};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void PassingArrayDelete4() 
	{
		int[] array = {8, 4, 3, 1, 43, 11};
		int IndexToDelete = 4;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {8, 4, 3, 1, 11,-1};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void FailingArrayDelete4() 
	{
		int[] array = {8, 4, 3, 1, 43, 11};
		int IndexToDelete = 4;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {8, 4, 3, 1, 11, 43};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void PassingArrayDelete5() 
	{
		int[] array = {1, 2, 3};
		int IndexToDelete = 1;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {1, 3, -1};
		Assert.assertArrayEquals(expectedArray, array);
	}
	
	@Test
	public void FailingArrayDelete5() 
	{
		int[] array = {1, 2, 3};
		int IndexToDelete = -1;
		ArrayDeletion.delete(array, IndexToDelete);
		int[] expectedArray = {1, 3, -1};
		Assert.assertArrayEquals(expectedArray, array);
	}

}

