package main;

import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
class MySecondUseCase implements UseCase {

    private static final Logger LOGGER = Logger.getLogger(MySecondUseCase.class.getSimpleName());

    @Override
    public void saySomething() {
        LOGGER.log(Level.INFO, "Another Hello");
    }
}
