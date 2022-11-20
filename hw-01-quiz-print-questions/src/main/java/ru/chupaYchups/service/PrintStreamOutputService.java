package ru.chupaYchups.service;

import lombok.Data;

import java.io.PrintStream;

@Data
public class PrintStreamOutputService implements OutputService {

    private final PrintStream printStream;

    @Override
    public void outputLine(String string) {
        printStream.println(string);
    }
}
