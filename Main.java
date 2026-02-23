package com.weatherapp;
import com.weatherapp.controller.WeatherController;

// Main class
// Program starts here

public class Main {

    public static void main(String[] args) {

        WeatherController controller = new WeatherController();
        controller.showMenu();
    }
}
