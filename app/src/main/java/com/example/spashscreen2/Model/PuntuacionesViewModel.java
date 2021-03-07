package com.example.spashscreen2.Model;

import android.app.Application;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PuntuacionesViewModel extends AndroidViewModel {

    MutableLiveData<String> terminoBusqueda = new MutableLiveData<>();
    Executor executor = Executors.newSingleThreadExecutor();

    private final PuntuacionesRepositorio puntuacionesRepositorio;

    public PuntuacionesViewModel(@NonNull Application application) {
        super(application);
        puntuacionesRepositorio = new PuntuacionesRepositorio(application);
    }


    public LiveData<List<Puntuaciones>> obtener() {
        return puntuacionesRepositorio.obtener();
    }

    public void insertarPuntuacion(String nombreAmigo, String puntuacionAmigo, Uri imagenSeleccionada) {
        executor.execute(() -> puntuacionesRepositorio.insertarPuntuacion(nombreAmigo, puntuacionAmigo, imagenSeleccionada));
    }

    public void eliminarPuntuacion(Puntuaciones puntuaciones) {
        puntuacionesRepositorio.eliminarPuntuaciones(puntuaciones);
    }

}
