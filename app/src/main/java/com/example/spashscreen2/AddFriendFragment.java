package com.example.spashscreen2;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.Model.PuntuacionesViewModel;
import com.example.spashscreen2.databinding.FragmentAddFriendBinding;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static androidx.core.content.PermissionChecker.checkSelfPermission;

public class AddFriendFragment extends Fragment {

    private FragmentAddFriendBinding binding;
    private Uri imagenSeleccionada;
    private PuntuacionesViewModel puntuacionesViewModel;
    private NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentAddFriendBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        puntuacionesViewModel = new ViewModelProvider(requireActivity()).get(PuntuacionesViewModel.class);

        binding.botonDeAnadir.setOnClickListener(v -> {
            if (imagenSeleccionada == null) {
                Toast.makeText(requireContext(), "Seleccione una imagen", Toast.LENGTH_SHORT).show();
                return;
            } else if (binding.nombreAmigoAnadir.getText().toString().isEmpty()) {
                binding.nombreAmigoAnadir.setError("Introduzca el nombre");
                return;
            } else if (binding.puntuacionAmigoAnadir.getText().toString().isEmpty()) {
                binding.puntuacionAmigoAnadir.setError("Introduzca la puntuacion");
                return;
            }
            String nombreAmigo = binding.nombreAmigoAnadir.getText().toString();
            String puntuacionAmigo = binding.puntuacionAmigoAnadir.getText().toString();
            puntuacionesViewModel.insertarPuntuacion(nombreAmigo, puntuacionAmigo, imagenSeleccionada);
            navController.popBackStack();

        });

        binding.addImagenAnadir.setOnClickListener(v -> {
             abrirGaleria();
        });

    }

    private void abrirGaleria() {

        if (checkSelfPermission(requireContext(), READ_EXTERNAL_STORAGE) == PermissionChecker.PERMISSION_GRANTED) {
            lanzadorGaleria.launch("image/*");
        } else {
            lanzadorPermisos.launch(READ_EXTERNAL_STORAGE);
        }
    }

    private final ActivityResultLauncher<String> lanzadorGaleria = registerForActivityResult(new ActivityResultContracts.GetContent(), uri -> {
        /*puntuacionesViewModel.establecerImagenSeleccionada(uri);*/
        imagenSeleccionada = uri;
        Glide.with(requireContext()).load(uri).into(binding.addImagenAnadir);
    });

    private final ActivityResultLauncher<String> lanzadorPermisos = registerForActivityResult(new ActivityResultContracts.RequestPermission(), isGranted -> {
       if (isGranted) {
           lanzadorGaleria.launch("image/*");
       }
    });

}