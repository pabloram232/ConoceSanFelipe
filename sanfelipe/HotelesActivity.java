package com.utng.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.utng.pabloram.sanfelipe.R;

public class HotelesActivity extends Activity {

    private String Hotels[]=new String[]{"Hotel Roma","Hotel Texas","Hotel La Luz","Hotel Posada","Hotel Vista Jardin"};

    private String Descripcion[]=new String[]{
            "Dirección: Aquiles Serdan #116\n" +
                    "El mejor confort para hospedarte los años y experiencia nos respaldan",

            "Dirección: Aquiles Serdan #108\n" +
                    "Comodidad y Buen servicio garantizado",

            "Dirección: Francisco I. Madero  #519\n" +
                    "El mejor hotel familiar para hospedarte en san felipe",

            "Dirección: Principal  #152\n" +
                    "Economico y confort la experiencia nos hacen unicos y para desestresarte visita checos bar ",

            "Dirección: Constitución #104\n" +
                    "La mejor vista al jardin Aquiles Serdan"};


    private Integer[] imgid={
            R.drawable.roma,
            R.drawable.texas,
            R.drawable.luz,
            R.drawable.posada,
            R.drawable.vistajardin
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_list);

        this.setTitle(R.string.hotel);

        BaresListAdapter adapter=new BaresListAdapter(this,Hotels,imgid);
        lista=(ListView)findViewById(R.id.my_list);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= Hotels[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(HotelesActivity.this, HotelsDescriptionActivity.class);
                intent.putExtra("Lenguajes", Hotels[position]);
                intent.putExtra("imgid", imgid[position]);
                intent.putExtra("descripcion", Descripcion[position]);


                startActivity(intent);
            }


        });

    }

}