public class FizzBuzzEngine {
    public static String generate(int i) {
        String result ="";
        for (int j =1 ; j<=i ; j++){
            result+=FizzBuzzConverter.convert(j);
        }
        return result;
    }
}
