package com.example.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class HotelesActivity extends Activity {

    private String Hotels[]=new String[]{"Hotel Roma","Hotel Texas,","Hotel La Luz","Hotel Posada","Hotel Vista Jardin"};

    private String Descripcion[]=new String[]{"HOTEL ROMA",  "HOTEL TEXAS","HOTEL LA LUZ","HOTEL POSADA","HOTEL VISTA JARDIN"};


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
                intent.putExtra("descripcion", Hotels[position]);


                startActivity(intent);
            }


        });

    }

}