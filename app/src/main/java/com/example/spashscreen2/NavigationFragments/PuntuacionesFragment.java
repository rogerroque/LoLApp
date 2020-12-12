package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.spashscreen2.ElementosPuntuaciones.AdapterPuntuaciones;
import com.example.spashscreen2.ElementosPuntuaciones.ElementosPuntuaciones;
import com.example.spashscreen2.databinding.FragmentPuntuacionesBinding;

import java.util.ArrayList;
import java.util.List;


public class PuntuacionesFragment extends Fragment {

    private FragmentPuntuacionesBinding binding;
    List<ElementosPuntuaciones> elementosPuntuaciones = new ArrayList<>();
    AdapterPuntuaciones adapterPuntuaciones;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPuntuacionesBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cargarPuntuaciones();
        mostrarDatos();

    }

    public void cargarPuntuaciones () {

        ElementosPuntuaciones puntuacion1 = new ElementosPuntuaciones();
        puntuacion1.setProfileImageURL("https://i.ibb.co/C1S6VkV/Teemo.png");
        puntuacion1.setUsername("Teemo Salvage");
        puntuacion1.setScore(10);
        elementosPuntuaciones.add(puntuacion1);

        ElementosPuntuaciones puntuacion2 = new ElementosPuntuaciones();
        puntuacion2.setProfileImageURL("https://i.ibb.co/j4CLhkq/Yasuo.png");
        puntuacion2.setUsername("21 Roger");
        puntuacion2.setScore(10);
        elementosPuntuaciones.add(puntuacion2);

        ElementosPuntuaciones puntuacion3 = new ElementosPuntuaciones();
        puntuacion3.setProfileImageURL("https://i.ibb.co/yyF170D/Padre-Willyrex.png");
        puntuacion3.setUsername("Willyrex");
        puntuacion3.setScore(10);
        elementosPuntuaciones.add(puntuacion3);

        ElementosPuntuaciones puntuacion4 = new ElementosPuntuaciones();
        puntuacion4.setProfileImageURL("https://i.ibb.co/KsFzJfw/Talon.png");
        puntuacion4.setUsername("21 Jhon");
        puntuacion4.setScore(10);
        elementosPuntuaciones.add(puntuacion4);

        ElementosPuntuaciones puntuacion5 = new ElementosPuntuaciones();
        puntuacion5.setProfileImageURL("https://i.ibb.co/2qcgnG1/G2.png");
        puntuacion5.setUsername("G2 Rekkles");
        puntuacion5.setScore(9);
        elementosPuntuaciones.add(puntuacion5);

        ElementosPuntuaciones puntuacion6 = new ElementosPuntuaciones();
        puntuacion6.setProfileImageURL("https://i.ibb.co/BBzc02V/Ekko.png");
        puntuacion6.setUsername("Xyphr");
        puntuacion6.setScore(9);
        elementosPuntuaciones.add(puntuacion6);

        ElementosPuntuaciones puntuacion7 = new ElementosPuntuaciones();
        puntuacion7.setProfileImageURL("https://i.ibb.co/YZzWJwF/Akali.png");
        puntuacion7.setUsername("Aldart");
        puntuacion7.setScore(9);
        elementosPuntuaciones.add(puntuacion7);

        ElementosPuntuaciones puntuacion8 = new ElementosPuntuaciones();
        puntuacion8.setProfileImageURL("https://i.ibb.co/j4CLhkq/Yasuo.png");
        puntuacion8.setUsername("MENTOS24");
        puntuacion8.setScore(8);
        elementosPuntuaciones.add(puntuacion8);

        ElementosPuntuaciones puntuacion9 = new ElementosPuntuaciones();
        puntuacion9.setProfileImageURL("https://i.ibb.co/YWcQ9MH/Irelia.png");
        puntuacion9.setUsername("Frimil");
        puntuacion9.setScore(8);
        elementosPuntuaciones.add(puntuacion9);

        ElementosPuntuaciones puntuacion10 = new ElementosPuntuaciones();
        puntuacion10.setProfileImageURL("https://i.ibb.co/9yK50y4/Camille.png");
        puntuacion10.setUsername("FRANPOWERFUL");
        puntuacion10.setScore(8);
        elementosPuntuaciones.add(puntuacion10);

        ElementosPuntuaciones puntuacion11 = new ElementosPuntuaciones();
        puntuacion11.setProfileImageURL("https://i.ibb.co/n7dPdj4/Evelynn.png");
        puntuacion11.setUsername("JDärk");
        puntuacion11.setScore(7);
        elementosPuntuaciones.add(puntuacion11);

        ElementosPuntuaciones puntuacion12 = new ElementosPuntuaciones();
        puntuacion12.setProfileImageURL("https://i.ibb.co/HnPZhQz/TSM.png");
        puntuacion12.setUsername("JakioXX");
        puntuacion12.setScore(7);
        elementosPuntuaciones.add(puntuacion12);

        ElementosPuntuaciones puntuacion13 = new ElementosPuntuaciones();
        puntuacion13.setProfileImageURL("https://i.ibb.co/d202bQD/Draven.png");
        puntuacion13.setUsername("T1 Faker");
        puntuacion13.setScore(5);
        elementosPuntuaciones.add(puntuacion13);

        ElementosPuntuaciones puntuacion14 = new ElementosPuntuaciones();
        puntuacion14.setProfileImageURL("https://i.ibb.co/LzXk19j/Proyecto.png");
        puntuacion14.setUsername("Vegetta777");
        puntuacion14.setScore(5);
        elementosPuntuaciones.add(puntuacion14);

        ElementosPuntuaciones puntuacion15 = new ElementosPuntuaciones();
        puntuacion15.setProfileImageURL("https://i.ibb.co/smpxhKL/Miss-Fortune.png");
        puntuacion15.setUsername("Auronplay");
        puntuacion15.setScore(5);
        elementosPuntuaciones.add(puntuacion15);

        ElementosPuntuaciones puntuacion16 = new ElementosPuntuaciones();
        puntuacion16.setProfileImageURL("https://i.ibb.co/HnPZhQz/TSM.png");
        puntuacion16.setUsername("Biyin");
        puntuacion16.setScore(5);
        elementosPuntuaciones.add(puntuacion16);

        ElementosPuntuaciones puntuacion17 = new ElementosPuntuaciones();
        puntuacion17.setProfileImageURL("https://i.ibb.co/BBzc02V/Ekko.png");
        puntuacion17.setUsername("Alexelcapo");
        puntuacion17.setScore(5);
        elementosPuntuaciones.add(puntuacion17);

        ElementosPuntuaciones puntuacion18 = new ElementosPuntuaciones();
        puntuacion18.setProfileImageURL("https://i.ibb.co/gMpFgM4/Gangplank.png");
        puntuacion18.setUsername("xQc");
        puntuacion18.setScore(4);
        elementosPuntuaciones.add(puntuacion18);

        ElementosPuntuaciones puntuacion19 = new ElementosPuntuaciones();
        puntuacion19.setProfileImageURL("https://i.ibb.co/w6Gqhff/Ahri.png");
        puntuacion19.setUsername("Romero");
        puntuacion19.setScore(4);
        elementosPuntuaciones.add(puntuacion19);

        ElementosPuntuaciones puntuacion20 = new ElementosPuntuaciones();
        puntuacion20.setProfileImageURL("https://i.ibb.co/1nzYpzq/Bronza.png");
        puntuacion20.setUsername("Teemo Salvage");
        puntuacion20.setScore(1);
        elementosPuntuaciones.add(puntuacion20);

        ElementosPuntuaciones puntuacion21 = new ElementosPuntuaciones();
        puntuacion21.setProfileImageURL("https://i.ibb.co/crHjdbn/DJSona.png");
        puntuacion21.setUsername("G2 Caps");
        puntuacion21.setScore(1);
        elementosPuntuaciones.add(puntuacion21);

    }

    public void mostrarDatos() {
        binding.recyclerViewPuntuaciones.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPuntuaciones = new AdapterPuntuaciones(elementosPuntuaciones, getContext());
        binding.recyclerViewPuntuaciones.setAdapter(adapterPuntuaciones);
    }

}