package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.databinding.FragmentCalendarioBinding;


public class CalendarioFragment extends Fragment {

    private FragmentCalendarioBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return (binding = FragmentCalendarioBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.scroll.fullScroll(ScrollView.FOCUS_UP);

        //Game1
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592591295307_FnaticFNC-01-FullonDark.png")
                .into(binding.imgEquipo1Game1);
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592590917094_TSMTSM-01-FullonDark.png")
                .into(binding.imgEquipo2Game1);
        //Game2
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/f/f9/LGD.png/revision/latest?cb=20170802033858")
                .into(binding.imgEquipo1Game2);
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/e/e3/Gen.Glogo_square.png/revision/latest?cb=20190309161345")
                .into(binding.imgEquipo2Game2);
        //Game3
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592590917094_TSMTSM-01-FullonDark.png")
                .into(binding.imgEquipo1Game3);
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/e/e3/Gen.Glogo_square.png/revision/latest?cb=20190309161345")
                .into(binding.imgEquipo2Game3);
        //Game4
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592591295307_FnaticFNC-01-FullonDark.png")
                .into(binding.imgEquipo1Game4);
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/f/f9/LGD.png/revision/latest?cb=20170802033858")
                .into(binding.imgEquipo2Game4);
        //Game5
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/f/f9/LGD.png/revision/latest?cb=20170802033858")
                .into(binding.imgEquipo1Game5);
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592590917094_TSMTSM-01-FullonDark.png")
                .into(binding.imgEquipo2Game5);
        //Game6
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/e/e3/Gen.Glogo_square.png/revision/latest?cb=20190309161345")
                .into(binding.imgEquipo1Game6);
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592591295307_FnaticFNC-01-FullonDark.png")
                .into(binding.imgEquipo2Game6);
        //Game7
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/7/7d/FlyQuestlogo_std.png/revision/latest/scale-to-width-down/45?cb=20171121011050")
                .into(binding.imgEquipo1Game7);
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/7/77/G2_Esportslogo_square.png/revision/latest?cb=20190201222017")
                .into(binding.imgEquipo2Game7);
        //Game8
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/e/e3/Gen.Glogo_square.png/revision/latest?cb=20190309161345")
                .into(binding.imgEquipo1Game8);
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592591295307_FnaticFNC-01-FullonDark.png")
                .into(binding.imgEquipo2Game8);
        //Game9
        Glide.with(requireActivity())
                .load("https://static.wikia.nocookie.net/lolesports_gamepedia_en/images/7/77/G2_Esportslogo_square.png/revision/latest?cb=20190201222017")
                .into(binding.imgEquipo1Game9);
        Glide.with(requireActivity())
                .load("https://am-a.akamaihd.net/image/?resize=200:&f=http%3A%2F%2Fstatic.lolesports.com%2Fteams%2F1592590917094_TSMTSM-01-FullonDark.png")
                .into(binding.imgEquipo2Game9);

        //Competitions
        Glide.with(requireActivity()).load("https://i.ibb.co/BrQkxjZ/WORLDS.png").into(binding.worlds);
        Glide.with(requireActivity()).load("https://i.ibb.co/N7rHxsH/LEC.png").into(binding.lec);
        Glide.with(requireActivity()).load("https://i.ibb.co/nkpHDtG/LCS.png").into(binding.lcs);
        Glide.with(requireActivity()).load("https://i.ibb.co/k9WcWgs/LCK.png").into(binding.lck);
        Glide.with(requireActivity()).load("https://i.ibb.co/mqHWzLN/LPL.png").into(binding.lpl);
        Glide.with(requireActivity()).load("https://i.ibb.co/vJMTKj3/CBLOL.png").into(binding.cblol);
        Glide.with(requireActivity()).load("https://i.ibb.co/Gxdcn49/TCL.png").into(binding.tcl);
        Glide.with(requireActivity()).load("https://i.ibb.co/bHRdcnf/OPL.png").into(binding.opl);

    }
}