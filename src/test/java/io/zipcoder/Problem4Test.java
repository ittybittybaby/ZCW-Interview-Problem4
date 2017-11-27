package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem4Test {

    Problem4 problem4;

    @Before
    public void setup() {
        problem4 = new Problem4();
    }


    @Test
    public void canBePalindrome_YES() {
        String input = "aaabbbb";

        String expected = "YES";
        String actual = problem4.canBePalindrome(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canBePalindrome_NO() {
        String input = "cdefghmnopqrstuvw";

        String expected = "NO";
        String actual = problem4.canBePalindrome(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void canBePalindrome_ANOTHERONE() {
        String input = "ayyylmao";

        String expected = "NO";
        String actual = problem4.canBePalindrome(input);

        Assert.assertEquals(expected, actual);
    }
}
