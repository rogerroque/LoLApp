package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.spashscreen2.AdaptersRecyclers.AdapterChat;
import com.example.spashscreen2.AdaptersRecyclers.ElementosChat;
import com.example.spashscreen2.databinding.FragmentChatBinding;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private FragmentChatBinding binding;
    List<ElementosChat> elementosChats = new ArrayList<>();
    AdapterChat adapterChat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentChatBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        cargarChat();
        mostrarChat();

    }

    private void cargarChat() {

        ElementosChat chat1 = new ElementosChat();
        chat1.setImgCharURL("https://i.ibb.co/C1S6VkV/Teemo.png");
        chat1.setNameChat("Teemo salvage");
        chat1.setStatusChat("Online");
        elementosChats.add(chat1);

        ElementosChat chat2 = new ElementosChat();
        chat2.setImgCharURL("https://i.ibb.co/KsFzJfw/Talon.png");
        chat2.setNameChat("21Jhon");
        chat2.setStatusChat("Online");
        elementosChats.add(chat2);

        ElementosChat chat3 = new ElementosChat();
        chat3.setImgCharURL("https://i.ibb.co/yyF170D/Padre-Willyrex.png");
        chat3.setNameChat("Willyrex");
        chat3.setStatusChat("Online");
        elementosChats.add(chat3);

        ElementosChat chat4 = new ElementosChat();
        chat4.setImgCharURL("https://i.ibb.co/2qcgnG1/G2.png");
        chat4.setNameChat("G2 Rekkles");
        chat4.setStatusChat("Online");
        elementosChats.add(chat4);

        ElementosChat chat5 = new ElementosChat();
        chat5.setImgCharURL("https://i.ibb.co/DMfyBkv/Riven.png");
        chat5.setNameChat("Caps");
        chat5.setStatusChat("Online");
        elementosChats.add(chat5);

        ElementosChat chat6 = new ElementosChat();
        chat6.setImgCharURL("https://i.ibb.co/j4CLhkq/Yasuo.png");
        chat6.setNameChat("MENTOS24");
        chat6.setStatusChat("Online");
        elementosChats.add(chat6);

        ElementosChat chat7 = new ElementosChat();
        chat7.setImgCharURL("https://i.ibb.co/BBzc02V/Ekko.png");
        chat7.setNameChat("Xyphr");
        chat7.setStatusChat("Online");
        elementosChats.add(chat7);

        ElementosChat chat8 = new ElementosChat();
        chat8.setImgCharURL("https://i.ibb.co/gMpFgM4/Gangplank.png");
        chat8.setNameChat("xQc");
        chat8.setStatusChat("Online");
        elementosChats.add(chat8);

        ElementosChat chat9 = new ElementosChat();
        chat9.setImgCharURL("https://i.ibb.co/1nzYpzq/Bronza.png");
        chat9.setNameChat("21Savage");
        chat9.setStatusChat("Online");
        elementosChats.add(chat9);

        ElementosChat chat10 = new ElementosChat();
        chat10.setImgCharURL("https://i.ibb.co/crHjdbn/DJSona.png");
        chat10.setNameChat("Travis Scott");
        chat10.setStatusChat("Online");
        elementosChats.add(chat10);

        ElementosChat chat11 = new ElementosChat();
        chat11.setImgCharURL("https://i.ibb.co/d202bQD/Draven.png");
        chat11.setNameChat("Lil Uzi Vert");
        chat11.setStatusChat("Online");
        elementosChats.add(chat11);

        ElementosChat chat12 = new ElementosChat();
        chat12.setImgCharURL("https://i.ibb.co/88g481W/SKT.png");
        chat12.setNameChat("riskmon");
        chat12.setStatusChat("Online");
        elementosChats.add(chat12);

        ElementosChat chat13 = new ElementosChat();
        chat13.setImgCharURL("https://i.ibb.co/YZzWJwF/Akali.png");
        chat13.setNameChat("Aldart");
        chat13.setStatusChat("Online");
        elementosChats.add(chat13);

        ElementosChat chat14 = new ElementosChat();
        chat14.setImgCharURL("https://i.ibb.co/w6Gqhff/Ahri.png");
        chat14.setNameChat("Romero");
        chat14.setStatusChat("Online");
        elementosChats.add(chat14);

        ElementosChat chat15 = new ElementosChat();
        chat15.setImgCharURL("https://i.ibb.co/HnPZhQz/TSM.png");
        chat15.setNameChat("JakioX");
        chat15.setStatusChat("Online");
        elementosChats.add(chat15);

    }

    private void mostrarChat() {

        binding.recyclerViewChat.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterChat = new AdapterChat(elementosChats, getContext());
        binding.recyclerViewChat.setAdapter(adapterChat);

    }

}