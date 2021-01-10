package com.example.spashscreen2.AdaptersRecyclers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spashscreen2.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterAmigos extends RecyclerView.Adapter<AdapterAmigos.ViewHolder> {

    List<ElementosAmigos> elementosAmigos;
    LayoutInflater layoutInflater;

    public AdapterAmigos(List<ElementosAmigos> elementosAmigos, Context context) {
        this.elementosAmigos = elementosAmigos;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.amigos_list, parent, false);
        return new AdapterAmigos.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String summonerName = elementosAmigos.get(position).getNameAmigo();
        String summonerStatus = elementosAmigos.get(position).getStatusAmigo();

        holder.nameAmigo.setText(summonerName);
        holder.statusAmigo.setText(summonerStatus);
        Picasso.get().load(elementosAmigos.get(position).getImgUrlAmigo()).into(holder.imageAmigo);
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
