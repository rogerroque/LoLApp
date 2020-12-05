/*
package com.example.spashscreen2.usuario;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

@Database(entities = {}, version = 1, exportSchema = false)
public abstract class BaseDeDatos extends RoomDatabase {

    private static volatile BaseDeDatos INSTANCIA;

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
    interface ElementosDao {
        @Query("SELECT * FROM Usuario")
        LiveData<List<Usuario>> obtener();

        @Insert
        void insertar(Usuario usuario);



    }
}
*/
