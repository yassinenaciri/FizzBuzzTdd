import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzEngineTest {

    @Test
    public void shouldReturn1whenGiven1(){
        String result = FizzBuzzEngine.generate(1);
        Assert.assertEquals("1",result);
    }

    @Test
    public void shouldReturn12whenGiven2(){
        String result = FizzBuzzEngine.generate(2);
        Assert.assertEquals("12",result);
    }

    @Test
    public void shouldReturn12FizzwhenGiven3(){
        String result = FizzBuzzEngine.generate(3);
        Assert.assertEquals("12Fizz",result);
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzwhenGiven15(){
        String result = FizzBuzzEngine.generate(15);
        Assert.assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz",result);
    }
}
