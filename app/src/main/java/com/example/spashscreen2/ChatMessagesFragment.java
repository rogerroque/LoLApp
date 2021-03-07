package com.example.spashscreen2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.Model.ChatMessageViewModel;
import com.example.spashscreen2.databinding.FragmentChatMessagesBinding;

import java.util.ArrayList;
import java.util.List;

import co.intentservice.chatui.ChatView;
import co.intentservice.chatui.models.ChatMessage;


public class ChatMessagesFragment extends Fragment {

    private FragmentChatMessagesBinding binding;
    private ChatMessageViewModel chatMessageViewModel;
    ArrayList<ChatMessage> messages;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentChatMessagesBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chatMessageViewModel = new ViewModelProvider(requireActivity()).get(ChatMessageViewModel.class);

        chatMessageViewModel.getChatSeleccionado().observe(getViewLifecycleOwner(), chat -> {

            binding.textSummonerChat.setText(chat.getNameChat());
            binding.statusSummonerChat.setText(chat.getStatusChat());
            Glide.with(requireActivity()).load(chat.getImgCharURL()).into(binding.imgSummonerChat);

            if (chat.getStatusChat().equals("Online")) {
                binding.statusSummonerChat.setTextColor(ContextCompat.getColor(requireActivity(), R.color.OnlineColor));
            } else {
                binding.statusSummonerChat.setTextColor(ContextCompat.getColor(requireContext(), R.color.OfflineColor));
            }
        });

        binding.chatView.setOnSentMessageListener(chatMessage -> true);

        binding.chatView.setTypingListener(new ChatView.TypingListener(){
            @Override
            public void userStartedTyping(){
                binding.statusSummonerChat.setText("Escribiendo...");
            }

            @Override
            public void userStoppedTyping(){
                binding.statusSummonerChat.setText("Online");
            }
        });



    }
}