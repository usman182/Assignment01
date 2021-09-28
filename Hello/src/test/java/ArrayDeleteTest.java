import org.junit.*;
/*
public class ArrayDeleteTest {

    
    @Test
    public void deleteTestPassing() {
        int[] array = {3, 4, 5, 11, 12, 13};
        int deletionIndex = 3;
        ArrayDeletion.delete(array, deletionIndex);
        int[] expectedArray = {3, 4, 5, 12, 13, -1};
        Assert.assertArrayEquals("Value at index 3 should be deleted and " +
                        "original array should be affected",
                expectedArray, array);
    }

    
    @Test
    public void deleteTestFailing() {
        int[] array = {3, 4, 5, 11, 12, 13};
        int deletionIndex = 3;
        ArrayDeletion.delete(array, deletionIndex);
        int expectedArrayLength = array.length - 1;
        Assert.assertEquals("Array size should reduce by 1 upon deletion",
                expectedArrayLength, array.length);
    }
}*/


public class ArrayDeleteTest {

    /**
     * This test performs the deletion and checks if the resultant
     * array is same as the expected array.
     */
    @Test
    public void deleteTestPassing() {
        int[] array = {3, 4, 5, 11, 12, 13};
        int deletionIndex = 3;
        ArrayDeletion.delete(array, deletionIndex);
        int[] expectedArray = {3, 4, 5, 12, 13, -1};
        Assert.assertArrayEquals("Value at index 3 should be deleted and " +
                        "original array should be affected",
                expectedArray, array);
    }

    /**
     * This test checks if the length of the array has reduced after
     * performing the deletion. Here, as seen, the delete function
     * doesn't alter the length of the resultant array and thereby
     * it is bound to fail.
     */
    @Test
    public void deleteTestFailing() {
        int[] array = {3, 4, 5, 11, 12, 13};
        int deletionIndex = 3;
        int expectedArrayLength = array.length;
        ArrayDeletion.delete(array, deletionIndex);
        Assert.assertEquals("Array size should reduce by 1 upon deletion",
                expectedArrayLength, array.length);
    }
}