package de.bcxp.challenge;

import java.io.*;
import java.util.*;

/*
Die Klasse readCSVcountries dient zum einlesen der CSV Datei der countries.csv.
Einlesen ist mittels BufferedReader und FileReader implementiert.
Der dazugehörige Path wird in der App.java initialisiert.
Danach werden über eine while Schleife alle Zeilen der CSV Datei eingelesen, ";" separiert aufgesplittet und
auf die verschiedenen Variablen der Klasse Countries zugewiesen. Das Objekt addCountry wird dann
nach jeder Zeile zu einer Array Liste hinzugefügt.
 */

public class readCSVcountries {

    String line = "";
    Integer i = 0;

    public ArrayList<Countries> countriesSamples = new ArrayList<>();

    public readCSVcountries(String countriesPath) {
        try {
            BufferedReader FileReader = new BufferedReader(new FileReader(new File(countriesPath))    // Buffer faster than Scanner for big files
            );

            while (null != (line = FileReader.readLine())) {         // read each line until the last one with input
                if (i == 0) {  // to ignore header line
                    i++;
                } else {
                    String[] split = line.split(";");          // split the line at each ";" to elements to create an array list for the equations

                    Countries addCountry = new Countries();
                    addCountry.setName(split[0].trim());
                    addCountry.setCapital(split[1].trim());
                    addCountry.setAccession(split[2].trim());
                    addCountry.setPopulation(Double.parseDouble(split[3].trim()));
                    addCountry.setArea(Double.parseDouble(split[4].trim()));
                    addCountry.setGDP(Integer.parseInt(split[5].trim()));
                    addCountry.setHDI(Double.parseDouble(split[6].trim()));
                    addCountry.setMEPs(Integer.parseInt(split[7].trim()));

                    countriesSamples.add(addCountry);
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

