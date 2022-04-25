import org.testng.Assert;
import org.testng.annotations.Test;

public class KthlLargestTest {

    @Test
    public void testKthlLargestHappyPatch() {

        int[] arr = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedRezult = 9;

        KthLargest kthLargest = new KthLargest();
        int actualRezult = kthLargest.kthLargest(arr, k);

        Assert.assertEquals(expectedRezult, actualRezult);
    }

    @Test
    public void testKthlLargestNegativInd() {

        int[] arr = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = -1;
        int expectedRezult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualRezult = kthLargest.kthLargest(arr, k);

        Assert.assertEquals(expectedRezult, actualRezult);
    }

    @Test
    public void testKthlLargestNullArrLength() {

        int[] arr = new int[]{};
        int k = 2;
        int expectedRezult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualRezult = kthLargest.kthLargest(arr, k);

        Assert.assertEquals(expectedRezult, actualRezult);
    }
}
