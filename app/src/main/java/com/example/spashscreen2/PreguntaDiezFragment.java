package com.example.spashscreen2;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.databinding.FragmentPreguntaDiezBinding;

import java.util.Random;


public class PreguntaDiezFragment extends Fragment {

    private FragmentPreguntaDiezBinding binding;

    private Typeface typeface;
    private Typeface typeface2;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentPreguntaDiezBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        typeface = ResourcesCompat.getFont(getContext(), R.font.ubuntu_medium);
        typeface2 = ResourcesCompat.getFont(getContext(), R.font.ubuntu_light);

        binding.progressBarPreguntasHorizontal3.setProgress(100);
        binding.progressBarPreguntas3.setProgress(20);

        Glide.with(requireActivity()).load("https://i.ibb.co/qxZ4bRB/image-11.png").into(binding.imagePregunta10);

        binding.radioGrupPadre.setOnCheckedChangeListener((group, checkedId) -> {

            if (binding.respuestaUnoPregunta10.isChecked()) {
                binding.respuestaUnoPregunta10.setTypeface(typeface);
            } else {
                binding.respuestaUnoPregunta10.setTypeface(typeface2);
            }

            if (binding.respuestaDosPregunta10.isChecked()) {
                binding.respuestaDosPregunta10.setTypeface(typeface);
            } else {
                binding.respuestaDosPregunta10.setTypeface(typeface2);
            }

            if (binding.respuestaTresPregunta10.isChecked()) {
                binding.respuestaTresPregunta10.setTypeface(typeface);
            } else {
                binding.respuestaTresPregunta10.setTypeface(typeface2);
            }

            if (binding.respuestaCuatroPregunta10.isChecked()) {
                binding.respuestaCuatroPregunta10.setTypeface(typeface);
            } else {
                binding.respuestaCuatroPregunta10.setTypeface(typeface2);
            }
        });

        binding.botonSiguientePregunta10.setOnClickListener(v -> navController.navigate(R.id.action_preguntaDiezFragment_to_resultadoPreguntasFragment));

    }

}