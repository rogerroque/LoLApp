package com.example.spashscreen2.NavigationFragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.AdaptersRecyclers.Amigos;
import com.example.spashscreen2.HistorialPartidasFragment;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentAmigosBinding;
import com.example.spashscreen2.databinding.ViewholderAmigosBinding;
import com.example.spashscreen2.databinding.ViewholderPartidaBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AmigosFragment extends Fragment {

    private FragmentAmigosBinding binding;
    private List<Amigos> elementosAmigos = new ArrayList<>();
    private AdapterAmigos adapterAmigos;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return (binding = FragmentAmigosBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cargarAmigos();
        mostrarAmigos();

    }

    private void mostrarAmigos() {

        Amigos amic1 = new Amigos();
        amic1.setImgUrlAmigo("https://i.ibb.co/C1S6VkV/Teemo.png");
        amic1.setNameAmigo("Teemo salvage");
        amic1.setStatusAmigo("Online");
        elementosAmigos.add(amic1);

        Amigos amic2 = new Amigos();
        amic2.setImgUrlAmigo("https://i.ibb.co/KsFzJfw/Talon.png");
        amic2.setNameAmigo("21Jhon");
        amic2.setStatusAmigo("Online");
        elementosAmigos.add(amic2);

        Amigos amic3 = new Amigos();
        amic3.setImgUrlAmigo("https://i.ibb.co/yyF170D/Padre-Willyrex.png");
        amic3.setNameAmigo("Willyrex");
        amic3.setStatusAmigo("Online");
        elementosAmigos.add(amic3);

        Amigos amic4 = new Amigos();
        amic4.setImgUrlAmigo("https://i.ibb.co/2qcgnG1/G2.png");
        amic4.setNameAmigo("G2 Rekkles");
        amic4.setStatusAmigo("Online");
        elementosAmigos.add(amic4);

        Amigos amic5 = new Amigos();
        amic5.setImgUrlAmigo("https://i.ibb.co/DMfyBkv/Riven.png");
        amic5.setNameAmigo("Caps");
        amic5.setStatusAmigo("Online");
        elementosAmigos.add(amic5);

        Amigos amic6 = new Amigos();
        amic6.setImgUrlAmigo("https://i.ibb.co/j4CLhkq/Yasuo.png");
        amic6.setNameAmigo("MENTOS24");
        amic6.setStatusAmigo("Online");
        elementosAmigos.add(amic6);

        Amigos amic7 = new Amigos();
        amic7.setImgUrlAmigo("https://i.ibb.co/BBzc02V/Ekko.png");
        amic7.setNameAmigo("Xyphr");
        amic7.setStatusAmigo("Online");
        elementosAmigos.add(amic7);

        Amigos amic8 = new Amigos();
        amic8.setImgUrlAmigo("https://i.ibb.co/gMpFgM4/Gangplank.png");
        amic8.setNameAmigo("xQc");
        amic8.setStatusAmigo("Online");
        elementosAmigos.add(amic8);

        Amigos amic9 = new Amigos();
        amic9.setImgUrlAmigo("https://i.ibb.co/1nzYpzq/Bronza.png");
        amic9.setNameAmigo("21 Savage");
        amic9.setStatusAmigo("Online");
        elementosAmigos.add(amic9);

        Amigos amic10 = new Amigos();
        amic10.setImgUrlAmigo("https://i.ibb.co/crHjdbn/DJSona.png");
        amic10.setNameAmigo("Travis Scott");
        amic10.setStatusAmigo("Online");
        elementosAmigos.add(amic10);

        Amigos amic11 = new Amigos();
        amic11.setImgUrlAmigo("https://i.ibb.co/d202bQD/Draven.png");
        amic11.setNameAmigo("Lil Uzi Vert");
        amic11.setStatusAmigo("Online");
        elementosAmigos.add(amic11);

        Amigos amic12 = new Amigos();
        amic12.setImgUrlAmigo("https://i.ibb.co/88g481W/SKT.png");
        amic12.setNameAmigo("riskmon");
        amic12.setStatusAmigo("Online");
        elementosAmigos.add(amic12);

        Amigos amic13 = new Amigos();
        amic13.setImgUrlAmigo("https://i.ibb.co/YZzWJwF/Akali.png");
        amic13.setNameAmigo("Aldart");
        amic13.setStatusAmigo("Online");
        elementosAmigos.add(amic13);

        Amigos amic14 = new Amigos();
        amic14.setImgUrlAmigo("https://i.ibb.co/w6Gqhff/Ahri.png");
        amic14.setNameAmigo("Romero");
        amic14.setStatusAmigo("Online");
        elementosAmigos.add(amic14);

        Amigos amic15 = new Amigos();
        amic15.setImgUrlAmigo("https://i.ibb.co/HnPZhQz/TSM.png");
        amic15.setNameAmigo("JakioX");
        amic15.setStatusAmigo("Online");
        elementosAmigos.add(amic15);

    }

    private void cargarAmigos() {

        binding.recyclerViewAmigos.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterAmigos = new AdapterAmigos();
        binding.recyclerViewAmigos.setAdapter(adapterAmigos);

    }

    class AdapterAmigos extends RecyclerView.Adapter<AdapterAmigos.AmigosViewHolder> {

        @NonNull
        @Override
        public AmigosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AmigosViewHolder(ViewholderAmigosBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull AmigosViewHolder holder, int position) {
            String summonerName = elementosAmigos.get(position).getNameAmigo();
            String summonerStatus = elementosAmigos.get(position).getStatusAmigo();

            holder.binding.textoAmigos.setText(summonerName);
            holder.binding.statusAmigos.setText(summonerStatus);

            Glide.with(requireContext()).load(elementosAmigos.get(position).getImgUrlAmigo()).into(holder.binding.imageAmigos);

        }

        @Override
        public int getItemCount() {
            return elementosAmigos.size();
        }

        class AmigosViewHolder extends RecyclerView.ViewHolder {
            private final ViewholderAmigosBinding binding;

            public AmigosViewHolder(ViewholderAmigosBinding binding) {
                super(binding.getRoot());
                this.binding = binding;

            }
        }
    }


}