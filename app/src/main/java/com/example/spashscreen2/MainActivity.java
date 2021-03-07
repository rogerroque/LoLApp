package com.example.spashscreen2;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.spashscreen2.Model.ChatMessageViewModel;
import com.example.spashscreen2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AppBarConfiguration appBarConfiguration;
    private NavController navController;
    private ChatMessageViewModel chatMessageViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        chatMessageViewModel = new ViewModelProvider(this).get(ChatMessageViewModel.class);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(binding.toolbar);
        binding.toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.homeFragment, R.id.quizesFragment, R.id.puntuacionesFragment, R.id.amigosFragment
        ).setOpenableLayout(binding.drawerLayout).build();

        navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(binding.drawerNavigation, navController);
        NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);


        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if (destination.getId() == R.id.perfilFragment) {
                binding.bottomNavigation.setVisibility(View.GONE);
                binding.viewBottom.setVisibility(View.GONE);
                binding.viewTop.setVisibility(View.GONE);
            } else if (destination.getId() == R.id.cambiarIdiomaFragment || destination.getId() == R.id.verAmigosFragment || destination.getId() == R.id.appInfoFragment
                || destination.getId() == R.id.calendarioFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
            }  else if (destination.getId() == R.id.splashScreenFragment || destination.getId() == R.id.signInFragment || destination.getId() == R.id.signUpFragment
                || destination.getId() == R.id.firstScreenFragment || destination.getId() == R.id.gameTypeFragment ||destination.getId() == R.id.startingGameFragment
                || destination.getId() == R.id.preguntaUnoFragment || destination.getId() == R.id.preguntaDosFragment || destination.getId() == R.id.preguntaDiezFragment
                || destination.getId() == R.id.resultadoPreguntasFragment || destination.getId() == R.id.puzzlesDisponiblesFragment || destination.getId() == R.id.addFriendFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
            } else if (destination.getId() == R.id.chatMessagesFragment) {
                binding.bottomNavigation.setVisibility(View.GONE);
                binding.viewBottom.setVisibility(View.GONE);
                binding.toolbar.setVisibility(View.GONE);
                binding.viewTop.setVisibility(View.GONE);
            } else {
                binding.bottomNavigation.setVisibility(View.VISIBLE);
                binding.toolbar.setVisibility(View.VISIBLE);
                binding.viewBottom.setVisibility(View.VISIBLE);
                binding.viewTop.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }


}