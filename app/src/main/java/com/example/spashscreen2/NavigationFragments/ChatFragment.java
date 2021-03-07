package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.Model.Chat;
import com.example.spashscreen2.Model.ChatMessageViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentChatBinding;
import com.example.spashscreen2.databinding.ViewholderChatBinding;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private FragmentChatBinding binding;
    private List<Chat> elementosChats = new ArrayList<>();
    private AdapterChat adapterChat;
    private NavController navController;
    private ChatMessageViewModel chatMessageViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentChatBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chatMessageViewModel = new ViewModelProvider(requireActivity()).get(ChatMessageViewModel.class);
        navController = Navigation.findNavController(view);

        adapterChat = new AdapterChat();
        binding.recyclerViewChat.setAdapter(adapterChat);

        Chat chat1 = new Chat();
        chat1.setImgCharURL("https://i.ibb.co/C1S6VkV/Teemo.png");
        chat1.setNameChat("Teemo salvage");
        chat1.setStatusChat("Online");
        chat1.setStatusBall("green");
        elementosChats.add(chat1);

        Chat chat2 = new Chat();
        chat2.setImgCharURL("https://i.ibb.co/KsFzJfw/Talon.png");
        chat2.setNameChat("21Jhon");
        chat2.setStatusChat("Online");
        chat2.setStatusBall("green");
        elementosChats.add(chat2);

        Chat chat3 = new Chat();
        chat3.setImgCharURL("https://i.ibb.co/yyF170D/Padre-Willyrex.png");
        chat3.setNameChat("Willyrex");
        chat3.setStatusChat("Online");
        chat3.setStatusBall("green");
        elementosChats.add(chat3);

        Chat chat4 = new Chat();
        chat4.setImgCharURL("https://i.ibb.co/2qcgnG1/G2.png");
        chat4.setNameChat("G2 Rekkles");
        chat4.setStatusChat("Online");
        chat4.setStatusBall("green");
        elementosChats.add(chat4);

        Chat chat5 = new Chat();
        chat5.setImgCharURL("https://i.ibb.co/DMfyBkv/Riven.png");
        chat5.setNameChat("Caps");
        chat5.setStatusChat("Online");
        chat5.setStatusBall("green");
        elementosChats.add(chat5);

        Chat chat6 = new Chat();
        chat6.setImgCharURL("https://i.ibb.co/j4CLhkq/Yasuo.png");
        chat6.setNameChat("MENTOS24");
        chat6.setStatusChat("Online");
        chat6.setStatusBall("green");
        elementosChats.add(chat6);

        Chat chat7 = new Chat();
        chat7.setImgCharURL("https://i.ibb.co/BBzc02V/Ekko.png");
        chat7.setNameChat("Xyphr");
        chat7.setStatusChat("Offline");
        chat7.setStatusBall("red");
        elementosChats.add(chat7);

        Chat chat8 = new Chat();
        chat8.setImgCharURL("https://i.ibb.co/gMpFgM4/Gangplank.png");
        chat8.setNameChat("xQc");
        chat8.setStatusChat("Offline");
        chat8.setStatusBall("red");
        elementosChats.add(chat8);

        Chat chat9 = new Chat();
        chat9.setImgCharURL("https://i.ibb.co/1nzYpzq/Bronza.png");
        chat9.setNameChat("21Savage");
        chat9.setStatusChat("Offline");
        chat9.setStatusBall("red");
        elementosChats.add(chat9);

        Chat chat10 = new Chat();
        chat10.setImgCharURL("https://i.ibb.co/crHjdbn/DJSona.png");
        chat10.setNameChat("Travis Scott");
        chat10.setStatusChat("Offline");
        chat10.setStatusBall("red");
        elementosChats.add(chat10);

        Chat chat11 = new Chat();
        chat11.setImgCharURL("https://i.ibb.co/d202bQD/Draven.png");
        chat11.setNameChat("Lil Uzi Vert");
        chat11.setStatusChat("Offline");
        chat11.setStatusBall("red");
        elementosChats.add(chat11);

        Chat chat12 = new Chat();
        chat12.setImgCharURL("https://i.ibb.co/88g481W/SKT.png");
        chat12.setNameChat("riskmon");
        chat12.setStatusChat("Offline");
        chat12.setStatusBall("red");
        elementosChats.add(chat12);

        Chat chat13 = new Chat();
        chat13.setImgCharURL("https://i.ibb.co/YZzWJwF/Akali.png");
        chat13.setNameChat("Aldart");
        chat13.setStatusChat("Offline");
        chat13.setStatusBall("red");
        elementosChats.add(chat13);

        Chat chat14 = new Chat();
        chat14.setImgCharURL("https://i.ibb.co/w6Gqhff/Ahri.png");
        chat14.setNameChat("Romero");
        chat14.setStatusChat("Offline");
        chat14.setStatusBall("red");
        elementosChats.add(chat14);

        Chat chat15 = new Chat();
        chat15.setImgCharURL("https://i.ibb.co/HnPZhQz/TSM.png");
        chat15.setNameChat("JakioX");
        chat15.setStatusChat("Offline");
        chat15.setStatusBall("red");
        elementosChats.add(chat15);

    }


    class AdapterChat extends RecyclerView.Adapter<AdapterChat.ChatViewHolder> {

        @NonNull
        @Override
        public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ChatViewHolder(ViewholderChatBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {

            String summoner = elementosChats.get(position).getNameChat();
            String status = elementosChats.get(position).getStatusChat();
            String statusBall = elementosChats.get(position).getStatusBall();

            holder.binding.summonerChat.setText(summoner);
            holder.binding.statusChat.setText(status);
            Glide.with(requireContext()).load(elementosChats.get(position).getImgCharURL()).into(holder.binding.imageViewChat);

            if (statusBall.equals("green")) {
                holder.binding.statusBallChat.setBackgroundResource(R.drawable.online_circular_chat_status);
            } else {
                holder.binding.statusBallChat.setBackgroundResource(R.drawable.offline_circular_chat_status);
            }

            if (status.equals("Online") || status.equals("En línea") || status.equals("En línia")) {
                holder.binding.statusChat.setTextColor(ContextCompat.getColor(requireActivity(), R.color.OnlineColor));
            } else {
                holder.binding.statusChat.setTextColor(ContextCompat.getColor(requireContext(), R.color.OfflineColor));
            }

            holder.itemView.setOnClickListener(v -> {
                chatMessageViewModel.seleccionar(elementosChats.get(position));
                navController.navigate(R.id.action_amigosFragment_to_chatMessagesFragment);
            });

        }

        @Override
        public int getItemCount() {
            return elementosChats.size();
        }

        class ChatViewHolder extends RecyclerView.ViewHolder{
            private final ViewholderChatBinding binding;

            public ChatViewHolder(@NonNull ViewholderChatBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
        }
    }


}