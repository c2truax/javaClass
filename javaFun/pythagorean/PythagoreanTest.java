public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pyth = new Pythagorean();
        Double hypotenuse = pyth.calculateHypotenuse(3,4);
        System.out.println(hypotenuse);
    }
}