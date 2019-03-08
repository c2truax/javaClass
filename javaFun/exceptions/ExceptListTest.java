import java.util.ArrayList;

public class ExceptListTest {
    public static void main(String[] args) {
        ExceptList eL = new ExceptList();
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        ArrayList<Integer> numbers = eL.exceptions(myList);
        System.out.println(numbers);
    }
}