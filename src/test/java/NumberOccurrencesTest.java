import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOccurrencesTest {

    @Test
    public void testNumberOccurrencesHappyPatch(){

        int [] arr=new int []{3,2,5,3,1,5,4,2,1,4,5,3,2,1,4,5,3,2,1};
        int [][] expectedRezult=new int [][] {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences numberOccurrences=new NumberOccurrences();
        int [][] actualRezult=numberOccurrences.numberOccurrences(arr);

        Assert.assertEquals(expectedRezult,actualRezult);
    }
}
