public class Main {
    public static void main(String[] args) {
        CheckForPalindrome checker = new CheckForPalindrome();

        System.out.println(checker.checkForPalindrome("abccba"));
        System.out.println(checker.checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checker.checkForPalindrome("I did, did I?"));
        System.out.println(checker.checkForPalindrome("hello"));
        System.out.println(checker.checkForPalindrome("Don't node"));

        
        DecimalToBinarySearch checkerDecimal = new DecimalToBinarySearch();

        System.out.println(checkerDecimal.decimalToBinary(5));
        System.out.println(checkerDecimal.decimalToBinary(6));
        System.out.println(checkerDecimal.decimalToBinary(11));

    }
}