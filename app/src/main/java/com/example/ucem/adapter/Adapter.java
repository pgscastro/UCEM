package com.example.ucem.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ucem.R;
import com.example.ucem.model.Livro;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Livro> listaCapitulos;
    public Adapter(List<Livro> lista) {
        this.listaCapitulos = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_capitulos,parent,false);



        return new MyViewHolder(itemList);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Livro livro = listaCapitulos.get(position);
        holder.titulo.setText(livro.getTituloCapitulo());
        holder.capitulo.setText("Capítulo"  + livro.getNumeroCapitulo());



    }

    @Override
    public int getItemCount() {
        return listaCapitulos.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView titulo;
        TextView capitulo;

        public MyViewHolder(View itemView) {


            super(itemView);
            titulo = itemView.findViewById(R.id.textTitulo);
            capitulo = itemView.findViewById(R.id.textCapitulo);


        }
    }

}
