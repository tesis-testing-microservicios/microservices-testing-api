package tesis.microservicestesting.api.example;

import java.util.List;

public interface ExampleService {
    public List<ExampleDto> GetAllExamples();
    public ExampleDto CreateExample(CreateExampleRequestDto createExampleRequestDto);
}
