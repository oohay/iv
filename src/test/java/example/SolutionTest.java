package example;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        solution.computeCollectionSizes();
        solution.collectionSizeDescending();
    }
}
