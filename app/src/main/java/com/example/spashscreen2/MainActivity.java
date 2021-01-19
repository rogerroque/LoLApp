package com.example.spashscreen2;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.spashscreen2.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    AppBarConfiguration appBarConfiguration;
    NavController navController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                if (destination.getId() == R.id.perfilFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.cambiarIdiomaFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.verAmigosFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.appInfoFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.calendarioFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.splashScreenFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.signInFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.signUpFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.firstScreenFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.gameTypeFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.startingGameFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.preguntaUnoFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.preguntaDosFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.preguntaDiezFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else if (destination.getId() == R.id.resultadoPreguntasFragment) {
                    binding.bottomNavigation.setVisibility(View.GONE);
                    binding.toolbar.setVisibility(View.GONE);
                    binding.viewBottom.setVisibility(View.GONE);
                    binding.viewTop.setVisibility(View.GONE);
                } else {
                    binding.bottomNavigation.setVisibility(View.VISIBLE);
                    binding.toolbar.setVisibility(View.VISIBLE);
                    binding.viewBottom.setVisibility(View.VISIBLE);
                    binding.viewTop.setVisibility(View.VISIBLE);
                }
            }
        });


    }


    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }


}