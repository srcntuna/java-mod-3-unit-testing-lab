import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
     void inputStartsWithF() {
        String input = "foo";
        String result = fizzBuzz.fizzBuzzString(input);
        assertEquals("Fizz",result);
    }

    @Test
    void inputEndsWithB(){
        String input = "knob";
        String result = fizzBuzz.fizzBuzzString(input);
        assertEquals("Buzz",result);
    }

    @Test
    void inputStartWithFAndEndsWithB(){
        String input = "fooBob";
        String result = fizzBuzz.fizzBuzzString(input);
        assertEquals("FizzBuzz",result);
    }

    @Test
    void inputNull(){
        String result = fizzBuzz.fizzBuzzString(null);
        assertEquals(null,result);
    }

}