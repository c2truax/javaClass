import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pJ = new PuzzleJava();

        // 1
        Integer[] intArr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> numbers = pJ.taskOne(intArr);
        Integer sum = numbers.remove(numbers.size()-1);
        System.out.println("The sum is: " + sum);
        System.out.println("Numbers greater than 10: " + numbers);

        // 2
        
    }
}