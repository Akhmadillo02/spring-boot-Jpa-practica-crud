package uz.najottalim.jpapractica.domein;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
     String name;

    @OneToMany(mappedBy = "country")
    List<City> cities;

    public void addCities(City city) {
        if (this.cities == null) {
            this.cities = new ArrayList<>();
        }
        this.cities.add(city);
    }

}
