package tesis.microservicestesting.api.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Example {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    public Example(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    protected Example() {
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s', age='%d']",
                id, firstName, lastName,age);
    }

}