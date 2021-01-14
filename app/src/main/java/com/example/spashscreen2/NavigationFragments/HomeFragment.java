package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return (binding = FragmentHomeBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.imageOneQuizes.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_gameTypeFragment));

        binding.imageTwoQuizes.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_gameTypeFragment));

        binding.imageThreeQuizes.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_gameTypeFragment));

        binding.imageOneCalendario.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_calendarioFragment));

        binding.imageOnePuntuaciones.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_puntuacionesFragment));

        binding.imageOnePuzzles.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_puzzlesDisponiblesFragment));


    }
}