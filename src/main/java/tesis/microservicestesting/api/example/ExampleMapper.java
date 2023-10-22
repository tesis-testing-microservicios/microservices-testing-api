package tesis.microservicestesting.api.example;

public class ExampleMapper {
    public static ExampleDto convertEntityToDto(Example example) {

        return new ExampleDto(
                example.getId(),
                example.getFirstName(),
                example.getLastName(),
                example.getAge());
    }
}
