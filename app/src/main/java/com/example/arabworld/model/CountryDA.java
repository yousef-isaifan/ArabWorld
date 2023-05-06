package com.example.arabworld.model;

import android.content.Context;
import android.os.Environment;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryDA {
    private ArrayList<Country> countries;

    public CountryDA() {
        countries = new ArrayList<>();
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
        String read = getStr().trim();
        System.out.println(read);

//    try {
//      Scanner scan = new Scanner(file);
//      read = "";
//      while (scan.hasNext()) {
//        read += scan.next();
//      }
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }
        String[] result = read.split("&");
        return result;
    }

    public String getKey(String key) {

        if (key.equals("btn1"))
            return "الاسم: المملكة العربية السعودية\n" +
                    "العاصمة: الرياض\n" +
                    "المساحة: 2,149,690كم²\n" +
                    "التعداد السكاني: 34,413,660نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B3%D8%B9%D9%88%D8%AF%D9%8A%D8%A9\n";
//            return "الاسم: المملكة العربية السعودية\nالعاصمة: الرياض\nالمساحة:";
        else if (key.equals("btn2"))
            return "الاسم: الإمارات العربية المتحدة\n" +
                    "العاصمة: أبوظبي\n" +
                    "المساحة: 83,600كم²\n" +
                    "التعداد السكاني: 9599353نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%A5%D9%85%D8%A7%D8%B1%D8%A7%D8%AA_%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A%D8%A9_%D8%A7%D9%84%D9%85%D8%AA%D8%AD%D8%AF%D8%A9";
        else if (key.equals("btn3"))
            return "الاسم: مملكة البحرين\n" +
                    "العاصمة: المنامة\n" +
                    "المساحة: 785.08كم²\n" +
                    "التعداد السكاني: 1,569,446نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%A8%D8%AD%D8%B1%D9%8A%D9%86\n";
        else if (key.equals("btn4"))
            return "الاسم: دولة الكويت\n" +
                    "العاصمة: الكويت\n" +
                    "المساحة: 17,818كم²\n" +
                    "التعداد السكاني: 4,675,710نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA\n";
        else if (key.equals("btn5"))
            return "الاسم: الجمهورية اليمنية\n" +
                    "العاصمة: صنعاء\n" +
                    "المساحة: 555,000كم²\n" +
                    "التعداد السكاني: 30,411,000نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D9%8A%D9%85%D9%86\n";
        else if (key.equals("btn6"))
            return "الاسم: دولة قطر\n" +
                    "العاصمة: الدوحة\n" +
                    "المساحة: 11,521كم²\n" +
                    "التعداد السكاني: 2,977,955نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D9%82%D8%B7%D8%B1\n";
        else if (key.equals("btn7"))
            return "الاسم: سلطنة عمان\n" +
                    "العاصمة: مسقط\n" +
                    "المساحة: 309,500كم²\n" +
                    "التعداد السكاني: 4,914,891نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%B3%D9%84%D8%B7%D9%86%D8%A9_%D8%B9%D9%85%D8%A7%D9%86\n";
        else if (key.equals("btn8"))
            return "الاسم: المملكة الأردنية الهاشمية\n" +
                    "العاصمة: عمان\n" +
                    "المساحة: 89,341كم²\n" +
                    "التعداد السكاني: 10,428,241نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86\n";
        else if (key.equals("btn9"))
            return "الاسم: الجمهورية العربية السورية\n" +
                    "العاصمة: دمشق\n" +
                    "المساحة: 185,180كم²\n" +
                    "التعداد السكاني: 18,499,181نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%B3%D9%88%D8%B1%D9%8A%D8%A7\n";
        else if (key.equals("btn10"))
            return "الاسم: الجمهورية اللبنانية\n" +
                    "العاصمة: بيروت\n" +
                    "المساحة: 10,452كم²\n" +
                    "التعداد السكاني: 4,259,000نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D9%84%D8%A8%D9%86%D8%A7%D9%86\n";
        else if (key.equals("btn11"))
            return "الاسم: دولة فلسطين\n" +
                    "العاصمة: القدس\n" +
                    "المساحة: 26,990كم²\n" +
                    "التعداد السكاني: 5,287,193نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%AF%D9%88%D9%84%D8%A9_%D9%81%D9%84%D8%B3%D8%B7%D9%8A%D9%86\n";
        else if (key.equals("btn12"))
            return "الاسم: جمهورية العراق\n" +
                    "العاصمة: بغداد\n" +
                    "المساحة: 438,317كم²\n" +
                    "التعداد السكاني: 40,123,000نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B9%D8%B1%D8%A7%D9%82\n";
        else if (key.equals("btn13"))
            return "الاسم: جمهورية السودان\n" +
                    "العاصمة: الخرطوم\n" +
                    "المساحة: 1,861,484كم²\n" +
                    "التعداد السكاني: 47,958,856نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B3%D9%88%D8%AF%D8%A7%D9%86\n";
        else if (key.equals("btn14"))
            return "الاسم: جمهورية مصر العربية\n" +
                    "العاصمة: القاهرة\n" +
                    "المساحة: 1,001,450كم²\n" +
                    "التعداد السكاني: 104,395,178نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D9%85%D8%B5%D8%B1\n";
        else if (key.equals("btn15"))
            return "الاسم: دولة ليبيا\n" +
                    "العاصمة: طرابلس\n" +
                    "المساحة: 1,759,541كم²\n" +
                    "التعداد السكاني: 7,017,224نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D9%84%D9%8A%D8%A8%D9%8A%D8%A7\n";
        else if (key.equals("btn16"))
            return "الاسم: الجمهورية التونسية\n" +
                    "العاصمة: تونس\n" +
                    "المساحة: 163,610كم²\n" +
                    "التعداد السكاني: 11,708,370نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%AA%D9%88%D9%86%D8%B3\n";
        else if (key.equals("btn17"))
            return "الاسم: الجمهورية الجزائرية الديموقراطية الشعبية\n" +
                    "العاصمة: الجزائر\n" +
                    "المساحة: 2,381,741كم²\n" +
                    "التعداد السكاني: 38,700,000نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%AC%D8%B2%D8%A7%D8%A6%D8%B1\n";
        else if (key.equals("btn18"))
            return "الاسم: المملكة المغربية\n" +
                    "العاصمة: الرباط\n" +
                    "المساحة: 710,850كم²\n" +
                    "التعداد السكاني: 36,471,769نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D9%85%D8%BA%D8%B1%D8%A8\n";
        else if (key.equals("btn19"))
            return "الاسم: الجمهورية الإسلامية الموريتانية\n" +
                    "العاصمة: نواكشط\n" +
                    "المساحة: 1,030,700كم²\n" +
                    "التعداد السكاني: 4,775,110نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D9%85%D9%88%D8%B1%D9%8A%D8%AA%D8%A7%D9%86%D9%8A%D8%A7\n";
        else if (key.equals("btn20"))
            return "الاسم: جمهورية الصومال الفيدرالية\n" +
                    "العاصمة: مقديشو\n" +
                    "المساحة: 637,657كم²\n" +
                    "التعداد السكاني: 11,031,386نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B5%D9%88%D9%85%D8%A7%D9%84\n";
        else if (key.equals("btn21"))
            return "الاسم: جمهورية جيبوتي\n" +
                    "العاصمة: جيبوتي\n" +
                    "المساحة: 23,200كم²\n" +
                    "التعداد السكاني: 992,333نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%AC%D9%8A%D8%A8%D9%88%D8%AA%D9%8A\n";
        else
            return "الاسم: جزر القمر\n" +
                    "العاصمة: موروني\n" +
                    "المساحة: 1,862كم²\n" +
                    "التعداد السكاني: 876,935نسمة\n" +
                    "للمزيد: https://ar.wikipedia.org/wiki/%D8%AC%D8%B2%D8%B1_%D8%A7%D9%84%D9%82%D9%85%D8%B1\n";

    }


    public String getStr() {
        return "المملكةالعربيةالسعودية&الرياض&2,149,690كم²&34,413,660نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B3%D8%B9%D9%88%D8%AF%D9%8A%D8%A9&\n" +
                "&الإماراتالعربيةالمتحدة&أبوظبي&83,600كم²&9599353نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%A5%D9%85%D8%A7%D8%B1%D8%A7%D8%AA_%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A%D8%A9_%D8%A7%D9%84%D9%85%D8%AA%D8%AD%D8%AF%D8%A9&\n" +
                "&مملكةالبحرين&المنامة&785.08كم²&1,569,446نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%A8%D8%AD%D8%B1%D9%8A%D9%86&\n" +
                "&دولةالكويت&الكويت&17,818كم²&4,675,710نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA&\n" +
                "&الجمهوريةاليمنية&صنعاء&555,000كم²&30,411,000نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D9%8A%D9%85%D9%86&\n" +
                "&دولةقطر&الدوحة&11,521كم²&2,977,955نسمة&https://ar.wikipedia.org/wiki/%D9%82%D8%B7%D8%B1&\n" +
                "&سلطنةعمان&مسقط&309,500كم²&4,914,891نسمة&https://ar.wikipedia.org/wiki/%D8%B3%D9%84%D8%B7%D9%86%D8%A9_%D8%B9%D9%85%D8%A7%D9%86&\n" +
                "&المملكةالأردنيةالهاشمية&عمان&89,341كم²&10,428,241نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86&\n" +
                "&الجمهوريةالعربيةالسورية&دمشق&185,180كم²&18,499,181نسمة&https://ar.wikipedia.org/wiki/%D8%B3%D9%88%D8%B1%D9%8A%D8%A7&\n" +
                "&الجمهوريةاللبنانية&بيروت&10,452كم²&4,259,000نسمة&https://ar.wikipedia.org/wiki/%D9%84%D8%A8%D9%86%D8%A7%D9%86&\n" +
                "&دولةفلسطين&القدس&26,990كم²&5,287,193نسمة&https://ar.wikipedia.org/wiki/%D8%AF%D9%88%D9%84%D8%A9_%D9%81%D9%84%D8%B3%D8%B7%D9%8A%D9%86&\n" +
                "&جمهوريةالعراق&بغداد&438,317كم²&40,123,000نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B9%D8%B1%D8%A7%D9%82&\n" +
                "&جمهوريةالسودان&الخرطوم&1,861,484كم²&47,958,856نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B3%D9%88%D8%AF%D8%A7%D9%86&\n" +
                "&جمهوريةمصرالعربية&القاهرة&1,001,450كم²&104,395,178نسمة&https://ar.wikipedia.org/wiki/%D9%85%D8%B5%D8%B1&\n" +
                "&دولةليبيا&طرابلس&1,759,541كم²&7,017,224نسمة&https://ar.wikipedia.org/wiki/%D9%84%D9%8A%D8%A8%D9%8A%D8%A7&\n" +
                "&الجمهوريةالتونسية&تونس&163,610كم²&11,708,370نسمة&https://ar.wikipedia.org/wiki/%D8%AA%D9%88%D9%86%D8%B3&\n" +
                "&الجمهوريةالجزائريةالديموقراطيةالشعبية&الجزائر&2,381,741كم²&38,700,000نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%AC%D8%B2%D8%A7%D8%A6%D8%B1&\n" +
                "&المملكةالمغربية&الرباط&710,850كم²&36,471,769نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D9%85%D8%BA%D8%B1%D8%A8&\n" +
                "&الجمهوريةالإسلاميةالموريتانية&نواكشط&1,030,700كم²&4,775,110نسمة&https://ar.wikipedia.org/wiki/%D9%85%D9%88%D8%B1%D9%8A%D8%AA%D8%A7%D9%86%D9%8A%D8%A7&\n" +
                "&جمهوريةالصومالالفيدرالية&مقديشو&637,657كم²&11,031,386نسمة&https://ar.wikipedia.org/wiki/%D8%A7%D9%84%D8%B5%D9%88%D9%85%D8%A7%D9%84&\n" +
                "&جمهوريةجيبوتي&جيبوتي&23,200كم²&992,333نسمة&https://ar.wikipedia.org/wiki/%D8%AC%D9%8A%D8%A8%D9%88%D8%AA%D9%8A&\n" +
                "&جزرالقمر&موروني&1,862كم²&876,935نسمة&https://ar.wikipedia.org/wiki/%D8%AC%D8%B2%D8%B1_%D8%A7%D9%84%D9%82%D9%85%D8%B1&\n";
    }



}
