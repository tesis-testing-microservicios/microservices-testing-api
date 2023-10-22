package tesis.microservicestesting.api.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/example/")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ResponseEntity<ExampleDto> CreateExample(@RequestBody CreateExampleRequestDto createExampleRequestDto) {

        ExampleDto exampleDto = exampleService.CreateExample(createExampleRequestDto);

        return new ResponseEntity<>(exampleDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ExampleDto>> GetAllExamples() {

        List<ExampleDto> examples =  exampleService.GetAllExamples();

        return new ResponseEntity<>(examples, HttpStatus.OK);
    }
}
