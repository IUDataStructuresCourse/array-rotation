import junit.framework.TestCase;
import java.util.Arrays;

public class MainTest extends TestCase {
    public void testRotate() throws Exception {
        {
            int[] A = {7,4,12,53,32};
            int[] A_shifted = {32,7,4,12,53};
            Main.rotate(A);
            assertTrue(Arrays.equals(A, A_shifted));
        }
    }

}