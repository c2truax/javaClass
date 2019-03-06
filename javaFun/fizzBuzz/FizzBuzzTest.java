public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fB = new FizzBuzz();
        String fizzBuzz1 = fB.fizzBuzz(3);
        System.out.println(fizzBuzz1);
        String fizzBuzz2 = fB.fizzBuzz(5);
        System.out.println(fizzBuzz2);
        String fizzBuzz3 = fB.fizzBuzz(15);
        System.out.println(fizzBuzz3);
        String fizzBuzz4 = fB.fizzBuzz(2);
        System.out.println(fizzBuzz4);
    }
}