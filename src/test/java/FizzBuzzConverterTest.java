import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void FizzBuzzshouldReturn1whenGiven1(){
        String result = FizzBuzzConverter.lister(1);
        Assert.assertEquals("1",result);
    }

    @Test
    public void FizzBuzzshouldReturn2whenGiven2(){
        String result = FizzBuzzConverter.lister(2);
        Assert.assertEquals("2",result);
    }
}
