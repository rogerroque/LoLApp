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

public class AdapterPartidas extends RecyclerView.Adapter<AdapterPartidas.ViewHolder> {

    List<ElementosPartidas> partidasInfo;
    LayoutInflater layoutInflater;

    public AdapterPartidas(List<ElementosPartidas> partidasInfo, Context context) {
        this.partidasInfo = partidasInfo;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.partidas_list, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String timeAgo = partidasInfo.get(position).getTimeAgo();
        String kda = partidasInfo.get(position).getKda();
        String gameType = partidasInfo.get(position).getGameType();

        holder.timeAgo.setText(timeAgo);
        holder.kda.setText(kda);
        holder.gameType.setText(gameType);
        /*Glide.with(context).load(partidasInfo.get(position).getImgURL()).into(holder.playedChamp);*/
        Picasso.get().load(partidasInfo.get(position).getImgURL()).into(holder.playedChamp);
        Picasso.get().load(partidasInfo.get(position).getRune1()).into(holder.rune1);
        Picasso.get().load(partidasInfo.get(position).getRune2()).into(holder.rune2);
        Picasso.get().load(partidasInfo.get(position).getSpell1()).into(holder.spell1);
        Picasso.get().load(partidasInfo.get(position).getSpell2()).into(holder.spell2);
        Picasso.get().load(partidasInfo.get(position).getItem1()).into(holder.item1);
        Picasso.get().load(partidasInfo.get(position).getItem2()).into(holder.item2);
        Picasso.get().load(partidasInfo.get(position).getItem3()).into(holder.item3);
        Picasso.get().load(partidasInfo.get(position).getItem4()).into(holder.item4);
        Picasso.get().load(partidasInfo.get(position).getItem5()).into(holder.item5);
        Picasso.get().load(partidasInfo.get(position).getItem6()).into(holder.item6);
        Picasso.get().load(partidasInfo.get(position).getItem7()).into(holder.item7);

    }

    @Override
    public int getItemCount() {
        return partidasInfo.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView timeAgo, kda, gameType;
        public ImageView playedChamp;
        public View winLose;
        public ImageView rune1, rune2, spell1, spell2;
        public ImageView item1, item2, item3, item4, item5, item6, item7;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            timeAgo = itemView.findViewById(R.id.timeAgo);
            kda = itemView.findViewById(R.id.kda);
            gameType = itemView.findViewById(R.id.gameType);
            playedChamp = itemView.findViewById(R.id.imgPlayedChamp);
            winLose = itemView.findViewById(R.id.viewWinLose);
            rune1 = itemView.findViewById(R.id.rune1);
            rune2 = itemView.findViewById(R.id.rune2);
            spell1 = itemView.findViewById(R.id.spell1);
            spell2 = itemView.findViewById(R.id.spell2);

            item1 = itemView.findViewById(R.id.item1);
            item2 = itemView.findViewById(R.id.item2);
            item3 = itemView.findViewById(R.id.item3);
            item4 = itemView.findViewById(R.id.item4);
            item5 = itemView.findViewById(R.id.item5);
            item6 = itemView.findViewById(R.id.item6);
            item7 = itemView.findViewById(R.id.item7);

        }
    }

}
