import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DecimalToBinarySearch {
    public static LinkedList<Integer> decimalToBinary(int number) {
        Stack<Integer> reminderStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while (number > 0) {
            int reminder = number % 2;
            reminderStack.push(reminder);
            number = number / 2;
        }

        Iterator<Integer> iterator = reminderStack.iterator();
        while (iterator.hasNext()) {
            Integer binaryNumber = iterator.next();
            result.push(binaryNumber);
        }
        return result;
    }
}