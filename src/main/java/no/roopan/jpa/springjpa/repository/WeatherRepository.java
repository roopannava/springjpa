package no.roopan.jpa.springjpa.repository;

import no.roopan.jpa.springjpa.domain.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather,Integer> {
}
