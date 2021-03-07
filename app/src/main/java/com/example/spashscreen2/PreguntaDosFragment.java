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
import com.example.spashscreen2.databinding.FragmentPreguntaDosBinding;


public class PreguntaDosFragment extends Fragment {

    private FragmentPreguntaDosBinding binding;

    private Typeface typeface;
    private Typeface typeface2;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return (binding = FragmentPreguntaDosBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        typeface = ResourcesCompat.getFont(getContext(), R.font.ubuntu_medium);
        typeface2 = ResourcesCompat.getFont(getContext(), R.font.ubuntu_light);

        binding.progressBarPreguntasHorizontal2.setProgress(20);
        binding.progressBarPreguntas2.setProgress(90);

        Glide.with(requireActivity()).load("https://i.ibb.co/S5r0yp5/Shurima-Pregunta2.png").into(binding.imagePregunta2);

        binding.radioGrupPadre.setOnCheckedChangeListener((group, checkedId) -> {

            if (binding.respuestaUnoPreguntaDos.isChecked()) {
                binding.respuestaUnoPreguntaDos.setTypeface(typeface);
            } else {
                binding.respuestaUnoPreguntaDos.setTypeface(typeface2);
            }

            if (binding.respuestaDosPreguntaDos.isChecked()) {
                binding.respuestaDosPreguntaDos.setTypeface(typeface);
            } else {
                binding.respuestaDosPreguntaDos.setTypeface(typeface2);
            }

            if (binding.respuestaTresPreguntaDos.isChecked()) {
                binding.respuestaTresPreguntaDos.setTypeface(typeface);
            } else {
                binding.respuestaTresPreguntaDos.setTypeface(typeface2);
            }

            if (binding.respuestaCuatroPreguntaDos.isChecked()) {
                binding.respuestaCuatroPreguntaDos.setTypeface(typeface);
            } else {
                binding.respuestaCuatroPreguntaDos.setTypeface(typeface2);
            }
        });

        binding.botonSiguientePreguntaDos.setOnClickListener(v -> navController.navigate(R.id.action_preguntaDosFragment_to_preguntaDiezFragment));

    }
}