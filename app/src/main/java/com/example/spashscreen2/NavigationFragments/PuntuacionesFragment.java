package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.spashscreen2.Model.Puntuaciones;
import com.example.spashscreen2.Model.PuntuacionesViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentPuntuacionesBinding;
import com.example.spashscreen2.databinding.ViewholderPuntuacionesBinding;

import java.util.ArrayList;
import java.util.List;


public class PuntuacionesFragment extends Fragment {

    private FragmentPuntuacionesBinding binding;
    AdapterPuntuaciones adapterPuntuaciones;
    List<Puntuaciones> puntuacionesLista = new ArrayList<>();
    private PuntuacionesViewModel puntuacionesViewModel;
    private NavController navController;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPuntuacionesBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AdapterPuntuaciones adapterPuntuaciones = new AdapterPuntuaciones();
        puntuacionesViewModel = new ViewModelProvider(requireActivity()).get(PuntuacionesViewModel.class);

        navController = Navigation.findNavController(view);
        puntuacionesViewModel = new ViewModelProvider(requireActivity()).get(PuntuacionesViewModel.class);
        puntuacionesViewModel.obtener().observe(getViewLifecycleOwner(), adapterPuntuaciones::establecerPuntuacionesList);

        binding.navegarAddAmigo.setOnClickListener(v -> navController.navigate(R.id.action_puntuacionesFragment_to_addFriendFragment));

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.RIGHT  | ItemTouchHelper.LEFT) {

            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return true;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int posicion = viewHolder.getAdapterPosition();
                Puntuaciones puntuaciones = adapterPuntuaciones.obtenerLaPuntuacion(posicion);
                puntuacionesViewModel.eliminarPuntuacion(puntuaciones);

            }
        }).attachToRecyclerView(binding.recyclerViewPuntuaciones);

        mostrarDatos();

    }


    public void mostrarDatos() {
        binding.recyclerViewPuntuaciones.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPuntuaciones = new AdapterPuntuaciones();
        binding.recyclerViewPuntuaciones.setAdapter(adapterPuntuaciones);
    }

    class AdapterPuntuaciones extends RecyclerView.Adapter<AdapterPuntuaciones.PuntuacionesViewHolder> {

        public Puntuaciones obtenerLaPuntuacion(int posicion){
            return puntuacionesLista.get(posicion);
        }

        List<Puntuaciones> puntuacionesLista;

        @NonNull
        @Override
        public PuntuacionesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new PuntuacionesViewHolder(ViewholderPuntuacionesBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(PuntuacionesViewHolder holder, int position) {

            Puntuaciones puntuaciones = puntuacionesLista.get(position);
            holder.binding.usernamePuntuaciones.setText(puntuaciones.username);
            holder.binding.numeroPuntuacion.setText(String.valueOf(puntuaciones.score));
            Glide.with(requireContext()).load(puntuaciones.profileImageURL).into(holder.binding.playerIMG);

        }

        void establecerPuntuacionesList(List<Puntuaciones> puntuacionesLista) {
            this.puntuacionesLista = puntuacionesLista;
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            return puntuacionesLista == null ? 0 : puntuacionesLista.size();
        }

        class PuntuacionesViewHolder extends RecyclerView.ViewHolder {
            private final ViewholderPuntuacionesBinding binding;

            public PuntuacionesViewHolder(ViewholderPuntuacionesBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
        }
    }
}