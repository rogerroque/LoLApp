package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spashscreen2.AdaptersRecyclers.AdapterAmigos;
import com.example.spashscreen2.AdaptersRecyclers.AdapterChat;
import com.example.spashscreen2.AdaptersRecyclers.ElementosAmigos;
import com.example.spashscreen2.AdaptersRecyclers.ElementosChat;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentAmigosBinding;

import java.util.ArrayList;
import java.util.List;

public class AmigosFragment extends Fragment {

    private FragmentAmigosBinding binding;
    private List<ElementosAmigos> elementosAmigos = new ArrayList<>();
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

        ElementosAmigos amic1 = new ElementosAmigos();
        amic1.setImgUrlAmigo("https://i.ibb.co/C1S6VkV/Teemo.png");
        amic1.setNameAmigo("Teemo salvage");
        amic1.setStatusAmigo("Online");
        elementosAmigos.add(amic1);

        ElementosAmigos amic2 = new ElementosAmigos();
        amic2.setImgUrlAmigo("https://i.ibb.co/KsFzJfw/Talon.png");
        amic2.setNameAmigo("21Jhon");
        amic2.setStatusAmigo("Online");
        elementosAmigos.add(amic2);

        ElementosAmigos amic3 = new ElementosAmigos();
        amic3.setImgUrlAmigo("https://i.ibb.co/yyF170D/Padre-Willyrex.png");
        amic3.setNameAmigo("Willyrex");
        amic3.setStatusAmigo("Online");
        elementosAmigos.add(amic3);

        ElementosAmigos amic4 = new ElementosAmigos();
        amic4.setImgUrlAmigo("https://i.ibb.co/2qcgnG1/G2.png");
        amic4.setNameAmigo("G2 Rekkles");
        amic4.setStatusAmigo("Online");
        elementosAmigos.add(amic4);

        ElementosAmigos amic5 = new ElementosAmigos();
        amic5.setImgUrlAmigo("https://i.ibb.co/DMfyBkv/Riven.png");
        amic5.setNameAmigo("Caps");
        amic5.setStatusAmigo("Online");
        elementosAmigos.add(amic5);

        ElementosAmigos amic6 = new ElementosAmigos();
        amic6.setImgUrlAmigo("https://i.ibb.co/j4CLhkq/Yasuo.png");
        amic6.setNameAmigo("MENTOS24");
        amic6.setStatusAmigo("Online");
        elementosAmigos.add(amic6);

        ElementosAmigos amic7 = new ElementosAmigos();
        amic7.setImgUrlAmigo("https://i.ibb.co/BBzc02V/Ekko.png");
        amic7.setNameAmigo("Xyphr");
        amic7.setStatusAmigo("Online");
        elementosAmigos.add(amic7);

        ElementosAmigos amic8 = new ElementosAmigos();
        amic8.setImgUrlAmigo("https://i.ibb.co/gMpFgM4/Gangplank.png");
        amic8.setNameAmigo("xQc");
        amic8.setStatusAmigo("Online");
        elementosAmigos.add(amic8);

        ElementosAmigos amic9 = new ElementosAmigos();
        amic9.setImgUrlAmigo("https://i.ibb.co/1nzYpzq/Bronza.png");
        amic9.setNameAmigo("21 Savage");
        amic9.setStatusAmigo("Online");
        elementosAmigos.add(amic9);

        ElementosAmigos amic10 = new ElementosAmigos();
        amic10.setImgUrlAmigo("https://i.ibb.co/crHjdbn/DJSona.png");
        amic10.setNameAmigo("Travis Scott");
        amic10.setStatusAmigo("Online");
        elementosAmigos.add(amic10);

        ElementosAmigos amic11 = new ElementosAmigos();
        amic11.setImgUrlAmigo("https://i.ibb.co/d202bQD/Draven.png");
        amic11.setNameAmigo("Lil Uzi Vert");
        amic11.setStatusAmigo("Online");
        elementosAmigos.add(amic11);

        ElementosAmigos amic12 = new ElementosAmigos();
        amic12.setImgUrlAmigo("https://i.ibb.co/88g481W/SKT.png");
        amic12.setNameAmigo("riskmon");
        amic12.setStatusAmigo("Online");
        elementosAmigos.add(amic12);

        ElementosAmigos amic13 = new ElementosAmigos();
        amic13.setImgUrlAmigo("https://i.ibb.co/YZzWJwF/Akali.png");
        amic13.setNameAmigo("Aldart");
        amic13.setStatusAmigo("Online");
        elementosAmigos.add(amic13);

        ElementosAmigos amic14 = new ElementosAmigos();
        amic14.setImgUrlAmigo("https://i.ibb.co/w6Gqhff/Ahri.png");
        amic14.setNameAmigo("Romero");
        amic14.setStatusAmigo("Online");
        elementosAmigos.add(amic14);

        ElementosAmigos amic15 = new ElementosAmigos();
        amic15.setImgUrlAmigo("https://i.ibb.co/HnPZhQz/TSM.png");
        amic15.setNameAmigo("JakioX");
        amic15.setStatusAmigo("Online");
        elementosAmigos.add(amic15);

    }

    private void cargarAmigos() {

        binding.recyclerViewAmigos.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterAmigos = new AdapterAmigos(elementosAmigos, getContext());
        binding.recyclerViewAmigos.setAdapter(adapterAmigos);

    }
}