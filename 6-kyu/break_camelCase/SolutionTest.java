package break_camelCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void tests() {
        assertEquals( "camel Casing", Solution.camelCase("camelCasing"));
        assertEquals( "camel Casing Test", Solution.camelCase("camelCasingTest"));
        assertEquals( "camelcasingtest", Solution.camelCase("camelcasingtest"));
    }
}
