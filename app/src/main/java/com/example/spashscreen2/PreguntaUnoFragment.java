package com.example.spashscreen2;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.databinding.FragmentPreguntaUnoBinding;

import java.util.Timer;
import java.util.TimerTask;

@RequiresApi(api = Build.VERSION_CODES.O)
public class PreguntaUnoFragment extends Fragment {

    private FragmentPreguntaUnoBinding binding;
    private int number = 0;
    private Typeface typeface;
    private Typeface typeface2;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentPreguntaUnoBinding.inflate(inflater, container, false)).getRoot();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        typeface = ResourcesCompat.getFont(requireContext(), R.font.ubuntu_medium);
        typeface2 = ResourcesCompat.getFont(requireContext(), R.font.ubuntu_light);

        navController = Navigation.findNavController(view);

        binding.progressBarPreguntasHorizontal1.setProgress(10);
        binding.progressBarPreguntas1.setProgress(70);

        Glide.with(requireActivity()).load("https://i.ibb.co/gD1hn3t/Caytlin-Pregunta1.png").into(binding.imagePregunta1);

        binding.botonSiguientePreguntaUno.setOnClickListener(v -> navController.navigate(R.id.action_preguntaUnoFragment_to_preguntaDosFragment));

        binding.radioGrupPadre.setOnCheckedChangeListener((group, checkedId) -> {

            if (binding.respuestaUnoPreguntaUno.isChecked()) {
                binding.respuestaUnoPreguntaUno.setTypeface(typeface);
            } else {
                binding.respuestaUnoPreguntaUno.setTypeface(typeface2);
            }

            if (binding.respuestaDosPreguntaUno.isChecked()) {
                binding.respuestaDosPreguntaUno.setTypeface(typeface);
            } else {
                binding.respuestaDosPreguntaUno.setTypeface(typeface2);
            }

            if (binding.respuestaTresPreguntaUno.isChecked()) {
                binding.respuestaTresPreguntaUno.setTypeface(typeface);
            } else {
                binding.respuestaTresPreguntaUno.setTypeface(typeface2);
            }

            if (binding.respuestaCuatroPreguntaUno.isChecked()) {
                binding.respuestaCuatroPreguntaUno.setTypeface(typeface);
            } else {
                binding.respuestaCuatroPreguntaUno.setTypeface(typeface2);
            }
        });



    }
}