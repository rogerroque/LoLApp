package com.example.spashscreen2.StartFragments;

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
import com.example.spashscreen2.databinding.FragmentFirstScreenBinding;

public class FirstScreenFragment extends Fragment {

    private FragmentFirstScreenBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFirstScreenBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.BotonLogIn.setOnClickListener(v -> navController.navigate(R.id.action_firstScreenFragment_to_signInFragment));
        binding.BotonSignIn.setOnClickListener(v -> navController.navigate(R.id.action_firstScreenFragment_to_signUpFragment));

    }
}