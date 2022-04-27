import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {

    @Test
    public void testMinMaxAve() {
        int[] arrTest = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] rezult = Utils.MinMaxAve(arrTest, 2, 6);
        int[] expRezult = {3, 7, 5};
        Assert.assertEquals(rezult, expRezult);
    }

    @Test
    public void testIntersection() {
        int[] arr1Test = {1, 2, 4, 5, 89};
        int[] arr2Test = {8, 9, 4, 2};
        Integer[] expRezult = {2, 4};
        Assert.assertEquals(Utils.Intersection(arr1Test, arr2Test), expRezult);
    }

    @Test
    public void testPeakElement() {
        int[] arrTest = {3, 2, 7, 5, 1, 9, 23, 1};
        Integer[] expRezult = {3, 7, 23};
        Assert.assertEquals(Utils.PeakElement(arrTest), expRezult);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testPeakElementNegativ(){
        int [] arrTest={};
        Integer [] expRezult=Utils.PeakElement(arrTest);
    }

    @Test
    public void testReverseArray() {
        int[] arrTest = {2, 7, 3, 10};
        int[] expRezult = {10, 3, 7, 2};
        Assert.assertEquals(Utils.ReverseArray(arrTest), expRezult);
    }

    @Test
    public void testSearshIndString() {
        String[] arrTest = {"Sem", "Vasiliy", "Tisha", "Mura", "Barsik", "Simon", "Tom"};
        String rezult = Utils.searshIndexS(arrTest, 3);
        Assert.assertEquals(rezult, "Mura");
    }

    @Test
    public void testSearshIndInt() {
        int[] arrTest = {1, 55, 6, 9, 13, 7, 33};
        int rezult = Utils.searshIndex(arrTest, 5);
        Assert.assertEquals(rezult, 7);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testExceptionS() {
        String[] arrTest = {"Sem", "Vasiliy", "Tisha", "Mura", "Barsik", "Simon", "Tom"};
        String rezult = Utils.searshIndexS(arrTest, 10);
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void testException() {
        int[] arrTest = {1, 2, 3, 4};
        int rezult = Utils.searshIndex(arrTest, 10);
    }

}

