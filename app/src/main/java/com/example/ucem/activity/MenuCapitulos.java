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
                                        "Cap??tulo " +  livro.getNumeroCapitulo(),
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

        livro  =  new Livro("A separa????o e a expia????o","2");
        this.listaCapitulos.add( livro);

        livro  =  new Livro("A percep????o inocente","3");
        this.listaCapitulos.add( livro);

        livro =  new Livro("As ilus??es do ego","4");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Cura e integridade","5");
        this.listaCapitulos.add( livro);

        livro =  new Livro("As li????es de Amor","6");
        this.listaCapitulos.add( livro);

        livro =  new Livro("As d??divas do Reino","7");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A jornada de volta","8");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A aceita????o da expia????o","9");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Os ??dolos da doen??a","10");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Deus ou o ego","11");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O curr??culo do Espirito Santo","12");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O mundo sem culpa","13");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Ensinando a favor da verdade","14");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O instante santo","15");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O perd??o das ilus??es","16");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O perd??o e o relacionamento santo","17");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A passagem do sonho","18");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Alcan??ar a Paz","19");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A vis??o da sanidade","20");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Raz??o e percep????o","21");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A salva????o e o relacionamento santo","22");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A guerra contra ti mesmo","23");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A meta do especialismo","24");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A justi??a de Deus","25");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A transi????o","26");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A cura do sonho","27");
        this.listaCapitulos.add( livro);

        livro =  new Livro("Desfazer o medo","28");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O despertar","29");
        this.listaCapitulos.add( livro);

        livro =  new Livro("O novo come??o","30");
        this.listaCapitulos.add( livro);

        livro =  new Livro("A vis??o final","31");
        this.listaCapitulos.add( livro);


    }

    }