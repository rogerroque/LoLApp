package com.example.spashscreen2.elementosPartidas;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterElementosPartidas extends RecyclerView.Adapter<AdapterElementosPartidas.ViewHoldeElementos> {

    List<ElementosPartidas> elementosPartidas = new ArrayList<>();

    public AdapterElementosPartidas() {

        elementosPartidas.add(new ElementosPartidas(, ))

    }

    @NonNull
    @Override
    public ViewHoldeElementos onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoldeElementos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHoldeElementos extends RecyclerView.ViewHolder {
        public ViewHoldeElementos(@NonNull View itemView) {
            super(itemView);
        }
    }
}
