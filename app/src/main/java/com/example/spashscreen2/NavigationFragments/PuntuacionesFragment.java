package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.Model.Puntuaciones;
import com.example.spashscreen2.databinding.FragmentPuntuacionesBinding;
import com.example.spashscreen2.databinding.ViewholderPuntuacionesBinding;

import java.util.ArrayList;
import java.util.List;


public class PuntuacionesFragment extends Fragment {

    private FragmentPuntuacionesBinding binding;
    List<Puntuaciones> elementosPuntuaciones = new ArrayList<>();
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

        Puntuaciones puntuacion1 = new Puntuaciones();
        puntuacion1.setProfileImageURL("https://i.ibb.co/C1S6VkV/Teemo.png");
        puntuacion1.setUsername("Teemo Salvage");
        puntuacion1.setScore(10);
        elementosPuntuaciones.add(puntuacion1);

        Puntuaciones puntuacion2 = new Puntuaciones();
        puntuacion2.setProfileImageURL("https://i.ibb.co/j4CLhkq/Yasuo.png");
        puntuacion2.setUsername("21 Roger");
        puntuacion2.setScore(10);
        elementosPuntuaciones.add(puntuacion2);

        Puntuaciones puntuacion3 = new Puntuaciones();
        puntuacion3.setProfileImageURL("https://i.ibb.co/yyF170D/Padre-Willyrex.png");
        puntuacion3.setUsername("Willyrex");
        puntuacion3.setScore(10);
        elementosPuntuaciones.add(puntuacion3);

        Puntuaciones puntuacion4 = new Puntuaciones();
        puntuacion4.setProfileImageURL("https://i.ibb.co/KsFzJfw/Talon.png");
        puntuacion4.setUsername("21 Jhon");
        puntuacion4.setScore(10);
        elementosPuntuaciones.add(puntuacion4);

        Puntuaciones puntuacion5 = new Puntuaciones();
        puntuacion5.setProfileImageURL("https://i.ibb.co/2qcgnG1/G2.png");
        puntuacion5.setUsername("G2 Rekkles");
        puntuacion5.setScore(9);
        elementosPuntuaciones.add(puntuacion5);

        Puntuaciones puntuacion6 = new Puntuaciones();
        puntuacion6.setProfileImageURL("https://i.ibb.co/BBzc02V/Ekko.png");
        puntuacion6.setUsername("Xyphr");
        puntuacion6.setScore(9);
        elementosPuntuaciones.add(puntuacion6);

        Puntuaciones puntuacion7 = new Puntuaciones();
        puntuacion7.setProfileImageURL("https://i.ibb.co/YZzWJwF/Akali.png");
        puntuacion7.setUsername("Aldart");
        puntuacion7.setScore(9);
        elementosPuntuaciones.add(puntuacion7);

        Puntuaciones puntuacion8 = new Puntuaciones();
        puntuacion8.setProfileImageURL("https://i.ibb.co/j4CLhkq/Yasuo.png");
        puntuacion8.setUsername("MENTOS24");
        puntuacion8.setScore(8);
        elementosPuntuaciones.add(puntuacion8);

        Puntuaciones puntuacion9 = new Puntuaciones();
        puntuacion9.setProfileImageURL("https://i.ibb.co/YWcQ9MH/Irelia.png");
        puntuacion9.setUsername("Frimil");
        puntuacion9.setScore(8);
        elementosPuntuaciones.add(puntuacion9);

        Puntuaciones puntuacion10 = new Puntuaciones();
        puntuacion10.setProfileImageURL("https://i.ibb.co/9yK50y4/Camille.png");
        puntuacion10.setUsername("FRANPOWERFUL");
        puntuacion10.setScore(8);
        elementosPuntuaciones.add(puntuacion10);

        Puntuaciones puntuacion11 = new Puntuaciones();
        puntuacion11.setProfileImageURL("https://i.ibb.co/n7dPdj4/Evelynn.png");
        puntuacion11.setUsername("JDärk");
        puntuacion11.setScore(7);
        elementosPuntuaciones.add(puntuacion11);

        Puntuaciones puntuacion12 = new Puntuaciones();
        puntuacion12.setProfileImageURL("https://i.ibb.co/HnPZhQz/TSM.png");
        puntuacion12.setUsername("JakioXX");
        puntuacion12.setScore(7);
        elementosPuntuaciones.add(puntuacion12);

        Puntuaciones puntuacion13 = new Puntuaciones();
        puntuacion13.setProfileImageURL("https://i.ibb.co/d202bQD/Draven.png");
        puntuacion13.setUsername("T1 Faker");
        puntuacion13.setScore(5);
        elementosPuntuaciones.add(puntuacion13);

        Puntuaciones puntuacion14 = new Puntuaciones();
        puntuacion14.setProfileImageURL("https://i.ibb.co/LzXk19j/Proyecto.png");
        puntuacion14.setUsername("Vegetta777");
        puntuacion14.setScore(5);
        elementosPuntuaciones.add(puntuacion14);

        Puntuaciones puntuacion15 = new Puntuaciones();
        puntuacion15.setProfileImageURL("https://i.ibb.co/smpxhKL/Miss-Fortune.png");
        puntuacion15.setUsername("Auronplay");
        puntuacion15.setScore(5);
        elementosPuntuaciones.add(puntuacion15);

        Puntuaciones puntuacion16 = new Puntuaciones();
        puntuacion16.setProfileImageURL("https://i.ibb.co/HnPZhQz/TSM.png");
        puntuacion16.setUsername("Biyin");
        puntuacion16.setScore(5);
        elementosPuntuaciones.add(puntuacion16);

        Puntuaciones puntuacion17 = new Puntuaciones();
        puntuacion17.setProfileImageURL("https://i.ibb.co/BBzc02V/Ekko.png");
        puntuacion17.setUsername("Alexelcapo");
        puntuacion17.setScore(5);
        elementosPuntuaciones.add(puntuacion17);

        Puntuaciones puntuacion18 = new Puntuaciones();
        puntuacion18.setProfileImageURL("https://i.ibb.co/gMpFgM4/Gangplank.png");
        puntuacion18.setUsername("xQc");
        puntuacion18.setScore(4);
        elementosPuntuaciones.add(puntuacion18);

        Puntuaciones puntuacion19 = new Puntuaciones();
        puntuacion19.setProfileImageURL("https://i.ibb.co/w6Gqhff/Ahri.png");
        puntuacion19.setUsername("Romero");
        puntuacion19.setScore(4);
        elementosPuntuaciones.add(puntuacion19);

        Puntuaciones puntuacion20 = new Puntuaciones();
        puntuacion20.setProfileImageURL("https://i.ibb.co/1nzYpzq/Bronza.png");
        puntuacion20.setUsername("Teemo Salvage");
        puntuacion20.setScore(1);
        elementosPuntuaciones.add(puntuacion20);

        Puntuaciones puntuacion21 = new Puntuaciones();
        puntuacion21.setProfileImageURL("https://i.ibb.co/crHjdbn/DJSona.png");
        puntuacion21.setUsername("G2 Caps");
        puntuacion21.setScore(1);
        elementosPuntuaciones.add(puntuacion21);

    }

    public void mostrarDatos() {
        binding.recyclerViewPuntuaciones.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPuntuaciones = new AdapterPuntuaciones();
        binding.recyclerViewPuntuaciones.setAdapter(adapterPuntuaciones);
    }

    class AdapterPuntuaciones extends RecyclerView.Adapter<AdapterPuntuaciones.PuntuacionesViewHolder> {

        @NonNull
        @Override
        public PuntuacionesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new PuntuacionesViewHolder(ViewholderPuntuacionesBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(PuntuacionesViewHolder holder, int position) {

            String username = elementosPuntuaciones.get(position).getUsername();
            String score = String.valueOf(elementosPuntuaciones.get(position).getScore());

            holder.binding.usernamePuntuaciones.setText(username);
            holder.binding.numeroPuntuacion.setText(score);
            Glide.with(requireContext()).load(elementosPuntuaciones.get(position).getProfileImageURL()).into(holder.binding.playerIMG);

        }

        @Override
        public int getItemCount() {
            return elementosPuntuaciones.size();
        }

        class PuntuacionesViewHolder extends RecyclerView.ViewHolder {
            private final ViewholderPuntuacionesBinding binding;

            public PuntuacionesViewHolder(ViewholderPuntuacionesBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
        }

    }

}