package com.example.arabworld.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.arabworld.R;

public class MainActivity extends AppCompatActivity {

  private Button btn1;
  private Button btn2;
  private Button btn3;
  private Button btn4;
  private Button btn5;
  private Button btn6;
  private Button btn7;
  private Button btn8;
  private Button btn9;
  private Button btn10;
  private Button btn11;
  private Button btn12;
  private Button btn13;
  private Button btn14;
  private Button btn15;
  private Button btn16;
  private Button btn17;
  private Button btn18;
  private Button btn19;
  private Button btn20;
  private Button btn21;
  private Button btn22;

  private TextView textV;
  private ScrollView sv;

  private SharedPreferences prefs;
  private SharedPreferences.Editor editor;

  public static final String FLAG = "FLAG";


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViews();


    btn1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("KSA"));
      }
    });

    btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn2"));
      }
    });

    btn3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn3"));
      }
    });

    btn4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn4"));
      }
    });

    btn5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn5"));
      }
    });


    btn6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn6"));
      }
    });


    btn7.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn7"));
      }
    });


    btn8.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn8"));
      }
    });


    btn9.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn9"));
      }
    });


    btn10.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn10"));
      }
    });

    btn11.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn11"));
      }
    });

    btn12.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn12"));
      }
    });


    btn13.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn13"));
      }
    });

    btn14.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn14"));
      }
    });

    btn15.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn15"));
      }
    });

    btn16.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn16"));
      }
    });

    btn17.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn17"));
      }
    });

    btn18.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn18"));
      }
    });

    btn19.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn19"));
      }
    });

    btn20.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn20"));
      }
    });

    btn21.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn21"));
      }
    });

    btn22.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        sv.setVisibility(View.VISIBLE);
        textV.setText(getData("btn22"));
      }
    });

  }

  public String getData(String key){
    return prefs.getString(key, "");
  }

  public void findViews(){
    btn1 = (Button) findViewById(R.id.btn1);
    btn2 = (Button) findViewById(R.id.btn2);
    btn3 = (Button) findViewById(R.id.btn3);
    btn4 = (Button) findViewById(R.id.btn4);
    btn5 = (Button) findViewById(R.id.btn5);
    btn6 = (Button) findViewById(R.id.btn6);
    btn7 = (Button) findViewById(R.id.btn7);
    btn8 = (Button) findViewById(R.id.btn8);
    btn9 = (Button) findViewById(R.id.btn9);
    btn10 = (Button) findViewById(R.id.btn10);
    btn11 = (Button) findViewById(R.id.btn11);
    btn12 = (Button) findViewById(R.id.btn12);
    btn13 = (Button) findViewById(R.id.btn13);
    btn14 = (Button) findViewById(R.id.btn14);
    btn15 = (Button) findViewById(R.id.btn15);
    btn16 = (Button) findViewById(R.id.btn16);
    btn17 = (Button) findViewById(R.id.btn17);
    btn18 = (Button) findViewById(R.id.btn18);
    btn19 = (Button) findViewById(R.id.btn19);
    btn20 = (Button) findViewById(R.id.btn20);
    btn21 = (Button) findViewById(R.id.btn21);
    btn22 = (Button) findViewById(R.id.btn22);

    textV = (TextView) findViewById(R.id.textV);
    sv = (ScrollView) findViewById(R.id.sv);
  }

  public void setPrefs(){
    prefs= PreferenceManager.getDefaultSharedPreferences(this);
    editor = prefs.edit();
  }

  public void saveData(){
    editor.putString("KSA", "الاسم: المملكة العربية السعودية\n" +
            "العاصمة: الرياض\n" +
            "المساحة: 2,149,690كم²\n" +
            "التعداد السكاني: 34,413,660نسمة\n");

    editor.putString("UAE", "الاسم: الإمارات العربية المتحدة\n" +
            "العاصمة: أبوظبي\n" +
            "المساحة: 83,600كم²\n" +
            "التعداد السكاني: 9599353نسمة\n");

    editor.putString("BH", "الاسم: مملكة البحرين\n" +
            "العاصمة: المنامة\n" +
            "المساحة: 785.08كم²\n" +
            "التعداد السكاني: 1,569,446نسمة\n");

    editor.putString("KW","الاسم: دولة الكويت\n" +
            "العاصمة: الكويت\n" +
            "المساحة: 17,818كم²\n" +
            "التعداد السكاني: 4,675,710نسمة\n");

    editor.putString("YE","الاسم: الجمهورية اليمنية\n" +
            "العاصمة: صنعاء\n" +
            "المساحة: 555,000كم²\n" +
            "التعداد السكاني: 30,411,000نسمة\n");

    editor.putString("QA","الاسم: دولة قطر\n" +
            "العاصمة: الدوحة\n" +
            "المساحة: 11,521كم²\n" +
            "التعداد السكاني: 2,977,955نسمة\n");

    editor.putString("OM","الاسم: سلطنة عمان\n" +
            "العاصمة: مسقط\n" +
            "المساحة: 309,500كم²\n" +
            "التعداد السكاني: 4,914,891نسمة\n");

    editor.putString("JO", "الاسم: المملكة الأردنية الهاشمية\n" +
            "العاصمة: عمان\n" +
            "المساحة: 89,341كم²\n" +
            "التعداد السكاني: 10,428,241نسمة\n");

    editor.putString("SY", "الاسم: الجمهورية العربية السورية\n" +
            "العاصمة: دمشق\n" +
            "المساحة: 185,180كم²\n" +
            "التعداد السكاني: 18,499,181نسمة\n");

    editor.putString("LB", "الاسم: الجمهورية اللبنانية\n" +
            "العاصمة: بيروت\n" +
            "المساحة: 10,452كم²\n" +
            "التعداد السكاني: 4,259,000نسمة\n");

    editor.putString("PS", "الاسم: دولة فلسطين\n" +
            "العاصمة: القدس\n" +
            "المساحة: 26,990كم²\n" +
            "التعداد السكاني: 5,287,193نسمة\n");

    editor.putString("IQ",  "الاسم: جمهورية العراق\n" +
            "العاصمة: بغداد\n" +
            "المساحة: 438,317كم²\n" +
            "التعداد السكاني: 40,123,000نسمة\n");

    editor.putString("SD",  "الاسم: جمهورية العراق\n" + "الاسم: جمهورية السودان\n" +
            "العاصمة: الخرطوم\n" +
            "المساحة: 1,861,484كم²\n" +
            "التعداد السكاني: 47,958,856نسمة\n");

    editor.putString("EG",  "الاسم: جمهورية مصر العربية\n" +
            "العاصمة: القاهرة\n" +
            "المساحة: 1,001,450كم²\n" +
            "التعداد السكاني: 104,395,178نسمة\n");

    editor.putString("LY", "الاسم: دولة ليبيا\n" +
            "العاصمة: طرابلس\n" +
            "المساحة: 1,759,541كم²\n" +
            "التعداد السكاني: 7,017,224نسمة\n");

    editor.putString("TN", "الاسم: الجمهورية التونسية\n" +
            "العاصمة: تونس\n" +
            "المساحة: 163,610كم²\n" +
            "التعداد السكاني: 11,708,370نسمة\n");

    editor.putString("DZ", "الاسم: الجمهورية الجزائرية الديموقراطية الشعبية\n" +
            "العاصمة: الجزائر\n" +
            "المساحة: 2,381,741كم²\n" +
            "التعداد السكاني: 38,700,000نسمة\n");

    editor.putString("MA", "الاسم: المملكة المغربية\n" +
            "العاصمة: الرباط\n" +
            "المساحة: 710,850كم²\n" +
            "التعداد السكاني: 36,471,769نسمة\n");

    editor.putString("MR", "الاسم: الجمهورية الإسلامية الموريتانية\n" +
            "العاصمة: نواكشط\n" +
            "المساحة: 1,030,700كم²\n" +
            "التعداد السكاني: 4,775,110نسمة\n");

    editor.putString("SO", "الاسم: جمهورية الصومال الفيدرالية\n" +
            "العاصمة: مقديشو\n" +
            "المساحة: 637,657كم²\n" +
            "التعداد السكاني: 11,031,386نسمة\n");

    editor.putString("DJ", "الاسم: جمهورية جيبوتي\n" +
            "العاصمة: جيبوتي\n" +
            "المساحة: 23,200كم²\n" +
            "التعداد السكاني: 992,333نسمة\n");

    editor.putString("KM","الاسم: جزر القمر\n" +
            "العاصمة: موروني\n" +
            "المساحة: 1,862كم²\n" +
            "التعداد السكاني: 876,935نسمة\n");

    editor.commit();
    editor.apply();
  }


}