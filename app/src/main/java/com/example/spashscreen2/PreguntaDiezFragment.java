package com.example.spashscreen2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.spashscreen2.databinding.FragmentPreguntaDiezBinding;
import com.example.spashscreen2.databinding.FragmentPreguntaDosBinding;
import com.github.jinatonic.confetti.CommonConfetti;
import com.squareup.picasso.Picasso;

import java.util.Random;


public class PreguntaDiezFragment extends Fragment {

    private FragmentPreguntaDiezBinding binding;

    private int number = 0;
    private boolean timeOver = true;
    private Typeface typeface;
    private Typeface typeface2;
    private NavController navController;
    private int puntacion = 0;
    private Random random = new Random();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return (binding = FragmentPreguntaDiezBinding.inflate(inflater, container, false)).getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        typeface = ResourcesCompat.getFont(getContext(), R.font.ubuntu_medium);
        typeface2 = ResourcesCompat.getFont(getContext(), R.font.ubuntu_light);

        //progres();
        binding.progressBarPreguntasHorizontal3.setProgress(100);
        binding.progressBarPreguntas3.setProgress(20);

        Picasso.get().load("https://i.ibb.co/qxZ4bRB/image-11.png").into(binding.imagePregunta10);

        binding.radioGrupPadre.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

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
            }
        });



        binding.botonSiguientePregunta10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_preguntaDiezFragment_to_resultadoPreguntasFragment);
                /*LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.fragment_resultado_preguntas,
                       view.findViewById(R.id.elPadre));


                Toast toast = new Toast(requireContext());
                toast.setGravity(Gravity.FILL_VERTICAL | Gravity.FILL_HORIZONTAL, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

                CommonConfetti.rainingConfetti((ViewGroup) view, new int[] {Color.YELLOW, Color.RED, Color.BLUE}).stream(3500);*/

            }
        });



    }

}