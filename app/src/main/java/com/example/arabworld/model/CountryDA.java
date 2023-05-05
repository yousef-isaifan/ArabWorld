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
        File file = new File("java/com/example/arabworld/assets/text.txt");
        System.out.println(file.exists());
        String read;
        try {
            Scanner scan = new Scanner(file);
            read = "";
            while (scan.hasNext()) {
                read += scan.next();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String[] result = read.split("&");
    }

}
