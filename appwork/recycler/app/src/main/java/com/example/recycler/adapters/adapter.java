package com.example.recycler.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.R;
import com.example.recycler.models.contacto;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.VH> {

    List<contacto> contactos;
    public adapter(List<contacto>contactos){
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public adapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        VH vh=new VH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.VH holder, int position) {

        String name = contactos.get(position).getName();
        int img = contactos.get(position).getImg();

        holder.nombre.setText(name);
        holder.perfil.setImageResource(img);

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView nombre;
        ImageView perfil;
        public VH(@NonNull View v) {
            super(v);
            nombre=v.findViewById(R.id.nameUser);
                    perfil=v.findViewById(R.id.profile);
        }
    }
}
