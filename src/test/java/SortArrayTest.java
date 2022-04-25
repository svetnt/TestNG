import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test
    public void testSortArrayHappyPatch(){

        int [] arr=new int []{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedRezult=new int[]{2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArray=new SortArray();
        int [] actualRezult=sortArray.sortArray(arr);

        Assert.assertEquals(expectedRezult,actualRezult);
    }

    @Test
    public void testSortArrayNull(){

        int [] arr=new int []{};
        int [] expectedRezult=new int[]{};

        SortArray sortArray=new SortArray();
        int [] actualRezult=sortArray.sortArray(arr);

        Assert.assertEquals(expectedRezult,actualRezult);
    }


}
