package com.example.arabworld.model;

import android.content.Context;
import android.os.Environment;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryDA {
    private ArrayList<Country> countries;
    private Context context;

    public CountryDA(Context context) {
        countries = new ArrayList<>();
        context = context;
        String[] res = readFile();
        for (int i = 0; i < res.length; i = i + 5) {
            countries.add(new Country(res[0], res[1], res[2], res[3], res[4]));
        }
    }

    public Country getByName(String key) {
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getName().equals(getKey(key)))
                return countries.get(i);
        }
        return null;
    }

    private String[] readFile() {
        File file = new File("app/src/main/res/text.txt");
        String read = "";
        try {
            Scanner scan = new Scanner(file);
            read = "";
            while (scan.hasNext()) {
                read += scan.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] result = read.split("&");
        return result;
    }

    private String getKey(String key) {
        if (key.equals("btn1"))
            return "المملكة العربية السعودية";
        else if (key.equals("btn2"))
            return "الإمارات العربية المتحدة";
        else if (key.equals("btn3"))
            return "مملكة البحرين";
        else if (key.equals("btn4"))
            return "دولة الكويت";
        else if (key.equals("btn5"))
            return "الجمهورية اليمنية";
        else if (key.equals("btn6"))
            return "دولة قطر";
        else if (key.equals("btn7"))
            return "سلطنة عمان";
        else if (key.equals("btn8"))
            return "المملكة الأردنية الهاشمية";
        else if (key.equals("btn9"))
            return "الجمهورية العربية السورية";
        else if (key.equals("btn10"))
            return "الجمهورية اللبنانية";
        else if (key.equals("btn11"))
            return "دولة فلسطين";
        else if (key.equals("btn12"))
            return "جمهورية العراق";
        else if (key.equals("btn13"))
            return "جمهورية السودان";
        else if (key.equals("btn14"))
            return "جمهورية مصر العربية";
        else if (key.equals("btn15"))
            return "دولة ليبيا";
        else if (key.equals("btn16"))
            return "الجمهورية التونسية";
        else if (key.equals("btn17"))
            return "الجمهورية الجزائرية الديموقراطية الشعبية";
        else if (key.equals("btn18"))
            return "المملكة المغربية";
        else if (key.equals("btn19"))
            return "الجمهورية الإسلامية الموريتانية";
        else if (key.equals("btn20"))
            return "جمهورية الصومال الفيدرالية";
        else if (key.equals("btn21"))
            return "جمهورية جيبوتي";
        else
            return "جزر القمر";

    }

}
