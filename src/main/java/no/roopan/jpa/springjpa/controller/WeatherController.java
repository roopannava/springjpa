package no.roopan.jpa.springjpa.controller;

import no.roopan.jpa.springjpa.domain.Weather;
import no.roopan.jpa.springjpa.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "rest")
public class WeatherController {


    @Autowired
    private WeatherRepository weatherRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody  String addNewWeatherLocation (@RequestParam String location
            , @RequestParam String country,@RequestParam String degree) {

        Weather weather = new Weather();
        weather.setLocation(location);
        weather.setCountry(country);
        weather.setDegree(degree);
        weatherRepository.save(weather);
        return "Saved";
    }



    @GetMapping(path="/info")
    @ResponseBody
    public  Iterable<Weather> getAllWeatherInfo() {
        // This returns a JSON or XML with the users
        return weatherRepository.findAll();
    }
}
