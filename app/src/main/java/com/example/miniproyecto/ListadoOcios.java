package com.example.miniproyecto;

import androidx.cardview.widget.CardView;

import java.io.Serializable;
import java.util.ArrayList;

public class ListadoOcios implements Serializable {
        private Integer picId;
        private String nombre;
        private CardView cv;

        public ListadoOcios(String nombre, int picId){
            this.nombre = nombre;
            this.picId = picId;

        }

        public int getPicId() {
            return picId;
        }

        public void setPicId(int precio) {
            this.picId = picId;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


        /*
         * */
        public static ArrayList<ListadoOcios> generador(){
            ArrayList<ListadoOcios> ocios = new ArrayList<ListadoOcios>();
            ocios.add(new ListadoOcios("Teatros",R.drawable.drama));
            ocios.add(new ListadoOcios("Museos", R.drawable.pantheon));
            ocios.add(new ListadoOcios("Musica", R.drawable.music));
            ocios.add(new ListadoOcios("Deportes", R.drawable.ball));
            ocios.add(new ListadoOcios("Cine", R.drawable.video));

            return ocios;
        }


}
