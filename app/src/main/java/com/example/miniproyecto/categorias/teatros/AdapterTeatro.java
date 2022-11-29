package com.example.miniproyecto.categorias.teatros;


import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;


import com.example.miniproyecto.R;

public class AdapterTeatro extends RecyclerView.Adapter<AdapterTeatro.ViewHolder> {

    private String[] localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewNombre;
        private final TextView textViewCategria;
        private final TextView textViewDescripcion;
        private final TextView textViewDireccion;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            textViewNombre = (TextView) view.findViewById(R.id.textViewTitulo);
            textViewCategria = (TextView) view.findViewById(R.id.textViewCategoria);
            textViewDescripcion = (TextView) view.findViewById(R.id.textViewDescripcion);
            textViewDireccion = (TextView) view.findViewById(R.id.textViewDirecion);
        }

        public TextView getTextView() {return textViewNombre;}
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public AdapterTeatro(String[] dataSet) {localDataSet = dataSet;}

    // Create new views (invoked by the layout manager)


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_adapter_teatro,viewGroup, false);
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(localDataSet[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {return localDataSet.length;}
}