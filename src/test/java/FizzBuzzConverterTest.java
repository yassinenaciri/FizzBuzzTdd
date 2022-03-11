import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void FizzBuzzshouldReturn1whenGiven1(){
        String result = FizzBuzzConverter.convert(1);
        Assert.assertEquals("1",result);
    }
}
