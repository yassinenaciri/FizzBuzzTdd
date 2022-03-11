import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzEngineTest {

    @Test
    public void shouldReturn1whenGiven1(){
        String result = FizzBuzzEngine.generate(1);
        Assert.assertEquals("1",result);
    }
}
