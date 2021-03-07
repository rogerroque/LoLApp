package com.example.spashscreen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.spashscreen2.databinding.FragmentConfirmarLogoutBinding;


public class ConfirmarLogoutFragment extends DialogFragment {

    private AppViewModel appViewModel;
    private NavController navController;
    private FragmentConfirmarLogoutBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentConfirmarLogoutBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        appViewModel = new ViewModelProvider(requireActivity()).get(AppViewModel.class);
        navController = Navigation.findNavController(requireParentFragment().requireView());

        binding.buttomConfirmar.setOnClickListener(v -> {
            appViewModel.cerrarSesion();
            navController.navigate(R.id.action_confirmarLogoutFragment_to_firstScreenFragment);
        });

        binding.buttomCancelar.setOnClickListener(v -> dismiss());

    }
}