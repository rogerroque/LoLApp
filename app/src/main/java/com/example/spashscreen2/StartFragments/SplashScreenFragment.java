package com.example.spashscreen2.StartFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.spashscreen2.AppViewModel;
import com.example.spashscreen2.R;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class SplashScreenFragment extends Fragment {

    private NavController navController;
    Executor executor = Executors.newSingleThreadExecutor();
    private AppViewModel appViewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        appViewModel = new ViewModelProvider(requireActivity()).get(AppViewModel.class);

        appViewModel.cargados = true;

        MutableLiveData<Boolean> finishedLoading = new MutableLiveData<>();

        finishedLoading.observe(getViewLifecycleOwner(), aBoolean -> navController.navigate(R.id.action_splashScreenFragment_to_firstScreenFragment));

        executor.execute(() -> {
            try {
                Thread.sleep(3000);
                finishedLoading.postValue(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}