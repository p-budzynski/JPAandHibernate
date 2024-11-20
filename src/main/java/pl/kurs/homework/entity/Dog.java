package pl.kurs.homework.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dog {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String breed;
    private Integer age;
    private Double weight;
    private String color;
    private Boolean isVaccinated;
    private Boolean isNeutered;
    private Boolean isMale;

    public Dog(String name, String breed, Integer age, Double weight, String color, Boolean isVaccinated, Boolean isNeutered, Boolean isMale) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.isVaccinated = isVaccinated;
        this.isNeutered = isNeutered;
        this.isMale = isMale;
    }
}
