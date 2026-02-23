package com.weatherapp.service;

import java.util.ArrayList;
import java.util.List;
import com.weatherapp.model.Weather;

// Service Layer
// Handles business logic and CRUD operations

public class WeatherService {

    private List<Weather> weatherList = new ArrayList<>();

    // CREATE
    public void addWeather(Weather weather) {
        weatherList.add(weather);
        System.out.println("Weather added successfully!");
    }

    // READ
    public List<Weather> getAllWeather() {
        return weatherList;
    }

    // UPDATE
    public void updateWeather(int id, String city, String desc, double temp) {
        for (Weather w : weatherList) {
            if (w.getId() == id) {
                w.setCity(city);
                w.setDescription(desc);
                w.setTemperature(temp);
                System.out.println("Weather updated successfully!");
                return;
            }
        }
        System.out.println("Weather ID not found!");
    }

    // DELETE
    public void deleteWeather(int id) {
        weatherList.removeIf(w -> w.getId() == id);
        System.out.println("Weather deleted successfully!");
    }
}