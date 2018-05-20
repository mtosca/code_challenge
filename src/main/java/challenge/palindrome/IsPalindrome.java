package challenge.palindrome;

import java.util.Arrays;
import java.util.List;

public final class IsPalindrome {

    /**
     * Returns true if the text is a Palindrome using a recursive solution
     * <p>
     * "homeemoh" -> true
     * "homenemoh" -> true
     * "homeamoh" -> false
     * "h" -> true
     * null -> true
     *
     * @param text
     * @return
     */
    public static boolean recursiveCheck(String text) {

        // exit true with null, empty string or one char string
        if (text == null || text.length() <= 1) {
            return true;
        }

        int lastIndex = text.length() - 1;

        // stop recursive calls
        if (text.charAt(0) != text.charAt(lastIndex)) {
            return false;
        }

        return recursiveCheck(text.substring(1, lastIndex));
    }

    /**
     * Returns true if the text is a Palindrome using a non-recursive solution
     * <p>
     * "homeemoh" -> true
     * "homenemoh" -> true
     * "homeamoh" -> false
     * "h" -> true
     * null -> true
     *
     * @param text
     * @return
     */
    public static boolean check(String text) {

        // exit true with null, empty string or one char string
        if (text == null || text.length() <= 1) {
            return true;
        }

        List<String> splitText = splitInHalf(text);

        String reverse = new StringBuilder(splitText.get(1)).reverse().toString();

        return splitText.get(0).equals(reverse);
    }

    private static final List<String> splitInHalf(String text) {

        int length = text.length();

        Integer midIndex = Math.floorDiv(length, 2);
        String secondHalf = text.substring(midIndex);
        String firstHalf = text.substring(0, midIndex + length % 2);

        return Arrays.asList(firstHalf, secondHalf);
    }
}
