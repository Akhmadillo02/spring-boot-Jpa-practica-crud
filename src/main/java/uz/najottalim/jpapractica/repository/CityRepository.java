package uz.najottalim.jpapractica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.jpapractica.domein.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
