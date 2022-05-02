import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void sequentialAdd(){
        assertEquals(3, SkillDemo.sequentialAdd(2));
    }
}
