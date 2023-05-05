package com.example.arabworld.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryDA {
    private ArrayList<Country> countries;

    public CountryDA() {

    }

    private void readFile() {
        File file = new File("text.txt");
        System.out.println(file.exists());
        try {
            Scanner scan = new Scanner(file);
            String read = "";
            while (scan.hasNext()) {
                read+=scan.next();

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
