package com.epam.tasks.second.view;

import org.junit.*;
import java.io.PrintStream;
import java.util.Arrays;

public class ConsoleOutputServiceTest {
    private static final String INPUT_MESSAGE = "input message";
    private static final String[] STRINGS = {"str1", "str2", "str3"};
    public static final String STRING_NULL = "null";
    private static String notInitializedString;
    private ConsoleOutputService outputService = new ConsoleOutputService();
    private static PrintStream outputStream;
    private static MockOutputStream mockOutputStream = new MockOutputStream();

    @BeforeClass
    public static void toDoBeforeAllTests() {
        outputStream = System.out;
        System.setOut(new PrintStream(mockOutputStream));
    }

    @AfterClass
    public static void toDoAfterAllTests() {
        System.setOut(outputStream);
    }

    @Before
    public void toDoBeforeTest() {
        mockOutputStream.reset();
    }

    @Test
    public void printWithString() {
        outputService.print(INPUT_MESSAGE);
        String actual = mockOutputStream.getContent();

        Assert.assertEquals(INPUT_MESSAGE, actual);
    }

    @Test
    public void printWithStringsArray() {
        outputService.print(STRINGS);
        String expected = Arrays.toString(STRINGS);

        String actual = mockOutputStream.getContent();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printWithNULL() {
        outputService.print(notInitializedString);
        String expected = STRING_NULL;

        String actual = mockOutputStream.getContent();

        Assert.assertEquals(expected, actual);
    }

}
