public class FizzBuzzConverter {
    public static String convert(int i) {
        if (i%3 == 0) return "Fizz" ;
        if (i %5 ==  0) return "Buzz";
        return (""+i);
    }
}
