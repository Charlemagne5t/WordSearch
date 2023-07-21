import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void existTest1(){
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean actual = new Solution().exist(board, word);

        Assert.assertTrue(actual);
    }

    @Test
    public void existTest2(){
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        boolean actual = new Solution().exist(board, word);

        Assert.assertTrue(actual);
    }
    @Test
    public void existTest3(){
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCB";
        boolean actual = new Solution().exist(board, word);

        Assert.assertFalse(actual);
    }
}
