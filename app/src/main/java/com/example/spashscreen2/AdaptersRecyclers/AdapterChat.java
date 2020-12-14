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

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.ViewHolder> {

    List<ElementosChat> elementosChats;
    LayoutInflater layoutInflater;

    public AdapterChat(List<ElementosChat> elementosChats, Context context) {
        this.elementosChats = elementosChats;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.chat_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String summoner = elementosChats.get(position).getNameChat();
        String status = elementosChats.get(position).getStatusChat();

        holder.name.setText(summoner);
        holder.status.setText(status);
        Picasso.get().load(elementosChats.get(position).getImgCharURL()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return elementosChats.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView name;
        public TextView status;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageViewChat);
            name = itemView.findViewById(R.id.summonerChat);
            status = itemView.findViewById(R.id.statusChat);

        }
    }
}
