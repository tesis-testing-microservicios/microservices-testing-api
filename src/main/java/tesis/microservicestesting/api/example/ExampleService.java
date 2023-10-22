package tesis.microservicestesting.api.example;

import java.util.List;

public interface ExampleService {
    List<ExampleDto> GetAllExamples();
    ExampleDto CreateExample(CreateExampleRequestDto createExampleRequestDto);
}
