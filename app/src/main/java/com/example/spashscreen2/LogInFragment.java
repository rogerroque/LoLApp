package com.example.spashscreen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.spashscreen2.databinding.FragmentLogInBinding;

public class LogInFragment extends Fragment {

    private FragmentLogInBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLogInBinding.inflate(inflater, container, false);
        return binding.getRoot();


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = navController = Navigation.findNavController(view);
        /*final SignInViewModel loginViewModel = new ViewModelProvider(this).get(SignInViewModel.class);*/

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_signInFragment_to_homeFragment);
                /*String email = (binding.email.getText().toString());
                String password = (binding.password.getText().toString());

                if (TextUtils.isEmpty(email)) {
                    binding.email.setError("Por favor pon un correo");
                } else if (TextUtils.isEmpty(password)) {
                    binding.password.setError("Por favor pon una contraseña");
                } else {
                    loginViewModel.verificar(email, password);
                }*/

            }
        });

    }
}