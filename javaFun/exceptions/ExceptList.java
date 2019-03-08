import java.util.ArrayList;




public class ExceptList {
    public ArrayList<Integer> exceptions(ArrayList<Object> myList) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < myList.size(); i++) {
            try {
            Integer castedValue = (Integer) myList.get(i);
            ans.add(castedValue);
            }
            catch (ClassCastException e){
                System.out.println("This item is not an Integer!");
            }
        }
        return ans;
    }
}