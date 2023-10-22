package tesis.microservicestesting.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

//    @Bean
//    public ModelMapper modelMapper(){
//        return new ModelMapper();
//    }
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
