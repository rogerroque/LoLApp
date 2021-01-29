package com.example.spashscreen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.databinding.FragmentPuzzlesDisponiblesBinding;


public class PuzzlesDisponiblesFragment extends Fragment {

    private FragmentPuzzlesDisponiblesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return (binding = FragmentPuzzlesDisponiblesBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Glide.with(requireActivity()).load("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Azir_0.jpg").into(binding.image1);
        Glide.with(requireActivity()).load("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Blitzcrank_0.jpg").into(binding.image2);
        Glide.with(requireActivity()).load("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Camille_0.jpg").into(binding.image3);
        Glide.with(requireActivity()).load("https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Gangplank_0.jpg").into(binding.image4);

    }
}