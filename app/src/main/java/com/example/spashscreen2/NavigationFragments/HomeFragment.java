package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.spashscreen2.AppViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private NavController navController;
    private AppViewModel appViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return (binding = FragmentHomeBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        appViewModel = new ViewModelProvider(requireActivity()).get(AppViewModel.class);
        navController = Navigation.findNavController(view);

        if(!appViewModel.cargados) {
               navController.navigate(R.id.splashScreenFragment);
        } else {
            binding.imageOneQuizes.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_gameTypeFragment));
            binding.imageTwoQuizes.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_gameTypeFragment));
            binding.imageThreeQuizes.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_gameTypeFragment));
            binding.imageOneCalendario.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_calendarioFragment));
            binding.imageOnePuntuaciones.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_puntuacionesFragment));
            binding.imageOnePuzzles.setOnClickListener(v -> navController.navigate(R.id.action_homeFragment_to_puzzlesDisponiblesFragment));
        }

    }
}