import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    @DisplayName("Test method return value")
    void method() {
        assertEquals("Tansu", HelloWorld.method());
    }

}