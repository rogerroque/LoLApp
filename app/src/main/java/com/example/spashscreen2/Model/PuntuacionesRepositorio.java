package com.example.spashscreen2.Model;

import android.app.Application;
import android.net.Uri;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PuntuacionesRepositorio {

    Executor executor = Executors.newSingleThreadExecutor();
    private final BaseDeDatos.AppUsuarioDAO appUsuarioDAO;

    public PuntuacionesRepositorio(Application application) {
        appUsuarioDAO = BaseDeDatos.obtenerInstancia(application).obtenerElementosDao();
    }

    public LiveData<List<Puntuaciones>> obtener() {
        return appUsuarioDAO.sacarPuntuaciones();
    }

    public void insertarPuntuacion(String nombreAmigo, String puntuacionAmigo, Uri imagenSeleccionada) {
        appUsuarioDAO.insertarPuntuacion(new Puntuaciones(nombreAmigo, puntuacionAmigo, imagenSeleccionada.toString()));
    }

    void eliminarPuntuaciones(Puntuaciones puntuaciones) {
        executor.execute(() -> appUsuarioDAO.eliminarPuntuaciones(puntuaciones));
    }

}
