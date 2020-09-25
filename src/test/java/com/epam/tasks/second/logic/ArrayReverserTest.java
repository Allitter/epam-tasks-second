package com.epam.tasks.second.logic;

import com.epam.tasks.second.exceptions.IncorrectArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class ArrayReverserTest {
    ArrayReverser arrayReverser = new ArrayReverser();

    @Test
    public void testReversePositive() throws IncorrectArgumentException {
        String[] input = {"1", "2", "3", "4"};
        String[] expected = {"4", "3", "2", "1"};

        String[] actual = arrayReverser.reverse(input);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseWithZeroSizeArray() throws IncorrectArgumentException {
        String[] input = new String[0];
        String[] actual = arrayReverser.reverse(input);

        Assert.assertArrayEquals(input, actual);
    }

    @Test(expected = IncorrectArgumentException.class)
    public void testReverseWithNULL() throws IncorrectArgumentException {
        arrayReverser.reverse(null);
    }
}
