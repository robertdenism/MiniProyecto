package com.example.miniproyecto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<ListadoOcios> datos;
    final Adapter.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ListadoOcios item);
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nombreOcio;
        private final ImageView iconoOcio;
        final CardView cv;


        public ViewHolder(View itemView){
            super(itemView);
            nombreOcio = (TextView) itemView.findViewById(R.id.nombreOcio);
            iconoOcio = (ImageView) itemView.findViewById(R.id.iconoOcio);
            cv = (CardView) itemView.findViewById(R.id.cv);
        }


        public TextView getNombreOcio() {
            return nombreOcio;
        }
        public ImageView getIconoOcio(){
            return iconoOcio;
        }
        public CardView getCv(){
            return cv;
        }
        void bindData(final ListadoOcios item){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);
                }
            });
        }

    }

    public Adapter(ListadoOcios[] dataSet, Adapter.OnItemClickListener listener){
        this.listener = listener;
        datos = new ArrayList<ListadoOcios>();
        add(dataSet);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_nombre_ocio, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder,final int position) {
        viewHolder.getNombreOcio().setText(datos.get(position).getNombre());
        viewHolder.getIconoOcio().setImageResource(datos.get(position).getPicId());
        viewHolder.bindData(datos.get(position));
    }


    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void add(ListadoOcios[]dataSet){
        datos.addAll(Arrays.asList(dataSet));
        notifyDataSetChanged();
    }



}
