package stubTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("console")
public class PositiveTests {

    @Test
    public void t1(){
        assertTrue(true);
    }

    @Test
    public void t2(){
        assertTrue(true);
    }

    @Test
    public void t3(){
        assertTrue(true);
    }
}
