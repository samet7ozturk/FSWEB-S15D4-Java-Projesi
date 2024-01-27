import java.util.Locale;
import java.util.Stack;

public class CheckForPalindrome {
    public static boolean checkForPalindrome(String text) {
        System.out.println("initial text= " + text);
        text = text.replaceAll("[.,'?\\-\\s]", "").toLowerCase(Locale.ENGLISH);

        Stack<Character> stackOriginal = new Stack<>();
        Stack<Character> stackTemp = new Stack<>();
        Stack<Character> stackReversed = new Stack<>();

        char[] chars = text.toCharArray();
        for (char c : chars) {
            stackOriginal.push(c);
            stackTemp.push(c);
        }

        for (char c : chars) {
            Character charTemp = stackTemp.pop();
            stackReversed.push(charTemp);
        }

        System.out.println("reversed=" + stackReversed);
        System.out.println("original=" + stackOriginal);

        if (stackOriginal.equals(stackReversed)) {
            return true;
        }
        return false;
    }
}
