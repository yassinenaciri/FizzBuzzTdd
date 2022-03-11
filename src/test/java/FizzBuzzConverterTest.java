import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzConverterTest {
    @Test
    public void FizzBuzzshouldReturn1whenGiven1(){
        String result = FizzBuzzConverter.convert(1);
        Assert.assertEquals("1",result);
    }


    @Test
    public void FizzBuzzshouldReturn2whenGiven2(){
        String result = FizzBuzzConverter.convert(2);
        Assert.assertEquals("2",result);
    }


    @Test
    public void FizzBuzzshouldReturnFizzwhenGiven3(){
        String result = FizzBuzzConverter.convert(3);
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void FizzBuzzshouldReturnFizzwhenGiven6(){
        String result = FizzBuzzConverter.convert(3);
        Assert.assertEquals("Fizz",result);
    }

    @Test
    public void FizzBuzzshouldReturnBuzzwhenGiven5(){
        String result = FizzBuzzConverter.convert(5);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void FizzBuzzshouldReturnBuzzwhenGiven10(){
        String result = FizzBuzzConverter.convert(10);
        Assert.assertEquals("Buzz",result);
    }

    @Test
    public void FizzBuzzshouldReturnFizzBuzzwhenGiven15(){
        String result = FizzBuzzConverter.convert(15);
        Assert.assertEquals("FizzBuzz",result);
    }

    @Test
    public void FizzBuzzshouldReturnFizzBuzzwhenGiven30(){
        String result = FizzBuzzConverter.convert(30);
        Assert.assertEquals("FizzBuzz",result);
    }

}
