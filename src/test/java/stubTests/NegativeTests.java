package stubTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("console")
public class NegativeTests {

    @Test
    public void t1(){
        assertTrue(false);
    }

    @Test
    public void t2(){
        assertTrue(false);
    }

    @Test
    public void t3(){
        assertTrue(false);
    }
}
