package com.example.spashscreen2.AdaptersRecyclers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spashscreen2.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterAmigos extends RecyclerView.Adapter<AdapterAmigos.ViewHolder> {

    List<ElementosAmigos> elementosAmigos = new ArrayList<>();
    LayoutInflater layoutInflater;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return elementosAmigos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageAmigo;
        public TextView nameAmigo;
        public TextView statusAmigo;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageAmigo = itemView.findViewById(R.id.imageAmigos);
            nameAmigo = itemView.findViewById(R.id.textoAmigos);
            statusAmigo = itemView.findViewById(R.id.statusAmigos);

        }
    }
}
