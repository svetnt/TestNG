import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwoHappyPatch(){

        int [] arr=new int []{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n=12;
        int [][] expectedRezult=new int[][]{{3, 9}, {7, 5}};

        SumOfTwo sumOfTwo=new SumOfTwo();
        int [][] actualRezult=sumOfTwo.sumOfTwo(arr,n);

        Assert.assertEquals(expectedRezult,actualRezult);
    }
}
