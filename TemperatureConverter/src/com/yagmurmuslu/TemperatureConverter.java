package com.yagmurmuslu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {

    private final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        TemperatureConverter main = new TemperatureConverter();
        main.run();
    }

    public void run(){
        String[] temperatureNames = new String [] {"Fahrenheit", "Celsius", "Kelvin", "Rankine", "Réaumur"};

        // Taking a list area
        for(int i = 0; i < temperatureNames.length; i++){
            System.out.println(i + 1 + "- " + temperatureNames[i]);
        }
        // User put in input area
        System.out.print("Please, choose your temperature unit: ");
        int temperatureUnit = 0;
        try {
            temperatureUnit = userInput.nextInt();
        }
        catch (InputMismatchException exception){
            System.out.println("Invalid input. Please, enter a number.");
            return;
        }
        if(temperatureUnit < 1 || temperatureUnit > 5){
            System.out.println("Invalid selection. Please, select a number between 1 and 5!");
            return;
        }

        // User put in temperature area
        System.out.print("Please, type temperature: ");
        double temperatureNumber = 0;
        try {
            temperatureNumber = userInput.nextDouble();
        }
        catch (InputMismatchException exception){
            System.out.println("Invalid input. Please, enter a number.");
            return;
        }
        for(int i = 0; i < temperatureNames.length; i++){
            if (temperatureUnit != i +1){
                System.out.println(i + 1 + "- " + temperatureNames[i]);
            }
        }

        // User chose destination temperature area
        System.out.print("Please, choose your looking temperature unit: ");
        int temperatureSecondUnit = 0;
        try {
            temperatureSecondUnit = userInput.nextInt();
        }
        catch (InputMismatchException exception){
            System.out.println("Invalid input. Please, enter a number.");
            return;
        }
        if(temperatureSecondUnit < 1 || temperatureSecondUnit > 5 || temperatureUnit == temperatureSecondUnit){
            System.out.println("Invalid selection. Please, select a number between 1 and 5 except " + temperatureUnit + "!");
            return;
        }

        // All temperature type name and result
        String temperatureType = "";
        switch (temperatureSecondUnit){
            case 1:
                temperatureType = "Fahrenheit";
                break;
            case 2:
                temperatureType = "Celsius";
                break;
            case 3:
                temperatureType = "Kelvin";
                break;
            case 4:
                temperatureType = "Rankine";
                break;
            case 5:
                temperatureType = "Réaumur";
                break;
        }

        System.out.println(temperatureType + ": " + String.format("%.2f", temperatureTranslate(temperatureUnit, temperatureSecondUnit ,temperatureNumber)) );

    }

    // Temperature formula
    public double temperatureTranslate(int temperatureUnit, int temperatureSecondUnit, double temperatureNumber){
        double result =0;
        // From Fahrenheit to Celsius
        if(temperatureUnit == 1 && temperatureSecondUnit == 2){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber - 32) / 1.8));
        }
        // From Fahrenheit to Kelvin
        if(temperatureUnit == 1 && temperatureSecondUnit == 3){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber + 459.67) /1.8));
        }
        // From Fahrenheit to Rankine
        if(temperatureUnit == 1 && temperatureSecondUnit == 4){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber + 459.67));
        }
        // From Fahrenheit to Réaumur
        if(temperatureUnit == 1 && temperatureSecondUnit == 5){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber - 32) / 2.25));
        }
        // From Celsius to Fahrenheit
        if(temperatureUnit == 2 && temperatureSecondUnit == 1){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber * 1.8) + 32));
        }
        // From Celsius to Kelvin
        if(temperatureUnit == 2 && temperatureSecondUnit == 3){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber +273.15));
        }
        // From Celsius to Rankine
        if(temperatureUnit == 2 && temperatureSecondUnit == 4){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber * 1.8) + 32 + 459.67));
        }
        // From Celsius to Réaumur
        if(temperatureUnit == 2 && temperatureSecondUnit == 5){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber * 0.8));
        }

        // From Kelvin to Fahrenheit
        if(temperatureUnit == 3 && temperatureSecondUnit == 1){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber * 1.8) - 459.67));
        }
        // From Kelvin to Celsius
        if(temperatureUnit == 3 && temperatureSecondUnit == 2){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber - 273.15));
        }
        // From Kelvin to Rankine
        if(temperatureUnit == 3 && temperatureSecondUnit == 4){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber * 1.8));
        }
        // From Kelvin to Réaumur
        if(temperatureUnit == 3 && temperatureSecondUnit == 5){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber - 273.15) * 0.8));
        }

        // From Rankine to Fahrenheit
        if(temperatureUnit == 4 && temperatureSecondUnit == 1){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber - 459.67));
        }
        // From Rankine to Kelvin
        if(temperatureUnit == 4 && temperatureSecondUnit == 3){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber / 1.8));
        }
        // From Rankine to Celsius
        if(temperatureUnit == 4 && temperatureSecondUnit == 2){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber - 32 - 459.67) / 1.8));
        }
        // From Rankine to Réaumur
        if(temperatureUnit == 4 && temperatureSecondUnit == 5){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber - 32 - 459.67) / 2.25));
        }

        // From Réaumur to Fahrenheit
        if(temperatureUnit == 5 && temperatureSecondUnit == 1){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber * 2.25) + 32));
        }
        // From Réaumur to Kelvin
        if(temperatureUnit == 5 && temperatureSecondUnit == 3){
            result = (temperatureNumber * 1.25) + 273.15;
        }
        // From Réaumur to Rankine
        if(temperatureUnit == 5 && temperatureSecondUnit == 4){
            result = Double.parseDouble(String.format("%.2f",(temperatureNumber * 2.25) + 32 + 459.67));
        }
        // From Réaumur to Celsius
        if(temperatureUnit == 5 && temperatureSecondUnit == 2){
            result = Double.parseDouble(String.format("%.2f",temperatureNumber * 1.25));
        }
        return result;
    }



}
