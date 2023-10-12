package uz.najottalim.jpapractica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.najottalim.jpapractica.domein.City;
import uz.najottalim.jpapractica.dto.request.CityRequestDto;
import uz.najottalim.jpapractica.dto.response.CityResponseDto;
import uz.najottalim.jpapractica.service.CityService;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {


    private final CityService cityService;


    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CityResponseDto>> getAll() {
        return cityService.findAll();
    }

    @GetMapping("/one/{id}")
    public ResponseEntity<City>getById(@PathVariable Long id) {
        return cityService.findById(id);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<City>delete(@PathVariable Long id) {
        return cityService.delete(id);
    }

    @PostMapping("/save")
    public ResponseEntity<CityResponseDto>save(@RequestBody CityRequestDto cityRequestDto) {
        return ResponseEntity.ok(cityService.save(cityRequestDto));
    }


}
