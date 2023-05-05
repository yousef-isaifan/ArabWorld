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
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getName().equals(name))
                return countries.get(i);
        }
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

    public String check(String key) {
        if (key.equals("btn1"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn2"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn3"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn4"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn5"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn6"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn7"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn8"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn9"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn10"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn11"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn12"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn13"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn14"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn15"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn16"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn17"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn18"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn19"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn20"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn21"))
            return "المملكة العربية السعودية";
        else
            return "المملكة العربية السعودية";

    }

}
