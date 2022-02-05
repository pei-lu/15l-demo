import static org.junit.Assert.*;
import org.junit.*;

public class PairTest {
    @Test
    public void oneLessThantwo(){
        assertTrue("one should be less than 2", Pair.less(1, 2));
    }
}
