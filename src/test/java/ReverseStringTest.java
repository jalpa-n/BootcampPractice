import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest{
    @Test
    public void reverseStringMethod() {
        ReverseString reverseString = new ReverseString();
        reverseString.ReverseString("Test");
        //Assert.assertEquals("tesT","Test");

    }
}