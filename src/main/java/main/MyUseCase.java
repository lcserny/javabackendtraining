package main;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyUseCase implements UseCase {

    private static final Logger LOGGER = Logger.getLogger(MyUseCase.class.getSimpleName());

    @Override
    public void saySomething() {
        LOGGER.log(Level.INFO, "Hello");
    }
}
