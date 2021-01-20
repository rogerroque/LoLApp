package com.example.spashscreen2;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.spashscreen2.databinding.FragmentResultadoPreguntasBinding;
import com.github.jinatonic.confetti.CommonConfetti;

import java.util.Random;

public class ResultadoPreguntasFragment extends Fragment {

    private FragmentResultadoPreguntasBinding binding;
    private NavController navController;
    private final Random random = new Random();
    private int puntacion = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return (binding = FragmentResultadoPreguntasBinding.inflate(inflater, container, false)).getRoot();

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.botonVolver.setOnClickListener(v -> navController.navigate(R.id.action_resultadoPreguntasFragment_to_homeFragment));

        puntacion = random.nextInt(10) + 1;
        binding.resultado.setText(puntacion + "/10");

        /*binding.confeti.setOnClickListener(v -> CommonConfetti.rainingConfetti((ViewGroup) view, new int[] { Color.YELLOW, Color.RED, Color.BLUE }).stream(3500));*/

        if (puntacion >= 5) {
            CommonConfetti.rainingConfetti((ViewGroup) view, new int[] {Color.YELLOW, Color.RED, Color.BLUE}).stream(3500);
            Toast bien = Toast.makeText(requireContext(), R.string.muy_bien, Toast.LENGTH_LONG);
            bien.show();
        } else {
            Toast mal = Toast.makeText(requireContext(), R.string.muy_mal, Toast.LENGTH_LONG);
            mal.show();
        }

    }
}