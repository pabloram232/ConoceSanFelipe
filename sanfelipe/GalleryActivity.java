package com.utng.pabloram.sanfelipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.utng.pabloram.sanfelipe.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    int[] imagenes = {R.drawable.galeria1,R.drawable.galeria11,R.drawable.galeria12,
            R.drawable.galeria4,R.drawable.galeria6,R.drawable.galeria7
            ,R.drawable.galeria8,R.drawable.galeria9,R.drawable.galeria10
            ,R.drawable.galeria13,R.drawable.galeria14};

    ManejadorGaleria manejadorGaleria;
    ViewPager mViewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        this.setTitle(R.string.gallery);


        //Galeria de imagenes
        manejadorGaleria= new ManejadorGaleria(getSupportFragmentManager());

        mViewpager=(ViewPager)findViewById(R.id.pager);
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[0]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[1]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[2]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[3]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[4]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[5]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[6]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[7]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[8]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[9]));
        manejadorGaleria.agregarFragmentos(FragmentosImagenes.newInstance(imagenes[10]));


        mViewpager.setAdapter(manejadorGaleria);
    }
    public class ManejadorGaleria extends FragmentPagerAdapter {
        List<Fragment> fragmentos;

        public ManejadorGaleria(FragmentManager fm) {
            super(fm);
            fragmentos = new ArrayList();
        }

        public void agregarFragmentos(Fragment xfragmento) {
            fragmentos.add(xfragmento);
        }


        @Override
        public Fragment getItem(int position) {

            return fragmentos.get(position);
        }

        @Override
        public int getCount() {

            return fragmentos.size();
        }
    }
    public static class FragmentosImagenes extends Fragment {
        private static final String ARG_IMAGE="imagen";
        private int imagen;

        public  static  FragmentosImagenes newInstance(int imagen){
            FragmentosImagenes fragment = new FragmentosImagenes();
            Bundle args = new Bundle();
            args.putInt(ARG_IMAGE, imagen);
            fragment.setArguments(args);
            fragment.setRetainInstance(true);
            return fragment;

        }
        @Override
        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            if(getArguments()!=null){
                imagen=getArguments().getInt(ARG_IMAGE);
            }
        }
        public FragmentosImagenes(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
            ImageView imageView =(ImageView) rootView.findViewById(R.id.imageView1);
            imageView.setImageResource(imagen);
            return rootView;
        }
    }
}

