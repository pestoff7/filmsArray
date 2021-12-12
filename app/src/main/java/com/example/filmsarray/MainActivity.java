package com.example.filmsarray;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showArrayList(View v){
        Spinner countriesList = findViewById(R.id.arrayListCountries);
        Spinner spinnerList = findViewById(R.id.arrayListSpinner);
        TextView filmsList = findViewById(R.id.arrayList);
        String s = spinnerList.getSelectedItem().toString();
        String c = countriesList.getSelectedItem().toString();
        switch (s) {
            case "Комедия":
                filmsList.setText(R.string.Comedy);
                break;
            case "Мелодрама":
                filmsList.setText(R.string.Melodrama);
                break;
            case "Боевик":
                filmsList.setText(R.string.Action);
                break;
            case "Детектив":
                filmsList.setText(R.string.Detective);
                break;
            case "Приключения":
                filmsList.setText(R.string.Adventure);
                break;
        }
        if (c.equals("Зарубежное")){
            switch (s) {
                case "Комедия":
                case "Мелодрама":
                case "Боевик":
                case "Детектив":
                case "Приключения":
                    filmsList.setText("");
                    break;
            }
        }
    }

}