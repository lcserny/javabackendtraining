package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class AppConfig {

    @Bean
    UseCase myUseCase() {
        return new MyUseCase();
    }
}
