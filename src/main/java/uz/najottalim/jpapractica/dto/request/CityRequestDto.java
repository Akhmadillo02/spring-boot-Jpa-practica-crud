package uz.najottalim.jpapractica.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CityRequestDto {


    String name;
    Long countryId;
}
