package com.epam.tasks.second.logic;

import com.epam.tasks.second.exceptions.IncorrectArgumentException;

public class ArrayReverser {

    public String[] reverse(String[] array) throws IncorrectArgumentException {
        if (array == null) {
            throw new IncorrectArgumentException("Array can't be null");
        }

        String[] result = new String[array.length];
        int length = array.length;

        for (int i = 0; i < length; i++) {
            result[i] = array[length - i - 1];
        }

        return result;
    }

}
