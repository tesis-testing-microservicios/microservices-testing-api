package tesis.microservicestesting.api.example;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class ExampleServiceImplementation implements ExampleService {
    private final ExampleRepository exampleRepository;
    private final ModelMapper modelMapper;

    public ExampleServiceImplementation(
            ExampleRepository exampleRepository,
            ModelMapper modelMapper) {
        this.exampleRepository = exampleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ExampleDto> GetAllExamples() {
       List<Example> examples = exampleRepository.findAll();
        Type listType = new TypeToken<List<ExampleDto>>(){}.getType();

       return modelMapper.map(examples, listType);
    }

    @Override
    public ExampleDto CreateExample(CreateExampleRequestDto createExampleRequestDto) {

        Example example =  new Example(createExampleRequestDto.getFirstName(), createExampleRequestDto.getLastName());

        exampleRepository.save(example);

        return modelMapper.map(example, ExampleDto.class);
    }
}
