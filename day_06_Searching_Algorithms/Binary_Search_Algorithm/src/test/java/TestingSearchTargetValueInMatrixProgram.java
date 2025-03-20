import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import searchtargetvalueinmatrix.SearchTargetValueInMatrix;

public class TestingSearchTargetValueInMatrixProgram
{
    @Test
    void f1()
    {
        int[][] matrix = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12} };
        SearchTargetValueInMatrix obj = new SearchTargetValueInMatrix();
        Assertions.assertEquals(true,obj.searchInMatrix(matrix,5));
    }
}
