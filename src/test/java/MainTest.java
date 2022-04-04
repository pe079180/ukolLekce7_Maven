import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMultiplyOk() {
        Main main = new Main();
        assertEquals(28, Main.multiply(7, 4));
    }

// @Test
//    public void testMultiplyFail() {
//     Main main = new Main();
//     assertEquals(356, Main.multiply(7, 5));
//
//    }

}
