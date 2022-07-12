import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void fizzStringTest() {
        String input = "foo";
        String result = fizzBuzz.fizzBuzzString(input);
        assertEquals("Fizz", result);
    }

    @Test
    void buzzStringTest() {
        String input = "knob";
        String result = fizzBuzz.fizzBuzzString(input);
        assertEquals("Buzz", result);
    }

    @Test
    void fizzBuzzStringTest() {
        String input = "fooBob";
        String result = fizzBuzz.fizzBuzzString(input);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void inputNullTest() {
        String result = fizzBuzz.fizzBuzzString(null);
        assertNull(result);
    }

}