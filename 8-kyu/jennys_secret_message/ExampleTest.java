package jennys_secret_message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    @Test
    public void Test() {
        assertEquals( "Hello, Jim!", Greeter.greet("Jim"));
        assertEquals( "Hello, Jane!", Greeter.greet("Jane"));
        assertEquals( "Hello, Simon!", Greeter.greet("Simon"));
        assertEquals( "Hello, my love!", Greeter.greet("Johnny"));
    }
}
