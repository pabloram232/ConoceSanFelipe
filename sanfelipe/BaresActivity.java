package com.utng.pabloram.sanfelipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.utng.pabloram.sanfelipe.R;

public class BaresActivity extends Activity {

    //ARREGLO CON LOS BARES
    private String Bares[] = new String[]{"La Ramona", "ChecosBar", "La Charanga", "Bar Hause", "Briyett", "Zona Hause"};

    //ARREGLO CON DESCRIPCION DE LOS BARES
    private String Descripcion[] = new String[]{"Horario: De 2:00 pm a 12:00 am \n" +
            "Dirección:  Pino Suarez # 228 \n"+
            "El mejor lugar para divertirte, con las mejores bebidas de la ciudad",

            "Horario: De 3:15 pm a 11:45 pm\n"+
                    "Dirección: Plaza principal # 20 \n"+
                    "Las mejores cervezas tradicionales con las mejores banadas de rock en vivo",

            "Horario: De 10:00 am a 12:00 am\n"+
                    "Dirección: Av. Colón #201 \n"+
                    "El mejor lugar para disfrutar con amigos, con las mejores promociones",

            "Horario: De 5:00 pm a 12:00 am\n"+
                    "Dirección: Xicotencatl #101 \n"+
                    "Las mejores micheladas con la mejor musica y el mejor ambiente",

            "Horario: De 22:00 pm a 03:00 am\n"+
                    "Dirección: 5 de mayo \n"+
                    "El mejor ambiente con la mejor musica y los mejores eventos",

            "Horario: De 10:00 pm a 03:00 am\n"+
                    "Dirección: Xicotencatl #101 \n"+
                    "Las mejores noches solo en Zona Hause, gran variedad de musica para bailar"};

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
                intent.putExtra("descripcion",Descripcion[position]);


                startActivity(intent);
            }


        });

    }

}