package com.example.spashscreen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.spashscreen2.databinding.FragmentHistorialPartidasBinding;
import com.example.spashscreen2.AdaptersRecyclers.AdapterPartidas;
import com.example.spashscreen2.AdaptersRecyclers.ElementosPartidas;

import java.util.ArrayList;
import java.util.List;

public class HistorialPartidasFragment extends Fragment {

    private FragmentHistorialPartidasBinding binding;
    AdapterPartidas adapterPartidas;
    List<ElementosPartidas> partidasInfos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHistorialPartidasBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cargarPartidas();
        mostrarDatos();

    }

    public void cargarPartidas() {

        ElementosPartidas game1 = new ElementosPartidas();
        game1.setKda("10/0/10");
        game1.setGameType("Clasificatoria");
        game1.setTimeAgo("Hace 6 horas");
        game1.setImgURL("https://i.ibb.co/QChQdcN/mas-jugado-lee.png");
        game1.setRune1("https://i.ibb.co/hmrRZmx/Domination.webp");
        game1.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game1.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game1.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game1.setItem1("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game1.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game1.setItem3("https://i.ibb.co/2YnLc61/dos-Cuchillas.png");
        game1.setItem4("https://i.ibb.co/tCyFhR4/Ward.png");
        game1.setItem5("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        game1.setItem6("https://i.ibb.co/qCX7gxB/Death-Dance.png");
        game1.setItem7("https://i.ibb.co/FnqQcHS/NoItem.png");
        partidasInfos.add(game1);

        ElementosPartidas game2 = new ElementosPartidas();
        game2.setKda("15/5/10");
        game2.setGameType("Clasificatoria");
        game2.setTimeAgo("Hace 8 horas");
        game2.setImgURL("https://i.ibb.co/MN81YW1/mas-jugado-jax.png");
        game2.setRune1("https://i.ibb.co/BZRT1tx/Precision.webp");
        game2.setRune2("https://i.ibb.co/gMH74vW/Resolve.webp");
        game2.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game2.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game2.setItem1("https://i.ibb.co/w4VSQ8g/Pu-o-Helado.png");
        game2.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game2.setItem3("https://i.ibb.co/FnqQcHS/NoItem.png");
        game2.setItem4("https://i.ibb.co/BTQ1PHL/red-trinket.webp");
        game2.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game2.setItem6("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game2.setItem7("https://i.ibb.co/Gn0cPKr/Hoja-Carmesi.png");
        partidasInfos.add(game2);

        ElementosPartidas game3 = new ElementosPartidas();
        game3.setKda("20/10/10");
        game3.setGameType("Clasificatoria");
        game3.setTimeAgo("Hace 1 dia");
        game3.setImgURL("https://i.ibb.co/1ZmGcK3/mas-jugado-jarvan.png");
        game3.setRune1("https://i.ibb.co/gMH74vW/Resolve.webp");
        game3.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game3.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game3.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game3.setItem1("https://i.ibb.co/w4VSQ8g/Pu-o-Helado.png");
        game3.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game3.setItem3("https://i.ibb.co/FnqQcHS/NoItem.png");
        game3.setItem4("https://i.ibb.co/tCyFhR4/Ward.png");
        game3.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game3.setItem6("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game3.setItem7("https://i.ibb.co/Gn0cPKr/Hoja-Carmesi.png");
        partidasInfos.add(game3);

        ElementosPartidas game4 = new ElementosPartidas();
        game4.setKda("20/10/10");
        game4.setGameType("Clasificatoria");
        game4.setTimeAgo("Hace 1 dia");
        game4.setImgURL("https://i.ibb.co/PhDx82h/mas-jugado-teemo.png");
        game4.setRune1("https://i.ibb.co/0t3Ytyz/Sorcery.webp");
        game4.setRune2("https://i.ibb.co/hmrRZmx/Domination.webp");
        game4.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game4.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game4.setItem1("https://i.ibb.co/3dxHz51/Luden-s.png");
        game4.setItem2("https://i.ibb.co/LPJ5S8K/Nashor-s-Tooth.png");
        game4.setItem3("https://i.ibb.co/YNWg3J1/Rectangle-211.png");
        game4.setItem4("https://i.ibb.co/VVT20wy/elAzul.webp");
        game4.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game4.setItem6("https://i.ibb.co/1vznfqK/Rabadon-s-Deathcap.png");
        game4.setItem7("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        partidasInfos.add(game4);

        ElementosPartidas game5 = new ElementosPartidas();
        game5.setKda("20/10/10");
        game5.setGameType("Clasificatoria");
        game5.setTimeAgo("Hace 1 dia");
        game5.setImgURL("https://i.ibb.co/1ZmGcK3/mas-jugado-jarvan.png");
        game5.setRune1("https://i.ibb.co/gMH74vW/Resolve.webp");
        game5.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game5.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game5.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game5.setItem1("https://i.ibb.co/w4VSQ8g/Pu-o-Helado.png");
        game5.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game5.setItem3("https://i.ibb.co/FnqQcHS/NoItem.png");
        game5.setItem4("https://i.ibb.co/tCyFhR4/Ward.png");
        game5.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game5.setItem6("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game5.setItem7("https://i.ibb.co/Gn0cPKr/Hoja-Carmesi.png");
        partidasInfos.add(game5);

        ElementosPartidas game6 = new ElementosPartidas();
        game6.setKda("20/10/10");
        game6.setGameType("Clasificatoria");
        game6.setTimeAgo("Hace 1 dia");
        game6.setImgURL("https://i.ibb.co/QChQdcN/mas-jugado-lee.png");
        game6.setRune1("https://i.ibb.co/hmrRZmx/Domination.webp");
        game6.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game6.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game6.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game6.setItem1("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game6.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game6.setItem3("https://i.ibb.co/2YnLc61/dos-Cuchillas.png");
        game6.setItem4("https://i.ibb.co/tCyFhR4/Ward.png");
        game6.setItem5("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        game6.setItem6("https://i.ibb.co/qCX7gxB/Death-Dance.png");
        game6.setItem7("https://i.ibb.co/FnqQcHS/NoItem.png");
        partidasInfos.add(game6);

        ElementosPartidas game7 = new ElementosPartidas();
        game7.setKda("20/10/10");
        game7.setGameType("Clasificatoria");
        game7.setTimeAgo("Hace 1 dia");
        game7.setImgURL("https://i.ibb.co/CbPyWN4/mas-jugado-yi.png");
        game7.setRune1("https://i.ibb.co/hmrRZmx/Domination.webp");
        game7.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game7.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game7.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game7.setItem1("https://i.ibb.co/3dxHz51/Luden-s.png");
        game7.setItem2("https://i.ibb.co/LPJ5S8K/Nashor-s-Tooth.png");
        game7.setItem3("https://i.ibb.co/YNWg3J1/Rectangle-211.png");
        game7.setItem4("https://i.ibb.co/VVT20wy/elAzul.webp");
        game7.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game7.setItem6("https://i.ibb.co/1vznfqK/Rabadon-s-Deathcap.png");
        game7.setItem7("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        partidasInfos.add(game7);

        ElementosPartidas game8 = new ElementosPartidas();
        game8.setKda("20/10/10");
        game8.setGameType("Clasificatoria");
        game8.setTimeAgo("Hace 1 dia");
        game8.setImgURL("https://i.ibb.co/QChQdcN/mas-jugado-lee.png");
        game8.setRune1("https://i.ibb.co/hmrRZmx/Domination.webp");
        game8.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game8.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game8.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game8.setItem1("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game8.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game8.setItem3("https://i.ibb.co/2YnLc61/dos-Cuchillas.png");
        game8.setItem4("https://i.ibb.co/tCyFhR4/Ward.png");
        game8.setItem5("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        game8.setItem6("https://i.ibb.co/qCX7gxB/Death-Dance.png");
        game8.setItem7("https://i.ibb.co/FnqQcHS/NoItem.png");
        partidasInfos.add(game8);

        ElementosPartidas game9 = new ElementosPartidas();
        game9.setKda("20/10/10");
        game9.setGameType("Clasificatoria");
        game9.setTimeAgo("Hace 1 dia");
        game9.setImgURL("https://i.ibb.co/1ZmGcK3/mas-jugado-jarvan.png");
        game9.setRune1("https://i.ibb.co/gMH74vW/Resolve.webp");
        game9.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game9.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game9.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game9.setItem1("https://i.ibb.co/w4VSQ8g/Pu-o-Helado.png");
        game9.setItem2("https://i.ibb.co/3NF7VcW/Draktar.png");
        game9.setItem3("https://i.ibb.co/FnqQcHS/NoItem.png");
        game9.setItem4("https://i.ibb.co/VVT20wy/elAzul.webp");
        game9.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game9.setItem6("https://i.ibb.co/xMCGKcb/Guardian-Angel.png");
        game9.setItem7("https://i.ibb.co/Gn0cPKr/Hoja-Carmesi.png");
        partidasInfos.add(game9);

        ElementosPartidas game10 = new ElementosPartidas();
        game10.setKda("20/10/10");
        game10.setGameType("Clasificatoria");
        game10.setTimeAgo("Hace 1 dia");
        game10.setImgURL("https://i.ibb.co/CbPyWN4/mas-jugado-yi.png");
        game10.setRune1("https://i.ibb.co/hmrRZmx/Domination.webp");
        game10.setRune2("https://i.ibb.co/BZRT1tx/Precision.webp");
        game10.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game10.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game10.setItem1("https://i.ibb.co/3dxHz51/Luden-s.png");
        game10.setItem2("https://i.ibb.co/LPJ5S8K/Nashor-s-Tooth.png");
        game10.setItem3("https://i.ibb.co/YNWg3J1/Rectangle-211.png");
        game10.setItem4("https://i.ibb.co/BTQ1PHL/red-trinket.webp");
        game10.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game10.setItem6("https://i.ibb.co/1vznfqK/Rabadon-s-Deathcap.png");
        game10.setItem7("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        partidasInfos.add(game10);

        ElementosPartidas game11 = new ElementosPartidas();
        game11.setKda("20/10/10");
        game11.setGameType("Clasificatoria");
        game11.setTimeAgo("Hace 1 dia");
        game11.setImgURL("https://i.ibb.co/PhDx82h/mas-jugado-teemo.png");
        game11.setRune1("https://i.ibb.co/0t3Ytyz/Sorcery.webp");
        game11.setRune2("https://i.ibb.co/hmrRZmx/Domination.webp");
        game11.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game11.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game11.setItem1("https://i.ibb.co/3dxHz51/Luden-s.png");
        game11.setItem2("https://i.ibb.co/LPJ5S8K/Nashor-s-Tooth.png");
        game11.setItem3("https://i.ibb.co/YNWg3J1/Rectangle-211.png");
        game11.setItem4("https://i.ibb.co/tCyFhR4/Ward.png");
        game11.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game11.setItem6("https://i.ibb.co/1vznfqK/Rabadon-s-Deathcap.png");
        game11.setItem7("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        partidasInfos.add(game11);

        ElementosPartidas game12 = new ElementosPartidas();
        game12.setKda("20/10/10");
        game12.setGameType("Clasificatoria");
        game12.setTimeAgo("Hace 1 dia");
        game12.setImgURL("https://i.ibb.co/PhDx82h/mas-jugado-teemo.png");
        game12.setRune1("https://i.ibb.co/0t3Ytyz/Sorcery.webp");
        game12.setRune2("https://i.ibb.co/hmrRZmx/Domination.webp");
        game12.setSpell1("https://i.ibb.co/bK0GrJj/flash.webp");
        game12.setSpell2("https://i.ibb.co/mCWHQYj/smite.webp");
        game12.setItem1("https://i.ibb.co/3dxHz51/Luden-s.png");
        game12.setItem2("https://i.ibb.co/LPJ5S8K/Nashor-s-Tooth.png");
        game12.setItem3("https://i.ibb.co/YNWg3J1/Rectangle-211.png");
        game12.setItem4("https://i.ibb.co/BTQ1PHL/red-trinket.webp");
        game12.setItem5("https://i.ibb.co/grwVDHP/Berserker-s-Greaves-item.webp");
        game12.setItem6("https://i.ibb.co/1vznfqK/Rabadon-s-Deathcap.png");
        game12.setItem7("https://i.ibb.co/5cMcGPF/Mercury-s.png");
        partidasInfos.add(game12);

    }

    public void mostrarDatos() {
        binding.recyclerViewPartidas.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPartidas = new AdapterPartidas(partidasInfos, getContext());
        binding.recyclerViewPartidas.setAdapter(adapterPartidas);
    }

}