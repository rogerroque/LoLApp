package com.example.spashscreen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.databinding.FragmentHistorialPartidasBinding;

public class HistorialPartidasFragment extends Fragment {

    private FragmentHistorialPartidasBinding binding;

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

        /*String url = "https://i.ibb.co/rdQJpDt/grandmaster-icon-perfil.png";
        Glide.with(this)
                .load(url)
                .into(binding.glidePrueba);*/

    }
}