package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentCambiarIdiomaBinding;
import com.example.spashscreen2.databinding.FragmentPuntuacionesBinding;
import com.squareup.picasso.Picasso;


public class CambiarIdiomaFragment extends Fragment {

    private FragmentCambiarIdiomaBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCambiarIdiomaBinding.inflate(inflater, container, false);
        return binding.getRoot();
        /*return inflater.inflate(R.layout.fragment_cambiar_idioma, container, false);*/
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Picasso.get().load("https://i.ibb.co/9gh0sTC/spanish-1.png").into(binding.imgEspanol);
        Picasso.get().load("https://i.ibb.co/x5jGmpf/english-1.png").into(binding.imgIngles);
        Picasso.get().load("https://i.ibb.co/tczr5f2/german-1.png").into(binding.imgAleman);
        Picasso.get().load("https://i.ibb.co/68mcTGt/french-2.png").into(binding.imgFrances);
        Picasso.get().load("https://i.ibb.co/JCqZg5V/italian-1.png").into(binding.imgItaliano);
        Picasso.get().load("https://i.ibb.co/hKx3mKb/korean-1.png").into(binding.imgCoreano);
        Picasso.get().load("https://i.ibb.co/gZ3nP7c/chinee-1.png").into(binding.imgChino);
        Picasso.get().load("https://i.ibb.co/54vpSB3/catalan-1.png").into(binding.imgCatalan);

    }
}