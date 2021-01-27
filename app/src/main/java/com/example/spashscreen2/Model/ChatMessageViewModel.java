package com.example.spashscreen2.Model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class ChatMessageViewModel extends AndroidViewModel {

    public ChatMessageViewModel(@NonNull Application application) {
        super(application);

    }

    MutableLiveData<Chat> chatSeleccionado = new MutableLiveData<>();

    public void seleccionar(Chat chat){
        chatSeleccionado.setValue(chat);
    }

    public MutableLiveData<Chat> getChatSeleccionado() {
        return chatSeleccionado;
    }

}
