import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testAdd() {
        assertEquals(3, HelloWorld.add(1,2));
    }
}