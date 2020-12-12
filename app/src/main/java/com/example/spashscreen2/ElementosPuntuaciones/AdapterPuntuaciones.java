package com.example.spashscreen2.ElementosPuntuaciones;

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

public class AdapterPuntuaciones extends RecyclerView.Adapter<AdapterPuntuaciones.ViewHolder> {

    List<ElementosPuntuaciones> elementosPuntuaciones;
    LayoutInflater layoutInflater;

    public AdapterPuntuaciones(List<ElementosPuntuaciones> elementosPuntuaciones, Context context) {
        this.elementosPuntuaciones = elementosPuntuaciones;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.puntuaciones_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String username = elementosPuntuaciones.get(position).getUsername();
        String score = String.valueOf(elementosPuntuaciones.get(position).getScore());
        String imgURL = elementosPuntuaciones.get(position).getProfileImageURL();

        holder.usernameHolder.setText(username);
        holder.scoreHolder.setText(score);
        Picasso.get().load(elementosPuntuaciones.get(position).getProfileImageURL()).into(holder.profileIMGHolder);

    }

    @Override
    public int getItemCount() {
        return elementosPuntuaciones.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView profileIMGHolder;
        public TextView usernameHolder;
        public TextView scoreHolder;


        ViewHolder(@NonNull View itemView) {
            super(itemView);

            profileIMGHolder = itemView.findViewById(R.id.playerIMG);
            usernameHolder = itemView.findViewById(R.id.usernamePuntuaciones);
            scoreHolder = itemView.findViewById(R.id.numeroPuntuacion);


        }

    }

}
