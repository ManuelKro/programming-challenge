package de.bcxp.challenge;

import java.io.*;
import java.util.*;

/*
Die Klasse readCSVweather dient zum einlesen der CSV Datei der weather.csv.
Einlesen ist mittels BufferedReader und FileReader implementiert.
Der dazugehörige Path wird in der App.java initialisiert.
Danach werden über eine while Schleife alle Zeilen der CSV Datei eingelesen, ";" separiert aufgesplittet und
auf die verschiedenen Variablen der Klasse weather zugewiesen. Das Objekt addWeather wird dann
nach jeder Zeile zu einer Array Liste hinzugefügt.
 */

public class readCSVweather {

    String line = "";
    Integer k = 0;

    public ArrayList<weather> weatherSamples = new ArrayList<>();

    public readCSVweather(String weatherPath) {
        try {
            BufferedReader FileReader = new BufferedReader(new FileReader(new File(weatherPath))    // Buffer faster than Scanner for big files
            );

            while (null != (line = FileReader.readLine())) {        // read each line until the last one with input
                if (k == 0) { // to ignore header line
                    k = 1;
                } else {
                    String[] split = line.split(",");          // split the line at each "," to elements to create an array list for the equations

                    weather addWeather = new weather();
                    addWeather.setDay(split[0].trim());
                    addWeather.setMxT(Double.parseDouble(split[1].trim()));
                    addWeather.setMnT(Double.parseDouble(split[2].trim()));

                    weatherSamples.add(addWeather);
                }
            }

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("File not found! Control the Path!");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(" I/O exception of some sort has occurred. Try to Restart the Program!");
        }
    }
}
