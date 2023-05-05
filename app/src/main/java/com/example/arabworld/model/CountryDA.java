package com.example.arabworld.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryDA {
    private ArrayList<Country> countries;

    public CountryDA() {
        String[] res = readFile();
        for (int i = 0; i < res.length; i = i + 5) {
            countries.add(new Country(res[0], res[1], res[2], res[3], res[4]));
        }
    }

    public Country getByName(String name) {
        if(String)
        return null;
    }

    private String[] readFile() {
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
        return result;
    }


}
