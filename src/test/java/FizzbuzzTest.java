import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {


    @Test
    public void fizzTestMethod() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(15);
        Assert.assertEquals("FIZZ", fizzBuzz.fizzBuzz(3));


    }

    public static void main(String[] args) {

    }
}