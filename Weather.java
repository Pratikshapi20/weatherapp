package com.weatherapp.model;


//Model class
//This class stores weather data

public class Weather {

 private int id;
 private String city;
 private String description;
 private double temperature;

 // Constructor
 public Weather(int id, String city, String description, double temperature) {
     this.id = id;
     this.city = city;
     this.description = description;
     this.temperature = temperature;
 }

 // Getters
 public int getId() {
     return id;
 }

 public String getCity() {
     return city;
 }

 public String getDescription() {
     return description;
 }

 public double getTemperature() {
     return temperature;
 }

 // Setters
 public void setCity(String city) {
     this.city = city;
 }

 public void setDescription(String description) {
     this.description = description;
 }

 public void setTemperature(double temperature) {
     this.temperature = temperature;
 }

 // toString method (display data)
 @Override
 public String toString() {
     return "ID: " + id +
             " | City: " + city +
             " | Weather: " + description +
             " | Temp: " + temperature;
 }
}