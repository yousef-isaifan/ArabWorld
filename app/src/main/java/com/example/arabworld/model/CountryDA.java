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
        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals(btn3))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        else if (key.equals("btn1"))
            return "المملكة العربية السعودية";

        return "المملكة العربية السعودية";

        else if (btn18)
            return "المملكة العربية السعودية";

        else if (btn19)
            return "المملكة العربية السعودية";

        else if (btn120)
            return "المملكة العربية السعودية";

        else if (btn121)
            return "المملكة العربية السعودية";

        else
            return "المملكة العربية السعودية";

    }

}
