public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        double addedSquares = (legA * legA) + (legB * legB);
        // calling the sqrt static method of the Math class
        double squareRoot = Math.sqrt(addedSquares);
        return squareRoot;
    }
}