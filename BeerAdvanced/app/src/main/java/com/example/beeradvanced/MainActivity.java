package com.example.beeradvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert=new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer (View view) {
        TextView brands=(TextView) findViewById(R.id.brands); //findViewById zwraca View, więc rzutowanie
        Spinner color=(Spinner)findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItem()); //getSelectedItem zwraca Object, rzutowanie na String
        List<String> brandsList=expert.getBrands(beerType);
        StringBuilder brandsFormatted=new StringBuilder(); //konstruuje łańcuch znaków z wartościami z listy
        for(String brand : brandsList){
            brandsFormatted.append(brand).append('\n'); //każdy gatunek w innym wierszu
        }

        //wyniki
        brands.setText(brandsFormatted);
    }
}
