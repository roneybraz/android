package com.example.televideo.trabalho_produto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;

public class Main extends AppCompatActivity {
    private ArrayList<String> listSalve = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
             listSalve = savedInstanceState.getStringArrayList("lista");
        }else {
             listSalve = new ArrayList<String>();
        }



        Bundle args = getIntent().getExtras();
        final String nomeLista = args.getString("resultado");

        final ArrayList<Produtos> produto = new ArrayList<>();

        final ListView lista = (ListView)findViewById(R.id.man_listProduto);

        final ArrayAdapter adpter = new ProdutoAdapter(this, R.layout.linha, produto);



        final Spinner spinner = (Spinner) findViewById(R.id.main_spinnerCategoria);
        final List<String> list = new ArrayList<String>();
        list.add("Alimentos");
        list.add("Bebidas");
        list.add("Carne");
        list.add("Frios");
        list.add("Laticínios");
        list.add("Frutas");
        list.add("Verdura");
        list.add("Legumes");
        list.add("Higiene");
        list.add("Limpeza");
        list.add("Padaria");
        list.add("Outros");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        final CheckBox checkPerecivel=(CheckBox)findViewById(R.id.main_checkPerecivel);



        Button btnSalvar = (Button)findViewById(R.id.main_bntSalvar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText txtProduto = (EditText)findViewById(R.id.main_txtProduto);
                EditText txtQuatidade=(EditText)findViewById(R.id.main_txtQuant);
                String categoria= String.valueOf(spinner.getSelectedItem());
                boolean check_Perecivel = checkPerecivel.isChecked();
                String perecivel;

                if(check_Perecivel) perecivel="Sim";
                else perecivel="Não";



                String nomeproduto= txtProduto.getText().toString();
                int quatidade= Integer.parseInt(txtQuatidade.getText().toString());


                Produtos p = new Produtos(quatidade,nomeproduto,categoria,nomeLista.toString(),perecivel);
                produto.add(p);
                lista.setAdapter(adpter);








            }


        });









}



}
