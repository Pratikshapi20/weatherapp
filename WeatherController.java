package com.weatherapp.controller;

import java.util.Scanner;
import com.weatherapp.model.Weather;
import com.weatherapp.service.WeatherService;

// Controller Layer
// Handles user input and menu

public class WeatherController {

    private WeatherService service = new WeatherService();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {

        while (true) {

            System.out.println("\n===== Weather App Menu =====");
            System.out.println("1. Add Weather");
            System.out.println("2. View All Weather");
            System.out.println("3. Update Weather");
            System.out.println("4. Delete Weather");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addWeather();
                    break;

                case 2:
                    viewAll();
                    break;

                case 3:
                    updateWeather();
                    break;

                case 4:
                    deleteWeather();
                    break;

                case 5:
                    System.out.println("Thank you for using Weather App!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void addWeather() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter Temperature: ");
        double temp = scanner.nextDouble();

        Weather weather = new Weather(id, city, desc, temp);
        service.addWeather(weather);
    }

    private void viewAll() {
        for (Weather w : service.getAllWeather()) {
            System.out.println(w);
        }
    }

    private void updateWeather() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter New City: ");
        String city = scanner.nextLine();

        System.out.print("Enter New Description: ");
        String desc = scanner.nextLine();

        System.out.print("Enter New Temperature: ");
        double temp = scanner.nextDouble();

        service.updateWeather(id, city, desc, temp);
    }

    private void deleteWeather() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        service.deleteWeather(id);
    }
}