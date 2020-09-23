package com.epam.tasks.second.view;

import java.io.OutputStream;

public class MockOutputStream extends OutputStream {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void write(int b) {
        stringBuilder.append((char)b);
    }

    public String getContent() {
        return stringBuilder.toString();
    }

    public void reset() {
        stringBuilder.setLength(0);
    }
}
