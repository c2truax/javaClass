public class FizzBuzz {
    public String fizzBuzz(int number) {
        String fizzyBuzzy;
        if ((number % 3) == 0 && (number % 5) == 0) {
            fizzyBuzzy = "FizzBuzz";
        }
        else if ((number % 3) == 0) {
            fizzyBuzzy = "Fizz";
        }
        else if ((number % 5) == 0) {
            fizzyBuzzy = "Buzz";
        }
        else {
            fizzyBuzzy = String.valueOf(number);
        }
        return fizzyBuzzy;
    }
}