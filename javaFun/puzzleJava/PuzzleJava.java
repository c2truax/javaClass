import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {
    public ArrayList<Integer> taskOne(Integer[] intArr) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int sum = 0;
        for (int i=0; i < intArr.length; i++) {
            sum += intArr[i];
            if (intArr[i] > 10) {
                ans.add(intArr[i]);
            }
        }
        ans.add(sum);
        return ans;
    }
    
}