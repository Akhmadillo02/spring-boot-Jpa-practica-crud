package uz.najottalim.jpapractica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.najottalim.jpapractica.domein.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
