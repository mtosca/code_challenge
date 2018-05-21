package challenge.bracketbalance;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BracketBalance {

    /*
     * Initialize Map with supported values.
     * The key is the opening bracket and the value is de closing one.
     */
    private static final Map BRACKETS_MAP = Collections.unmodifiableMap(Stream.of(

            new AbstractMap.SimpleEntry<>('{', '}'),
            new AbstractMap.SimpleEntry<>('(', ')'),
            new AbstractMap.SimpleEntry<>('[', ']')

    ).collect(Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())));

    /**
     * Returns true if the brackets inside the text are balanced.
     * Examples:
     * "[{()}]"      returns true
     * "]["          returns false
     * "(a+b-[c-d])" returns true
     * "([)]"        returns false
     *
     * @param text
     * @return
     */
    public static boolean isBalanced(String text) {

        if (text == null) {
            return true;
        }

        boolean balanced = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length() && balanced; i++) {

            char c = text.charAt(i);

            if (isOpeningBracket(c)) {
                stack.push(c);
            }

            if (!stack.isEmpty() && isClosingBracket(c)) {
                // if last pushed does not match brakes the iteration
                balanced = matches(stack.pop(), c);
            }
        }

        return balanced && stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return BRACKETS_MAP.keySet().contains(c);
    }

    private static boolean isClosingBracket(char c) {
        return BRACKETS_MAP.values().contains(c);
    }

    private static boolean matches(char open, char closes) {
        return (Character) BRACKETS_MAP.get(open) == closes;
    }
}
