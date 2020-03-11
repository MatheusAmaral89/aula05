package br.ifsc.edu.internacionalizacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView  = findViewById(R.id.listView);

        final ArrayList<String> lista_frutinhas = new ArrayList<>();
        final ArrayList<String> lista_botao = new ArrayList<>();

        lista_frutinhas.add("maça");
        lista_frutinhas.add("pera");
        lista_frutinhas.add("uva");
        lista_frutinhas.add("melancia");

        lista_botao.add("Button");
        lista_botao.add("RadioButton");
        lista_botao.add("ImageButton");
        lista_botao.add("CheckBox");
        lista_botao.add("RatingBar");
        lista_botao.add("ToogleButton");
        lista_botao.add("DatePicker");
        lista_botao.add("AlertDialog");

        ArrayAdapter<String> adapter;
        ArrayAdapter<String> adapterT;

        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                lista_frutinhas
                );

        adapterT = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                lista_botao
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, lista_frutinhas.get(i), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, ComponenteView.class);

                intent.putExtra("fruta", lista_frutinhas.get(i));

                startActivity(intent);
            }
        });



        //Button
        //RadioButton
        //ImageButton
        //CheckBox
        //RatingBar
        //ToogleButton
        //DatePicker
        //AlertDialog


    }
}
