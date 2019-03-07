import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class PuzzleJava {
    public ArrayList<Object> taskOne(Integer[] intArr) {
        ArrayList<Object> ans = new ArrayList<Object>();
        int sum = 0;
        ArrayList<Integer> overArr = new ArrayList<Integer>();
        for (int i=0; i < intArr.length; i++) {
            sum += intArr[i];
            if (intArr[i] > 10) {
                overArr.add(intArr[i]);
            }
        }
        ans.add(sum);
        ans.add(overArr);
        return ans;
    }
}