package com.epam.tasks.second.view;

import java.util.Arrays;

public class ConsoleOutputService implements OutputService {

    public void print(String text) {
        System.out.print(text);
    }

    public void print(String[] strings) {
        String result = Arrays.toString(strings);
        System.out.print(result);
    }

}
