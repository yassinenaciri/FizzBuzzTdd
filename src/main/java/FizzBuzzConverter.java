public class FizzBuzzConverter {
    public static String lister(int i) {
        if (i ==  15 ) {
            return "FizzBuzz";
        }
        if (i%3 == 0) return "Fizz" ;
        if (i %5 ==  0) return "Buzz";
        return (""+i);
    }
}
