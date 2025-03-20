import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static datastructuresearching.ComparingDifferentDataStructureSearching.*;

// Creating class TestingComparingDifferentDataStructureSearchingProgram to test our program whether it's working properly or not
public class TestingComparingDifferentDataStructureSearchingProgram
{
    @Test
    void f()
    {
        int[] arr = new int[1000000];
        // Adding elements into array
        for (int i = 0; i < 1000000; i++)
        {
            arr[i] = i;
        }

        // Adding elements into HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 1000000; i++)
        {
            hashSet.add(i);
        }
        // Adding elements into TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 1000000; i++)
        {
            treeSet.add(i);
        }

        searchInArray(arr, 69955);
        searchInHashSet(hashSet, 69955);
        searchInTreeSet(treeSet, 69955);
    }
}
