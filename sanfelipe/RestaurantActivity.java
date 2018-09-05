package com.example.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class RestaurantActivity extends Activity {

    private String Restaurant[]=new String[]{"Mariscos El Viejón","Mariscos El Delfin","La Casona","La Ramona",
            "Pizza Stop","Pizza Patos","La Tortuga","Pizzas Henry's"};

    private String Descripcion[]=new String[]{"EL VIEJON",

            "EL DELFIN",

            "LA CASONA",

            "LA RAMONA",
            "PIZZA STOP",
            "PIZZA PATOS","LA TORTUGA","PIZZA HENRRY'S"};


    private Integer[] imgid={
            R.drawable.viejon,
            R.drawable.delfin,
            R.drawable.casona,
            R.drawable.ramonar,
            R.drawable.stop,
            R.drawable.patos,
            R.drawable.tortuga,
            R.drawable.henrys



    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares_list);

        this.setTitle(R.string.restaurant);

        BaresListAdapter adapter=new BaresListAdapter(this,Restaurant,imgid);
        lista=(ListView)findViewById(R.id.my_list);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= Restaurant[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(RestaurantActivity.this, RestaurantDescriptionActivity.class);
                intent.putExtra("Lenguajes", Restaurant[position]);
                intent.putExtra("imgid", imgid[position]);
                intent.putExtra("descripcion", Restaurant[position]);


                startActivity(intent);
            }


        });

    }

}