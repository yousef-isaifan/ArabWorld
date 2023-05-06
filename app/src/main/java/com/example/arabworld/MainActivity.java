package com.example.arabworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.arabworld.model.Country;
import com.example.arabworld.model.CountryDA;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private CountryDA countries = new CountryDA();
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


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

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


    btn1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn1"));
      }
    });

    btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn2"));
      }
    });

    btn3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn3"));
      }
    });

    btn4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn4"));
      }
    });

    btn5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn5"));
      }
    });


    btn6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn6"));
      }
    });


    btn7.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn7"));
      }
    });


    btn8.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn8"));
      }
    });


    btn9.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn9"));
      }
    });


    btn10.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        textV.setVisibility(View.VISIBLE);
        textV.setText(countries.getKey("btn10"));
      }
    });

    btn11.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn11");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn12.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn12");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });


    btn13.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn13");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn14.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn14");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn15.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn15");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn16.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn16");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn17.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn17");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn18.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn18");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn19.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn19");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn20.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn20");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn21.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn21");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });

    btn22.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Country c = countries.getByName("btn22");
        textV.setVisibility(View.VISIBLE);
        textV.setText(getString(c));
      }
    });


  }

  private static String getString(Country country) {
    String res = country.getName() + "الاسم: " + ""
        + country.getCapital() + "العاصمة: " + ""
        + country.getLandArea() + "المساجة: " + ""
        + country.getPopulation() + "التعداد السكاني: " + ""
        + country.getLink() + "للمزيد: ";
    return "";
  }

}