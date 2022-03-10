public class FizzBuzzConverter {
    public static String lister(int i) {
        if (i%3 == 0) return "Fizz" ;
        if (i == 5) return "Buzz";
        return (""+i);
    }
}
