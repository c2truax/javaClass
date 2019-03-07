import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava pJ = new PuzzleJava();

        // 1
        Integer[] intArr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Object> numbers = pJ.taskOne(intArr);
        System.out.println(numbers[0]);
        for (int i=0; i < numbers[1].length; i++) {
            System.out.println(numbers[1][i]);
        }
    }
}