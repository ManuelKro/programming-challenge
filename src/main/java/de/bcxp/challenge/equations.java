package de.bcxp.challenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Die Klasse equations dient zum berechnen der gesuchten Lösungen in der Klasse App.
Dafür wurde für beide Berechnungen eine Hashmap erstellt mit den benötigten Variablen Day/temperatureSpread
und Country/Population Density. Aus den Hashmaps konnte dann über Collections.min und Collections.max die
gewünschten Werte ermittelt werden und über das k,v Pair der Schlüssel (Day/Country) ausgeben.
 */

public class equations {

    public Double temperatureSpread;
    public HashMap<String, Double> temperatureSpreadHash = new HashMap<String, Double>();
    public String DayWithSmallestTempSpread;

    public Double PopulationDensity;
    public HashMap<String, Double> PopulationDensityHash = new HashMap<String, Double>();
    public String countryWithHighestPopulationDensity;

    public String computeDayWithSmallestTempSpread(String weatherPath) {
        readCSVweather weather = new readCSVweather(weatherPath);

        // for loop to create a hashmap for all Days with the computed minimum temperature spread
        for (weather dailyWeather: weather.weatherSamples){
            temperatureSpread = dailyWeather.getMxT() - dailyWeather.getMnT();
            temperatureSpreadHash.put(dailyWeather.getDay(), temperatureSpread);
        }

        double minTemperatureSpread = (Collections.min(temperatureSpreadHash.values()));  // Minimum value of the temperatureSpread hash map

        // Iterate through the hash map to get the k,v pair with the smallest temperature spread
        for (Map.Entry<String, Double> entry : temperatureSpreadHash.entrySet()) {
            if (entry.getValue() == minTemperatureSpread) {
                DayWithSmallestTempSpread = entry.getKey();     // get the day with the smallest temperature spread
            }
        }
        return DayWithSmallestTempSpread;
    }

    public String computeCountryWithHighestPopulationDensity(String countriesPath) {
        readCSVcountries countries = new readCSVcountries(countriesPath);

        // for loop to create a hashmap for all Countries with there population density
        for (Countries country : countries.countriesSamples){
            PopulationDensity = country.getPopulation() / country.getArea();
            PopulationDensityHash.put(country.getName(), PopulationDensity);
        }

        double maxPopulationDensity = (Collections.max(PopulationDensityHash.values()));  // This will return max value in the hashmap

        // for loop to get the Country with highest population density out of the hashmap
        for (Map.Entry<String, Double> entry : PopulationDensityHash.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxPopulationDensity) {
                countryWithHighestPopulationDensity = entry.getKey();     // Print the key with max value
            }
        }
        return countryWithHighestPopulationDensity;
    }
}
