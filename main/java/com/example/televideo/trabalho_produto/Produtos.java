package com.example.televideo.trabalho_produto;

/**
 * Created by Televideo on 24/09/2017.
 */

public class Produtos {

    private int quantidade;
    private String nome_produto;
    private String categoria;
    private String nome_lista;

    public String getCheckPerecivel() {
        return checkPerecivel;
    }

    public void setCheckPerecivel(String checkPerecivel) {
        this.checkPerecivel = checkPerecivel;
    }

    private String checkPerecivel;


    public Produtos(int quantidade,String nome_produto, String categoria, String nome_lista,String checkPerecivel) {

        this.quantidade = quantidade;
        this.nome_produto = nome_produto;
        this.categoria = categoria;
        this.nome_lista = nome_lista;
        this.checkPerecivel = checkPerecivel;
    }




    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome_lista() {
        return nome_lista;
    }

    public void setNome_lista(String nome_lista) {
        this.nome_lista = nome_lista;
    }







}
