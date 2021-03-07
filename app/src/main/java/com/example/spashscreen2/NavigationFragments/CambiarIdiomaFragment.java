package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.databinding.FragmentCambiarIdiomaBinding;

public class CambiarIdiomaFragment extends Fragment {

    private FragmentCambiarIdiomaBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCambiarIdiomaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        Glide.with(requireContext()).load("https://i.ibb.co/9gh0sTC/spanish-1.png").into(binding.imgspanish);
        Glide.with(requireActivity()).load("https://i.ibb.co/x5jGmpf/english-1.png").into(binding.imgenglish);
        Glide.with(requireActivity()).load("https://i.ibb.co/54vpSB3/catalan-1.png").into(binding.imgcatalan);
        Glide.with(requireActivity()).load("https://i.ibb.co/tczr5f2/german-1.png").into(binding.imggerman);
        Glide.with(requireActivity()).load("https://i.ibb.co/68mcTGt/french-2.png").into(binding.imgfrench);
        Glide.with(requireActivity()).load("https://i.ibb.co/JCqZg5V/italian-1.png").into(binding.imgitalian);
        Glide.with(requireActivity()).load("https://i.ibb.co/hKx3mKb/korean-1.png").into(binding.imgcorean);
        Glide.with(requireActivity()).load("https://i.ibb.co/gZ3nP7c/chinee-1.png").into(binding.imgchinese);

    }
}