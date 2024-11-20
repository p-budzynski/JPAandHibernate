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
public class Shop {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String industry;

    public Shop(String name, String address, String phoneNumber, String industry) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.industry = industry;
    }
}
