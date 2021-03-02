package com.example.spashscreen2.NavigationFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.spashscreen2.Model.Puntuaciones;
import com.example.spashscreen2.Model.PuntuacionesViewModel;
import com.example.spashscreen2.R;
import com.example.spashscreen2.databinding.FragmentPuntuacionesBinding;
import com.example.spashscreen2.databinding.ViewholderPuntuacionesBinding;

import java.util.List;


public class PuntuacionesFragment extends Fragment {

    private FragmentPuntuacionesBinding binding;
    AdapterPuntuaciones adapterPuntuaciones;
    private PuntuacionesViewModel puntuacionesViewModel;
    private NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentPuntuacionesBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        puntuacionesViewModel = new ViewModelProvider(requireActivity()).get(PuntuacionesViewModel.class);
        navController = Navigation.findNavController(view);

        binding.navegarAddAmigo.setOnClickListener(v -> navController.navigate(R.id.action_puntuacionesFragment_to_addFriendFragment));

        adapterPuntuaciones = new AdapterPuntuaciones();
        binding.recyclerViewPuntuaciones.setAdapter(adapterPuntuaciones);

        puntuacionesViewModel.obtener().observe(getViewLifecycleOwner(), adapterPuntuaciones::establecerPuntuacionesList);

        /*binding.buscarAmigos.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                puntuacionesViewModel.establecerTerminoBusqueda(newText);
                return false;
            }
        });*/


    }

    class AdapterPuntuaciones extends RecyclerView.Adapter<AdapterPuntuaciones.PuntuacionesViewHolder> {

        List<Puntuaciones> puntuacionesLista;

        @NonNull
        @Override
        public PuntuacionesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new PuntuacionesViewHolder(ViewholderPuntuacionesBinding.inflate(getLayoutInflater(), parent, false));
        }

        @Override
        public void onBindViewHolder(PuntuacionesViewHolder holder, int position) {
            Puntuaciones p = puntuacionesLista.get(position);
            holder.binding.usernamePuntuaciones.setText(p.username);
            holder.binding.numeroPuntuacion.setText(p.score);
            Glide.with(requireContext())
                    .load(p.profileImageURL)
                    .transform(new RoundedCorners(64))
                    .into(holder.binding.playerIMG);

            holder.itemView.setOnLongClickListener(v -> {
                puntuacionesViewModel.eliminarPuntuacion(p);
                return true;
            });
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