package tesis.microservicestesting.api.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExampleDto {
    private Long id;
    private String firstName;
    private String lastName;
}
