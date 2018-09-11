package com.utng.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.utng.pabloram.sanfelipe.R;

public class RestaurantActivity extends Activity {

    private String Restaurant[]=new String[]{"Mariscos El Viejón","Mariscos El Delfin","La Casona","La Ramona",
            "Pizza Stop","Pizza Patos","La Tortuga","Pizzas Henry's"};

    private String Descripcion[]=new String[]{
            "Dirección: Diligencias #314\n" +
                    "Horario: 01:00 pm a 12:00 am\n" +
                    "Ven a disfrutar en familia los mejores cocteles y bebidas",

            "Dirección: Plaza principal\n" +
                    "Horario: 10:00 am a 06:00 pm\n" +
                    "Las mejores micheladas. hamburguesas y cocteles es lo que nos distinguen",

            "Dirección: Pino Suarez\n" +
                    "Horario: 01:00 pm a 06:00 pm\n" +
                    "El mejor bufett y comidad casera",

            "Dirección: Pino Suarez #228\n" +
            "Horario: 02:00 pm a 12:00 am\n" +
            "Las mejores alitas de la región bañadas en diferentes salsas y lo mejor en snack",

            "Dirección: Madero #318\n" +
                    "Horario: 07:00 am a 11:00 pm\n" +
                    "Las mejores pizzas respaldadas con los años de experiencia y sabor unico",

            "Dirección: Hidalgo \n" +
                    "Horario: 11:00 am a 11:00 pm\n" +
                    "Gran variedad de sabores para disfrutar en familia",

            "Dirección: Profesores\n" +
                    "Horario: 08:00 am a 09:00 pm\n" +
                    "Gran variedad en tortas, hamburguesas y pizzas",

            "Dirección: Jardin principal #128\n" +
                    "Horario: 01:00 pm a 10:00 pm\n" +
                    "Gran variedad en pizzas y alitas "};


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
                intent.putExtra("descripcion", Descripcion[position]);


                startActivity(intent);
            }


        });

    }

}