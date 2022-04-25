import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativOnTheRightTest {

    @Test
    public void testNegativOnTheRightHappyPatch() {

        int[] arr = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedRezult = new int[]{4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualRezult = negativeOnTheRight.negativeOnTheRight(arr);

        Assert.assertEquals(expectedRezult, actualRezult);
    }

}
