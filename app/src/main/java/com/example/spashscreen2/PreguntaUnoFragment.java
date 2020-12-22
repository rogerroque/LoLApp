package com.example.spashscreen2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.example.spashscreen2.databinding.FragmentPreguntaUnoBinding;
import com.squareup.picasso.Picasso;

import java.util.Timer;
import java.util.TimerTask;

@RequiresApi(api = Build.VERSION_CODES.O)
public class PreguntaUnoFragment extends Fragment {

    private FragmentPreguntaUnoBinding binding;
    private int number = 0;
    private boolean timeOver = true;
    Typeface typeface;
    Typeface typeface2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentPreguntaUnoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        typeface = ResourcesCompat.getFont(getContext(), R.font.ubuntu_medium);
        typeface2 = ResourcesCompat.getFont(getContext(), R.font.ubuntu_light);

        //progres();
        binding.progressBarPreguntasHorizontal.setProgress(10);
        binding.progressBarPreguntas.setProgress(70);

        Picasso.get().load("https://i.ibb.co/gD1hn3t/Caytlin-Pregunta1.png").into(binding.imagePregunta1);

        binding.radioGrupPadre.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (binding.respuestaUno.isChecked()) {
                    binding.respuestaUno.setTypeface(typeface);
                } else {
                    binding.respuestaUno.setTypeface(typeface2);
                }

                if (binding.respuestaDos.isChecked()) {
                    binding.respuestaDos.setTypeface(typeface);
                } else {
                    binding.respuestaDos.setTypeface(typeface2);
                }

                if (binding.respuestaTres.isChecked()) {
                    binding.respuestaTres.setTypeface(typeface);
                } else {
                    binding.respuestaTres.setTypeface(typeface2);
                }

                if (binding.respuestaCuatro.isChecked()) {
                    binding.respuestaCuatro.setTypeface(typeface);
                } else {
                    binding.respuestaCuatro.setTypeface(typeface2);
                }
            }
        });



    }

    public void progres() {

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {

                number++;
                binding.progressBarPreguntas.setProgress(number);

                if (number == 0)
                    timer.cancel();

            }
        }; timer.schedule(timerTask, 10,100);
    }
}