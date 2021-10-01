package com.example.ucem.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ucem.R;
import com.example.ucem.RecyclerItemClickListener;
import com.example.ucem.adapter.Adapter;
import com.example.ucem.model.Livro;

import java.util.ArrayList;
import java.util.List;

import static com.example.ucem.R.id.recyclerViewCapitulos;

public class MenuCapitulos extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Livro> listaCapitulos = new ArrayList<>();

    public MenuCapitulos() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter = new Adapter(listaCapitulos);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewCapitulos);
        this.criarCapitulos();


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //clique

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Livro livro = listaCapitulos.get(position);

                                Toast.makeText(
                                        getApplicationContext(),
                                        livro.getTituloCapitulo(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Livro livro = listaCapitulos.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Capítulo " +  livro.getNumeroCapitulo(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );



    }

    public void criarCapitulos(){

        Livro livro =  new Livro("O significado dos milagres","1");
        this.listaCapitulos.add( livro);

        livro  =  new Livro("A separação e a expiação","2");
        this.listaCapitulos.add( livro);

        livro  =  new Livro("A percepção inocente","3");
        this.listaCapitulos.add( livro);

        livro =  new Livro("As ilusões do ego","4");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Cura e integridade","5");
        this.listaCapitulos.add( livro);

        livro =  new Livro("As lições de Amor","6");
        this.listaCapitulos.add( livro);

        livro =  new Livro("As dádivas do Reino","7");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A jornada de volta","8");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A aceitação da expiação","9");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Os ídolos da doença","10");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Deus ou o ego","11");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O currículo do Espirito Santo","12");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O mundo sem culpa","13");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Ensinando a favor da verdade","14");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O instante santo","15");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O perdão das ilusões","16");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O perdão e o relacionamento santo","17");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A passagem do sonho","18");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Alcançar a Paz","19");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A visão da sanidade","20");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Razão e percepção","21");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A salvação e o relacionamento santo","22");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A guerra contra ti mesmo","23");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A meta do especialismo","24");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A justiça de Deus","25");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A transição","26");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A cura do sonho","27");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Desfazer o medo","28");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O despertar","29");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O novo começo","30");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A visão final","31");
        this.listaCapitulos.add( livro);


    }

    }