package com.petagram.carlos.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;
    ActionMenuView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);
        menu = (ActionMenuView) findViewById(R.id.amvMenu);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        InicializarListaMascotasFavoritas();
        inicializarAdaptador();

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MascotasFavoritas.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

    public void InicializarListaMascotasFavoritas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Balú", R.drawable.balu, "0"));
        mascotas.add(new Mascota("Beli", R.drawable.beli, "0"));
        mascotas.add(new Mascota("Chiki", R.drawable.chiki, "0"));
        mascotas.add(new Mascota("Felpudín", R.drawable.felpudin, "0"));
        mascotas.add(new Mascota("Juan", R.drawable.juan, "0"));
    }
}
