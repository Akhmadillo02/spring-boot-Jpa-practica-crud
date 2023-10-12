package uz.najottalim.jpapractica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.jpapractica.domein.City;
import uz.najottalim.jpapractica.domein.Country;
import uz.najottalim.jpapractica.dto.request.CityRequestDto;
import uz.najottalim.jpapractica.dto.request.CountryRequestDto;
import uz.najottalim.jpapractica.dto.response.CityResponseDto;
import uz.najottalim.jpapractica.dto.response.CountryResponseDto;
import uz.najottalim.jpapractica.service.CountryService;
import uz.najottalim.jpapractica.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {


    private final CountryService countryService;


    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CountryResponseDto>> getAll() {
        return ResponseEntity.ok(countryService.findAll());
    }

    @GetMapping("/one/{id}")
    public ResponseEntity<Country>getById(@PathVariable Long id) {
        return ResponseEntity.ok(countryService.findById(id));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Country>delete(@PathVariable Long id) {
        return countryService.delete(id);
    }

    @PostMapping("/save")
    public ResponseEntity<CountryResponseDto>save(@RequestBody CountryRequestDto countryRequestDto) {
        return countryService.save(countryRequestDto);
    }


}
