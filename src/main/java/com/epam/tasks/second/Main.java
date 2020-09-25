package com.epam.tasks.second;

// TODO Создать приложение, которое отображает в окне консоли аргументы
//  командной строки метода main() в обратном порядке.

import com.epam.tasks.second.exceptions.FactoryNotExistsException;
import com.epam.tasks.second.exceptions.IncorrectArgumentException;
import com.epam.tasks.second.logic.ArrayReverser;
import com.epam.tasks.second.view.OutputService;
import com.epam.tasks.second.view.OutputServiceFactory;

public class Main {

    public static void main(String[] args) throws IncorrectArgumentException, FactoryNotExistsException {
        ArrayReverser arrayReverser = new ArrayReverser();
        String[] reversed = arrayReverser.reverse(args);

        OutputService outputService = OutputServiceFactory.getOutputService("console");
        outputService.print(reversed);
    }

}
