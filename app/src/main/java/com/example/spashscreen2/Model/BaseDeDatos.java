package com.example.spashscreen2.Model;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.Update;

import java.util.List;

@Database(entities = {Usuario.class, Puntuaciones.class}, version = 2, exportSchema = false)
public abstract class BaseDeDatos extends RoomDatabase {

    private static volatile BaseDeDatos INSTANCIA;

    public abstract AppUsuarioDAO obtenerElementosDao();

    static BaseDeDatos obtenerInstancia(final Context context) {
        if (INSTANCIA == null) {
            synchronized (BaseDeDatos.class) {
                if (INSTANCIA == null) {
                    INSTANCIA = Room.databaseBuilder(context,
                            BaseDeDatos.class, "elementos.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCIA;
    }

    @Dao
    interface AppUsuarioDAO {
        @Insert
        void insertarUsuario(Usuario usuario);

        @Query("SELECT * FROM Usuario WHERE username = :username AND password = :password")
        Usuario autenticar(String username, String password);

        @Query("SELECT * FROM Usuario WHERE username = :username")
        Usuario comprobarNombreDisponible(String username);

    }
}
