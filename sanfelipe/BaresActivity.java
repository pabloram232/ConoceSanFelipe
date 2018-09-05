package com.example.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class BaresActivity extends Activity {

    //ARREGLO CON LOS BARES
    private String Bares[] = new String[]{"La Ramona", "ChecosBar", "La Charanga", "Bar Hause", "Briyett", "Zona Hause"};

    //ARREGLO CON DESCRIPCION DE LOS BARES
    private String Descripcion[] = new String[]{"LA RAMONA", "CHECOS BAR", "LA CHARANGA", "BAR HAUSE", "BRIYETT","ZONA HAUSE"};

    //IMAGEN DE CADA UNO DE LOS BARES
    private Integer[] imgid = {
            R.drawable.ramona,
            R.drawable.checos,
            R.drawable.charanga,
            R.drawable.barhause,
            R.drawable.briyett,
            R.drawable.zona


    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares_list);
        this.setTitle(R.string.bares);


        BaresListAdapter adapter = new BaresListAdapter(this, Bares, imgid);
        lista = (ListView) findViewById(R.id.my_list);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem = Bares[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(BaresActivity.this, BaresDescriptionActivity.class);
                intent.putExtra("Lenguajes", Bares[position]);
                intent.putExtra("imgid", imgid[position]);
                intent.putExtra("descripcion", Bares[position]);


                startActivity(intent);
            }


        });

    }

}