package com.petagram.carlos.petagram;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;
    ActionMenuView favoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        favoritos = (ActionMenuView) findViewById(R.id.amvFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this, 2);

        listaMascotas.setLayoutManager(llm);
        InicializarListaMascotas();
        inicializarAdaptador();

        favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
                startActivity(intent);
            }
        });
    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void InicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Balú", R.drawable.balu, "0"));
        mascotas.add(new Mascota("Beli", R.drawable.beli, "0"));
        mascotas.add(new Mascota("Chiki", R.drawable.chiki, "0"));
        mascotas.add(new Mascota("Felpudín", R.drawable.felpudin, "0"));
        mascotas.add(new Mascota("Juan", R.drawable.juan, "0"));
        mascotas.add(new Mascota("Manchas", R.drawable.manchas, "0"));
        mascotas.add(new Mascota("Mia", R.drawable.mia, "0"));
        mascotas.add(new Mascota("Pepe", R.drawable.pepe, "0"));
        mascotas.add(new Mascota("Rodrigo", R.drawable.rodrigo, "0"));
        mascotas.add(new Mascota("Twinki", R.drawable.twinki, "0"));
    }
}
