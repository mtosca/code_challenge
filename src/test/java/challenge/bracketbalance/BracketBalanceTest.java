package challenge.bracketbalance;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketBalanceTest {

    @Test
    public void test_balanced() {

        String allBalanced = "[{()}]";
        String formulaBalanced = "(a+b-[c-d])";
        String nullText = null;
        String emptyText = "";

        assertTrue(BracketBalance.isBalanced(allBalanced));
        assertTrue(BracketBalance.isBalanced(formulaBalanced));
        assertTrue(BracketBalance.isBalanced(nullText));
        assertTrue(BracketBalance.isBalanced(emptyText));
    }

    @Test
    public void test_not_balanced() {

        String balancedButInverted = "][";
        String formulaNotBalanced = "{(a+b-[c-d])";
        String balancedButNotOrdered = "([)]";
        String onlyOpenBrackets = "[[";

        assertFalse(BracketBalance.isBalanced(balancedButInverted));
        assertFalse(BracketBalance.isBalanced(formulaNotBalanced));
        assertFalse(BracketBalance.isBalanced(balancedButNotOrdered));
        assertFalse(BracketBalance.isBalanced(onlyOpenBrackets));
    }
}
