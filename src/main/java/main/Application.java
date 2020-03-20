package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getSimpleName());

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UseCase myUseCase = context.getBean(UseCase.class);
        myUseCase.saySomething();

        long end = System.currentTimeMillis();
        LOGGER.log(Level.INFO, "Took millis: {0}", end - start);
    }
}
