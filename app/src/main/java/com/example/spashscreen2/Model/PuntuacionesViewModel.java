package com.example.spashscreen2.Model;

import android.app.Application;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PuntuacionesViewModel extends AndroidViewModel {

    MutableLiveData<String> terminoBusqueda = new MutableLiveData<>();
    Executor executor = Executors.newSingleThreadExecutor();

    private final PuntuacionesRepositorio puntuacionesRepositorio;

    /*LiveData<List<Puntuaciones>> resultadoBusqueda = Transformations.switchMap(terminoBusqueda, new Function<String, LiveData<List<Puntuaciones>>>() {
        @Override
        public LiveData<List<Puntuaciones>> apply(String input) {
            return puntuacionesRepositorio.buscar(input);
        }
    });*/

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

    /*LiveData<List<Puntuaciones>> buscar(){
        return resultadoBusqueda;
    }

    public void establecerTerminoBusqueda(String t){
        terminoBusqueda.setValue(t);
    }*/

}
